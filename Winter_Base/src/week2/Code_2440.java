package week2;

import java.util.Scanner;

/*별 찍기 - 3 

문제 
첫째 줄에는 별 N개, 둘째 줄에는 별 N-1개, ..., N번째 줄에는 별 1개를 찍는 문제
입력 
첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
출력 
첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
예제 입력 1 복사 
5
예제 출력 1 복사 
*****
****
***
**
*  */
public class Code_2440 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] star = new String[n];
		for(int i=0; i<n;i++) { //star의 배열에 "*"를 입력받고 싶은 갯수 만큼 입력.
			star[i]="*";
		}
		for(int i=n-1; i>=0; i--) { //0부터 n-1 인덱스 까지 중 어디까지 선택할 것인가를 선택
			for(int j=0; j<=i; j++ ) { //점차 개수를 줄여가면서 별 출력 해줌
				System.out.print(star[j]);
				
			}
			System.out.println();
		}
	}

}
