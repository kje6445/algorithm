package week5;

import java.util.Scanner;

/*소수 찾기 


문제
 

주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.


입력
 

첫 줄에 수의 개수 N이 주어진다. N은 100이하이다. 다음으로 N개의 수가 주어지는데 수는 1,000 이하의 자연수이다.

출력
 

주어진 수들 중 소수의 개수를 출력한다.






예제 입력 1 복사 
 4
1 3 5 7




예제 출력 1 복사 
 3
*/
public class Code_1978 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		int i=0;
		int count;
		while(i==N) {
			count=0;
			if(arr[i]==1) {
				System.out.println(arr[i]+" ");
			}else if(arr[i]%i==0) {
				count+=1;
			}
			i++;
		}
	}

}
