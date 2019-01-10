package week2;

import java.util.Scanner;

/*
2007년 


문제
 

오늘은 2007년 1월 1일 월요일이다. 그렇다면 2007년 x월 y일은 무슨 요일일까? 이를 알아내는 프로그램을 작성하시오.


입력
 

첫째 줄에 빈 칸을 사이에 두고 x(1≤x≤12)와 y(1≤y≤31)이 주어진다. 참고로 2007년에는 1, 3, 5, 7, 8, 10, 12월은 31일까지, 4, 6, 9, 11월은 30일까지, 2월은 28일까지 있다.


출력
 

첫째 줄에 x월 y일이 무슨 요일인지에 따라 SUN, MON, TUE, WED, THU, FRI, SAT중 하나를 출력한다.


예제 입력 1 복사 
 1 1


예제 출력 1 복사 
 MON



예제 입력 2 복사 
 3 14


예제 출력 2 복사 
 WED



예제 입력 3 복사 
 9 2


예제 출력 3 복사 
 SUN



예제 입력 4 복사 
 12 25


예제 출력 4 복사 
 TUE

*/
public class Code_1924 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt(); // 월을 입력하여 출력
		int y = sc.nextInt(); // 일을 입력해 출력
		int rest; // 7일로 나눈 나머지

		// 2007년의 1월 1일은 월요일
		// 한달이 31일 -> 1,3,5,7,8,10,12
		// 한달이 30일 -> 4,6,9,11
		// 한달이 28일 -> 2월

		// 31일과 30의 기준점을 무엇으로 둘 것인가. -> 7월까지를 기준으로 홀수 + 8월 부터 짝수이면 31일 / 반대면 한달이 30일
		// 위의 방법이 if절로서 나타내기 복잡하면 그냥 case로 달을 선택해서 문제 출력하는 방법도 있다.
		// 기본로직 -> 1월 1일은 월요일로 시작하며 2월 1일은 목요일로 시작 
		// 1주일은 7일

		if(x==1) {
		// 요일을 영어명으로 출력
			switch (y%7) {
			case 1:
				System.out.println("Mon");
				break;
			case 2:
				System.out.println("TUE");
				break;
			case 3:
				System.out.println("WED");
				break;
			case 4:
				System.out.println("THU");
				break;
			case 5:
				System.out.println("FRI");
				break;
			case 6:
			    System.out.println("SAT");
			    break;	
			default: 
			    System.out.println("SUN");
			    break;	

			}
		}

	}

}
