package week3;

import java.util.Scanner;

/*최대공약수와 최소공배수

문제
두 개의 자연수를 입력받아 최대 공약수와 최소 공배수를 출력하는 프로그램을 작성하시오.

입력
첫째 줄에는 두 개의 자연수가 주어진다. 이 둘은 10,000이하의 자연수이며 사이에 한 칸의 공백이 주어진다.

출력
첫째 줄에는 입력으로 주어진 두 수의 최대공약수를,둘째 줄에는 입력으로 주어진 두 수의 최소 공배수를 출력한다.

예제 입력 1 
24 18
예제 출력 1 
6
72*/
public class Main_2609 {
	//유클리드 최대공약수 알고리즘
	static int 최대공약수(int a, int b) {
		while(a != 0) {
			if(b > a) { // 둘의 빼기로 값을 정하기 
				int t =a;
				a = b;
				b = t;
			}
			a= a - b;
		}
		return b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner sc = new Scanner(System.in)){
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(최대공약수(a,b));
			int 최소공배수 = a*b/최대공약수(a,b);
			System.out.println(최소공배수);
		}
	}

}
