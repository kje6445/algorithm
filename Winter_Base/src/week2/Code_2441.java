package week2;

import java.util.Scanner;

/*별 찍기 - 4 

문제 
첫째 줄에는 별 N개, 둘째 줄에는 별 N-1개, ..., N번째 줄에는 별 1개를 찍는 문제
하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.
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
    *   */
public class Code_2441 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] star = new String[n]; //star 배열 생성 
		for(int i=0; i<n;i++) {
			star[i]="*";
		}
		
		for(int i=0; i<n; i++) { //n회 반복 -> 5입력시 5줄 출력 
			for(int k=0; k<n; k++) {//별들을 출력하는 반복문
				System.out.print(star[k]); 
				star[0]=" ";
				for(int empty=k; empty<i; empty++ ) { //배열의 앞부분에서 부터 하나씩 공백을 넣어준다. 
					star[empty]=" ";
				}
			}
			System.out.println();
		}
		
	}

}
