package lesson01;
import java.util.*;
/*
행렬 

문제
 

0과 1로만 이루어진 행렬 A와 행렬 B가 있다. 이때, 행렬 A를 행렬 B로 바꾸는데 필요한 연산의 횟수의 최솟값을 구하는 프로그램을 작성하시오.

행렬을 변환하는 연산은 어떤 3*3크기의 부분 행렬에 있는 모든 원소를 뒤집는 것이다. (0 -> 1, 1 -> 0)




입력
 

첫째 줄에 행렬의 크기 N M이 주어진다. N과 M은 50보다 작거나 같은 자연수이다. 둘째 줄부터 N개의 줄에는 행렬 A가 주어지고, 그 다음줄부터 N개의 줄에는 행렬 B가 주어진다.




출력
 

첫째 줄에 문제의 정답을 출력한다. 만약 A를 B로 바꿀 수 없다면 -1을 출력한다.






예제 입력 1 복사 
 3 4
0000
0010
0000
1001
1011
1001




예제 출력 1 복사 
 2

*/
public class Code_1080 {
// A와 B 비교 값을 저장 한 check배열로서 문제르 푼다 같은것으로 되어있으면 true/ 아니면 false로 구성되어있다.
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		char[][] A = new char[n][m];
		boolean[][] check = new boolean[n][m]; //짝수 false 홀수 true

		//A배열 생성
		for(int i=0; i< n; i++) {
			A[i] = sc.next().toCharArray();
		}
		//B배열 생성 및 A배열과의 비교 -> 동일할 경우  짝수번/ 아니면 홀수번 뒤집힌다.
		int diff = 0;
		for(int i=0; i< n; i++) {
			char[] B = sc.next().toCharArray();
			for(int j =0; j < m; j++) {
				if(B[j] != A[i][j]) {
					check[i][j] = true;
					diff++;
				}
			}
		}
		if(diff == 0)
			System.out.println(0);
		else
			System.out.println(getAnswer(check));
	}

	static int getAnswer(boolean[][] check) {
		int n = check.length;
		int m = check[0].length;
		
		if(n<3 || m<3)
			return -1;
		int count =0;
		for(int i=0; i<=n-3; i++) {
			for(int j =0; j<=m-3; j++) {
				//마지막 3개가 다 다를 경우 불가능하다.
				if(i ==n-3 && !(check[i][j] == check[i + 1][j] && check[i + 2][j]))
					return -1;
				if(i ==m-3 && !(check[i][j] == check[i ][j+ 1] && check[i ][j+ 2]))
					return -1;
				//가능한 경우 홀수 일때 3x3을 모두 뒤집는다.
				if(check[i][j]) {
					reverse(check,i,j);
					count++;
				}
			}
		}
		boolean flag = check[n-3][m-3];
		for(int i =n-1; i> n-3; i--) {
			for(int j = m-1; j>n-3; j--) {
				if(flag != check[i][j]) return -1;
			}
		}
		return count;
	}
	static void reverse(boolean[][] check, int x, int y) {
		for(int i=x; i<x+3; i++) {
			for(int j =y; j< y+3; j++) {
				check[i][j] = !check[i][j];
			}
		}
	}
}
