package week3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

/*배수와 약수 

문제
 

4 × 3 = 12이다.

이 식을 통해 다음과 같은 사실을 알 수 있다.

3은 12의 약수이고, 12는 3의 배수이다.

4도 12의 약수이고, 12는 4의 배수이다.

두 수가 주어졌을 때, 다음 3가지 중 어떤 관계인지 구하는 프로그램을 작성하시오.
1.첫 번째 숫자가 두 번째 숫자의 약수이다.
2.첫 번째 숫자가 두 번째 숫자의 배수이다.
3.첫 번째 숫자가 두 번째 숫자의 약수와 배수 모두 아니다.


입력
 
입력은 여러 테스트 케이스로 이루어져 있다. 각 테스트 케이스는 10,000이 넘지않는 두 자연수로 이루어져 있다. 마지막 줄에는 0이 2개 주어진다. 두 수가 같은 경우는 없다.


출력
 
각 테스트 케이스마다 첫 번째 숫자가 두 번째 숫자의 약수라면 factor를, 배수라면 multiple을, 둘 다 아니라면 neither를 출력한다.

예제 입력 1 복사 
 8 16
32 4
17 5
0 0

예제 출력 1 복사 
 factor
multiple
neither

*/
public class Main_5086 {
	public static void main(String[] args) throws ArithmeticException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		// 약수를 구하는 방법 -> 큰 수를 작은 수로 나눠본다. 나머지가 0이면 ok
		// 배수를 구하는 방법 -> for문을 돌려서 작은 수를 순차적으로 곱했을 때 큰 수랑 같게 나오면 stop.
		boolean check = true;

		while (check) {
			a = sc.nextInt();
			b = sc.nextInt();


			if ((a != 0) && (b != 0) && (a >= b) && (a % b == 0)) {
				System.out.println("multiple");
			} else if ((a != 0) && (b != 0) && (a < b) && (b % a == 0)) {
				System.out.println("factor");
			} else if((a == 0) && (b == 0)) {
				check = false;
			}else {
				System.out.println("neither");
			}
			
		}
		//((a == 0) || (b != 0))||((a != 0) || (b == 0))||((a != 0) && (b != 0))
	}
}
