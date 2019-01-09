package week2;

import java.util.Scanner;

/*별 찍기 - 2 

문제 
첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.
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
public class Code_2439 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		//방법: 처음 시작 부터 "*"이 출력됨으로 공백을 n의 개수보다 1개 적게 해서 채워 넣어 출력한다.
		//     공백의 뒤에 *을 삽입한다. -> 따라서 오른쪽 정렬이 완성된다.
		//System.out.println();을 통해 다음 문자으로 이동
		for(int i=n; i>0; i--) {
			for(int j=i-1; j>0; j--) {
				System.out.print(" ");
			}
			for(int k=i;k<=n;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
