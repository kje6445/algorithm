package week2;

import java.util.Scanner;

/*
시험 성적 

문제
 

시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.

입력
 

첫째 줄에 시험 점수가 주어진다. 시험 점수는 0보다 크거나 같고, 100보다 작거나 같은 자연수이다.




출력
 

시험 성적을 출력한다.






예제 입력 1 복사 
 100





예제 출력 1 복사 
 A

*/
public class Code_9498 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int score=sc.nextInt();
		if((score<=100)&&(90<=score)) {
			System.out.println("A");
		}else if((score<=89)&&(80<=score)) {
			System.out.println("B");
		}else if((score<=79)&&(70<=score)) {
			System.out.println("C");
		}else if((score<=69)&&(60<=score)) {
			System.out.println("D");
		}else
			System.out.println("F");
	}

}
