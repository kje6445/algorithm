package may_week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*소수 
 

문제
 

자연수 M과 N이 주어질 때 M이상 N이하의 자연수 중 소수인 것을 모두 골라 이들 소수의 합과 최솟값을 찾는 프로그램을 작성하시오.
예를 들어 M=60, N=100인 경우 60이상 100이하의 자연수 중 소수는 61, 67, 71, 73, 79, 83, 89, 97 총 8개가 있으므로, 이들 소수의 합은 620이고, 최솟값은 61이 된다.




입력
 
입력의 첫째 줄에 M이, 둘째 줄에 N이 주어진다.
M과 N은 10,000이하의 자연수이며, M은 N보다 작거나 같다.


출력

M이상 N이하의 자연수 중 소수인 것을 모두 찾아 첫째 줄에 그 합을, 둘째 줄에 그 중 최솟값을 출력한다. 
단, M이상 N이하의 자연수 중 소수가 없을 경우는 첫째 줄에 -1을 출력한다.



예제 입력 1 복사 
 60
100


예제 출력 1 복사 
 620
61



예제 입력 2 복사 
 64
65


예제 출력 2 복사 
 -1*/

public class Code_2581 {

	public static void main(String[] args) throws NumberFormatException, IOException{
		// TODO Auto-generated method stub

//		Scanner sc = new Scanner(System.in);
//		int M = sc.nextInt();
//		int N  = sc.nextInt(); // 한 칸을 띄고 적어도 두개의 수로 적용된다.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		//소수를 구하는 방법을 보다 일반적으로 boolean을 사용해 문제를 해결하고 숙지한다.
		
		int count=0, sum=0, min=0; 
		for(int i=M; i<=N; i++) {
			if(isPrime(i)) { // isPrime함수를 사용해서 소수인지 판별하고 소수라면 아래와 같은 문장 이행
				sum+=i;	//소수의 합을 더하라
				count++; //소수의 개수를 합하라
				if(min == 0) {
					min = i;
				}
			}
		}
		
		if(count > 0) {
			System.out.println(sum); 
			System.out.println(min);
		}else {
			System.out.println(-1);  
		}
	}

	public static boolean isPrime(int num) {
		boolean isPrime = true;
		for(int i=2; i<num; i++) {
			if(num%i==0 ) {
				isPrime = false; //나눠진다면 소수가 아니다.
				break;
			}
		}
		return (isPrime && num > 1)? true : false; // 소수는 1보다 커야한다. 즉 1은 소수가 될 수 없다. 
	}
}
