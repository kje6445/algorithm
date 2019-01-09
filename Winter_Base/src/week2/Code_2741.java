package week2;

import java.util.Scanner;

/*N 찍기 

문제 
자연수 N이 주어졌을 때, 1부터 N까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
입력 
첫째 줄에 100,000보다 작거나 같은 자연수 N이 주어진다.
출력 
첫째 줄부터 N번째 줄 까지 차례대로 출력한다.
예제 입력 1 복사 
5
예제 출력 1 복사 
1
2
3
4
5*/
public class Code_2741 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println(i);
		}
		
	}

}
