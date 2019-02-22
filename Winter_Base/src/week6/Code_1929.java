package week6;

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
		//한 줄에 하나씩, 증가하는 순서대로 소수를 출력하라 
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		//M 과 N 사이의 수를 소수를 구한다. -> 소수는 자기 자신보다 작은 수들로 나눠서 하나라도 나눠지면 소수가 아니다.
		// 즉 하나라도 나눠지면 반복문을 탈출해서 소수라고 구해준다.
	}

}
