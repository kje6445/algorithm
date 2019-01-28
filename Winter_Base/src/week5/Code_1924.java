package week5;

import java.util.Scanner;

/*2007년 


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
		//요일 계산하기 
		Scanner sc = new Scanner(System.in);
		// 월과 일을 입력받는다.
		int m  = sc.nextInt();
		int d = sc.nextInt();
		
		int[] mdays = new int[13]; //월을 입력받고 달의 일 수 를 입력 받는다.
		mdays[1]=mdays[3]=mdays[5]=mdays[7]=mdays[8]=mdays[10]=mdays[12]=31; 
		mdays[4]=mdays[6]=mdays[9]=mdays[11] = 30;
		mdays[2]= 28;
		//요일을 계산하기 위해서 각 달의 합을 더한다.
		int sum = 0;
		
		for(int i=1; i<=12; i++) {
			if(i == m)
				break;
			sum +=mdays[i];
		}
		
		sum+=d;
		
		switch(sum % 7){
		case 0:
			System.out.println("SUN");
			break;
		case 1:
			System.out.println("MON");
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
		}
	}

}
