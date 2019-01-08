package week2;

import java.util.Scanner;

/*나머지 

문제 
(A+B)%C는 (A%C + B%C)%C 와 같을까?
(A×B)%C는 (A%C × B%C)%C 와 같을까?
세 수 A, B, C가 주어졌을 때, 위의 네 가지 값을 구하는 프로그램을 작성하시오.
입력 
첫째 줄에 A, B, C가 순서대로 주어진다. (2 ≤ A, B, C ≤ 10000)
출력 
첫째 줄에 (A+B)%C, 둘째 줄에 (A%C + B%C)%C, 셋째 줄에 (A×B)%C, 넷째 줄에 (A%C × B%C)%C를 출력한다.
예제 입력 1 복사 
5 8 4
예제 출력 1 복사 
1
1
0
0*/
public class Code_10430 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int A,B,C;
		A=sc.nextInt(); B=sc.nextInt(); C=sc.nextInt();
		for(int i=0;i<4;i++) {
			if(i==1) {
				System.out.println((A%C + B%C)%C);
			}
			else if(i==2) {
				System.out.println((A*B)%C);
			}
			else if(i==3) {
				System.out.println( ((A%C) * (B%C))%C);
			}
			else {
				System.out.println((A+B)%C);
			}
		}
		
	}

}
