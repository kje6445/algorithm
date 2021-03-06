package week4;

import java.util.Scanner;

/*
벌집 




문제
 



위의 그림과 같이 육각형으로 이루어진 벌집이 있다. 그림에서 보는 바와 같이 중앙의 방 1부터 시작해서 이웃하는 방에 돌아가면서 1씩 증가하는 번호를 주소로 매길 수 있다. 숫자 N이 주어졌을 때, 벌집의 중앙 1에서 N번 방까지 최소 개수의 방을 지나서 갈 때 몇 개의 방을 지나가는지(시작과 끝을 포함하여)를 계산하는 프로그램을 작성하시오. 예를 들면, 13까지는 3개, 58까지는 5개를 지난다.




입력
 

첫째 줄에 N(1 ≤ N ≤ 1,000,000,000)이 주어진다.




출력
 

입력으로 주어진 방까지 최소 개수의 방을 지나서 갈 때 몇 개의 방을 지나는지 출력한다.






예제 입력 1 복사 
 13





예제 출력 1 복사 
 3

*/
public class Code_2292 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		//계차수열 a열, 등차수열인 bn = 6n 
		//an = a(n-1)+b(n-1)
		//end의 값을 입력 받는다.
		int end=sc.nextInt();
		int number=1;
		int cnt=1; //카운트
		
		while(number<end) { //도착지 숫자보다 높으면 break;
			number += cnt*6; //현재 위치 1+6*cnt씩 증가.
			cnt++;
		}
		System.out.println(cnt);
	}

}
