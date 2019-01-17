package week3;

import java.util.Scanner;

/*
음계 

문제
 

다장조는 c d e f g a b C, 총 8개 음으로 이루어져있다. 이 문제에서 8개 음은 다음과 같이 숫자로 바꾸어 표현한다. c는 1로, d는 2로, ..., C를 8로 바꾼다.

1부터 8까지 차례대로 연주한다면 ascending, 8부터 1까지 차례대로 연주한다면 descending, 둘 다 아니라면 mixed 이다.

연주한 순서가 주어졌을 때, 이것이 ascending인지, descending인지, 아니면 mixed인지 판별하는 프로그램을 작성하시오.




입력
 

첫째 줄에 8개 숫자가 주어진다. 이 숫자는 문제 설명에서 설명한 음이며, 1부터 8까지 숫자가 한 번씩 등장한다.




출력
 

첫째 줄에 ascending, descending, mixed 중 하나를 출력한다.






예제 입력 1 복사 
 1 2 3 4 5 6 7 8





예제 출력 1 복사 
 ascending







예제 입력 2 복사 
 8 7 6 5 4 3 2 1





예제 출력 2 복사 
 descending







예제 입력 3 복사 
 8 1 7 2 6 3 5 4





예제 출력 3 복사 
 mixed

*/
public class Code_2920 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 숫자를 바꿔서 표현해야된다 -> c d e f g a b C ->1,2,3,4,5,6,7,8
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[8]; //입력 받는 배열
		int[] arr1 = new int[8];
		int[] arr2 = new int[8];
		int[] ex = new int[8]; //비교해서 맞으면 체크를 해서 입력 받는 배열 
		// arr과 비교해서 arr1과 같으면 1, arr2과 같으면 2를 입력 받고 다른거면 -1를 입력해서 받음.
		// sum으로 합 해서 arr1과 arr2로 분석해서 출력
		for(int i=0; i<8; i++) {
			arr1[i]=i+1;
		}
		int j=0;
		for(int i=8; i>0; i--) {
			arr2[j]=i;
			++j;
		}
		int k=0;
		for (int i = 0; i < 8; i++) {
			arr[i] = sc.nextInt();
		}

		// 순차적으로 커지는 걸 어떻게 생각을 할것인가?
		for(int i=0; i<8; i++) {
			int num = arr[i];
			if(num==arr1[i])
				ex[i]=1;
			else if(num==arr2[i])
				ex[i]=2;
			else
				ex[i]=-1;
		}
		int sum=0;
		for(int i=0; i<8; i++) {
			if(ex[i]==-1) {
				System.out.println("mixed");
				break;
			}
			sum+=ex[i];
			if(i==7) {
				if(sum==8)
				System.out.println("ascending");
				else if(sum==16)
				System.out.println("descending");
				else
				System.out.println("mixed");
			}
		}

	}

}