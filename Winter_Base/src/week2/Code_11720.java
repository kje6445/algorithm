package week2;

import java.util.Scanner;

/*
숫자의 합 

문제
 

N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.


입력
 

첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.


출력
 

입력으로 주어진 숫자 N개의 합을 출력한다.






예제 입력 1 복사 
 1
1





예제 출력 1 복사 
 1







예제 입력 2 복사 
 5
54321





예제 출력 2 복사 
 15







예제 입력 3 복사 
 25
7000000000000000000000000





예제 출력 3 복사 
 7







예제 입력 4 복사 
 11
10987654321





예제 출력 4 복사 
 46

*/
public class Code_11720 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//두번째 줄에 출력되는 수는 모두 한자리수로 가정하여 문제를 풀이한다.
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(); //입력받고 싶은 숫자의 개수 
		int count=0;
		int sum=0;
		int[] nums = new int[n+1];
		int num;
		for(int i=1; i<=n; i++) {
			
			sum+=nums[i];
			count++;
			if(count==n)
				break;
		}
		System.out.println(sum);
	}

}
