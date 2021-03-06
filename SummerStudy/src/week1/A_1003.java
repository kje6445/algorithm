package week1;
import java.util.Scanner;
/*
피보나치 함수 

문제 설명
fibonacci(3)을 호출하면 다음과 같은 일이 일어난다.
•fibonacci(3)은 fibonacci(2)와 fibonacci(1) (첫 번째 호출)을 호출한다.
•fibonacci(2)는 fibonacci(1) (두 번째 호출)과 fibonacci(0)을 호출한다.
•두 번째 호출한 fibonacci(1)은 1을 출력하고 1을 리턴한다.
•fibonacci(0)은 0을 출력하고, 0을 리턴한다.
•fibonacci(2)는 fibonacci(1)과 fibonacci(0)의 결과를 얻고, 1을 리턴한다.
•첫 번째 호출한 fibonacci(1)은 1을 출력하고, 1을 리턴한다.
•fibonacci(3)은 fibonacci(2)와 fibonacci(1)의 결과를 얻고, 2를 리턴한다.

1은 2번 출력되고, 0은 1번 출력된다. N이 주어졌을 때, fibonacci(N)을 호출했을 때, 0과 1이 각각 몇 번 출력되는지 구하는 프로그램을 작성하시오.


첫째 줄에 테스트 케이스의 개수 T가 주어진다.

각 테스트 케이스는 한 줄로 이루어져 있고, N이 주어진다. N은 40보다 작거나 같은 자연수 또는 0이다.


출력

각 테스트 케이스마다 0이 출력되는 횟수와 1이 출력되는 횟수를 공백으로 구분해서 출력한다.

예제 입력 1 복사 
3
0
1
3

예제 출력 1 복사 
1 0
0 1
1 2
*/


public class A_1003 {
	
	private static int sumZero=0;
	private static int sumFirst=0;
	
	public static int fibonacci(int n) {
		if(n==0) {
			++sumZero; 
			return 0;
		}
		else if(n==1) {
			++sumFirst;
			return 1;
		}else {
		return fibonacci(n-1) + fibonacci(n-2);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//지금 컴파일 에러가 발생했다. -> 아마 엔터키로 다음키로 넘어가기때문일 것 같음
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int arr[] = new int[T];
		
		for(int i=0; i<T; i++) {
			arr[i]=sc.nextInt();
			fibonacci(arr[i]);
			System.out.println(sumZero + " "+ sumFirst);
			sumZero=0; sumFirst=0;
		}
		
	}
}
