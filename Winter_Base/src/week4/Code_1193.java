package week4;

import java.util.Scanner;

/*
분수찾기 


문제
 

무한히 큰 배열에 다음과 같이 분수들이 적혀있다.

1/1 1/2 1/3 1/4 1/5 … 
2/1 2/2 2/3 2/4 … … 
3/1 3/2 3/3 … … … 
4/1 4/2 … … … … 
5/1 … … … … … 
… … … … … … 

이와 같이 나열된 분수들을 1/1 -> 1/2 -> 2/1 -> 3/1 -> 2/2 -> … 과 같은 지그재그 순서로 차례대로 1번, 2번, 3번, 4번, 5번, … 분수라고 하자.

X가 주어졌을 때, X번째 분수를 구하는 프로그램을 작성하시오.




입력
 

첫째 줄에 X(1 ≤ X ≤ 10,000,000)가 주어진다.




출력
 

첫째 줄에 분수를 출력한다.






예제 입력 1 복사 
 14





예제 출력 1 복사 
 2/4

*/
public class Code_1193 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//입력 받는 수를 받는다.
		int x=sc.nextInt();
		//분자와 분모의 합과 그 합을 이루는 개수 사이에 규칙이 있다.
		int cnt=1;
		int sum=2;
		int remainder;
		int check=cnt;
		// x=cnt(cnt+1)/2 로 비교해 cnt의 번째 수를 구한다.
		
		while(x>cnt*(cnt+1)/2) {
			cnt++;
		}
		System.out.println("cnt의 값: "+(--cnt));
		
		sum=cnt+2;
		System.out.println("sum의 값: "+sum);
		
		//나머지의 수가 분모가 된다. 
		remainder= x-cnt*(cnt+1)/2;
		/*System.out.println("remainder의 값: "+remainder);*/
	
		//홀수, 짝수 경우를 나눠서 생각한다.
		if((check+1)%2==1)
		System.out.println((sum-remainder)+"/"+remainder);
		else
		System.out.println(remainder+"/"+(sum-remainder));
	}

}
