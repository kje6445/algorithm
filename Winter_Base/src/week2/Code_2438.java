package week2;

import java.util.Scanner;

/*별 찍기 - 1 

문제 
첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
입력 
첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
출력 
첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
예제 입력 1 복사 
5
예제 출력 1 복사 
*
**
***
****
******/
public class Code_2438 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		//String 임시 객체로 생성을 방지하고 메모리를 절약하기 위해서 StringBuffer와 append사용
		StringBuilder star = new StringBuilder("*");
		
		for(int i=1;i<=n;i++) {
			System.out.println(star);
			//star의 문자에 "*"추가 해주기 -> append 사용
			star.append("*");
		}
	
	}

}
