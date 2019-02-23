package week6;

import java.util.ArrayList;
import java.util.Scanner;

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
 -1

*/
public class Code_2581 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// * 문제 풀이 방식 -> 소수를 먼저 구한뒤 구한 소수를 배열에 입력해 넣고 합을 구할 때는 더하면서 출력, 최소값을 구할 때는 배열의
		// 제일 앞 수를 출력한다.
		Scanner sc = new Scanner(System.in);

		int M = sc.nextInt(); // 시작하는 수
		int N = sc.nextInt(); // 끝나는 수
		int check = 0; // 소수 여부 판별 값
		ArrayList primeNum = new ArrayList(); // 소수 저장할 ArrayList
		int sum = 0; // 소수들의 합

		for (int i = M; i <= N; i++) { // 입력받은 값 N 부터 입력 받은 값 M까지의 반복
			if ((i == 1)||(i==2)) {
				check = 1;
			} // 1일 경우 소수가 아니기 떄문

			for (int j = 2; j < i; j++) { // 2부터 자기보다 작은것으로 나누기 -> 나눠지면 소수가 아니다._소수 판별 위함
				if (i % j == 0) { // 나눠지게 되면 소수가 아니기 때문에
					check = 1;// 체크해 주기
					break; // if문 나가기
				}
			}
			if (check == 0) { // 내부 반복문 후에도 계속 check가 0으로 유지되면 소수이다.
				primeNum.add(i); // ArrayList에 소수를 추가해 입력 받아 저장한다.
				System.out.println("소수값 " + i);
				sum += i; // sum에 소수를 더해준다.
				System.out.println("합  " + sum);
			}
			check = 0; // check를 0으로 초기화
		}

		if (primeNum.size() == 0) { // 소수값이 없을 경우 -> ArrayList의 크기가 0
			System.out.println("-1"); // -1를 출력한다.
		} else {
			System.out.println(sum); // 합을 출력
			System.out.println(primeNum.get(0)); // 처음값
		}

	}

}
