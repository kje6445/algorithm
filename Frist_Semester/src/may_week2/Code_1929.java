package may_week2;

import java.util.Scanner;

/*
소수 구하기 

문제
 

M이상 N이하의 소수를 모두 출력하는 프로그램을 작성하시오.

입력
 

첫째 줄에 자연수 M과 N이 빈 칸을 사이에 두고 주어진다. (1 ≤ M ≤ N ≤ 1,000,000)



출력
 

한 줄에 하나씩, 증가하는 순서대로 소수를 출력한다.

예제 입력 1 복사 
 3 16

예제 출력 1 복사 
 3
5
7
11
13


 */
public class Code_1929 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//에라토스테네스의 체 -> 2배수 걸래내고 3의 배수 걸러내서 남는 수가 소수
		
		Scanner scan = new Scanner(System.in);
		int min = scan.nextInt(); //최소값 입력 받기
		int max = scan.nextInt(); //최대값 입력 받기
		
		int check=0; //소수인지 아닌지 확인하는 값
		
		for(int a=min; a<=max; a++) { //최소부터 최대까지
			if(a==1) {check=1;} //1일 경우 소수아닌것 처리
			int mmax =(int)Math.sqrt(a)+1; //에라토스테네스의 체
			for(int b=2; b<mmax; b++) { //2부터 자기의 제곱근까지 나눠보기
				if(a%b==0) { //나눠지면(소수가 아니면)
					check=1; //체크해주고
					break; //나가기
				}
			}
			
			if(check == 0) { //소수면
				System.out.println(a); //출력
			}
			check=0; //check 초기화
		}
	}

}
