package week2;
/*
세 수 




문제
 

세 정수 A, B, C가 주어진다. 이때, 두 번째로 큰 정수를 출력하는 프로그램을 작성하시오. 




입력
 

첫째 줄에 세 정수 A, B, C가 공백으로 구분되어 주어진다. (1 ≤ A, B, C ≤ 100)




출력
 

두 번째로 큰 정수를 출력한다.






예제 입력 1 복사 
 20 30 10





예제 출력 1 복사 
 20







예제 입력 2 복사 
 30 30 10





예제 출력 2 복사 
 30







예제 입력 3 복사 
 40 40 40





예제 출력 3 복사 
 40







예제 입력 4 복사 
 20 10 10





예제 출력 4 복사 
 10

*/

import java.util.Scanner;

public class Code_10817 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A,B,C;
		A=sc.nextInt();
		B=sc.nextInt();
		C=sc.nextInt();
		int  max=0;//제일 큰수
		int middlemax=0;// 두번째로 큰 수 
		for(int i=0; i<2; i++) {
			if(i==0) {
			if(A>=B) {
				max=A;
				middlemax=B;
			}else {
				max=B;
				middlemax=A;
			}}
			if(i==1) {
				if(max<=C) {
					middlemax=max;
					max=C;
				}else {
					if(middlemax<=C) {
						middlemax=C;
					}
				}
			}
			
		}
		System.out.println(middlemax);
	}

}
