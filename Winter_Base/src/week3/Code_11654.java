package week3;

import java.util.Scanner;

/*
아스키 코드 
 
문제
 

알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때, 주어진 글자의 아스키 코드값을 출력하는 프로그램을 작성하시오.




입력
 

알파벳 소문자, 대문자, 숫자 0-9 중 하나가 첫째 줄에 주어진다.




출력
 

입력으로 주어진 글자의 아스키 코드 값을 출력한다.






예제 입력 1 복사 
 A





예제 출력 1 복사 
 65







예제 입력 2 복사 
 C





예제 출력 2 복사 
 67







예제 입력 3 복사 
 0





예제 출력 3 복사 
 48







예제 입력 4 복사 
 9





예제 출력 4 복사 
 57







예제 입력 5 복사 
 a





예제 출력 5 복사 
 97







예제 입력 6 복사 
 z





예제 출력 6 복사 
 122

*/
public class Code_11654 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//입력 받을 수 있는 것 -> 알파벳 대소문자, 숫자
		Scanner sc = new Scanner(System.in);
		char a;
		
		a=sc.next().charAt(0);
		
		
		System.out.println((int)a);
		
	}

}