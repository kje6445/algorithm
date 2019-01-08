package week2;

import java.util.Scanner;

/*설탕 배달 

문제 
상근이는 요즘 설탕공장에서 설탕을 배달하고 있다. 상근이는 지금 사탕가게에 설탕을 정확하게 N킬로그램을 배달해야 한다. 설탕공장에서 만드는 설탕은 봉지에 담겨져 있다. 봉지는 3킬로그램 봉지와 5킬로그램 봉지가 있다.
상근이는 귀찮기 때문에, 최대한 적은 봉지를 들고 가려고 한다. 예를 들어, 18킬로그램 설탕을 배달해야 할 때, 3킬로그램 봉지 6개를 가져가도 되지만, 5킬로그램 3개와 3킬로그램 1개를 배달하면, 더 적은 개수의 봉지를 배달할 수 있다.
상근이가 설탕을 정확하게 N킬로그램 배달해야 할 때, 봉지 몇 개를 가져가면 되는지 그 수를 구하는 프로그램을 작성하시오.
입력 
첫째 줄에 N이 주어진다. (3 ≤ N ≤ 5000)
출력 
상근이가 배달하는 봉지의 최소 개수를 출력한다. 만약, 정확하게 N킬로그램을 만들 수 없다면 -1을 출력한다.
예제 입력 1 복사 
18
예제 출력 1 복사 
4
예제 입력 2 복사 
4
예제 출력 2 복사 
-1
예제 입력 3 복사 
6
예제 출력 3 복사 
2
예제 입력 4 복사 
9
예제 출력 4 복사 
3
예제 입력 5 복사 
11
예제 출력 5 복사 
3*/
public class Code_2839 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(); // 설탕을 배달하게 할 N킬로그램을 배달
		int num=0;//최종 봉지의 개수
		int three=0; int five=0; // 봉지는 3키로그램의 개수, 봉지는 5키로그램 봉지의 개수
		int rest=0;//남은 설탕
		
		//상근이가 배달하는 봉지의 최소 개수를 출력한다. 만약, 정확하게 N킬로그램을 만들 수 없다면 -1을 출력한다.
		five = n/5;
		rest = n%5;
		//five의 몫
		System.out.println("5로 나눈 몫 "+ five);
		//five의 나머지
		System.out.println("5로 나눈 나머지 "+rest);
		
		//나머지가 있다면 3키로그램의 봉지를 나눠준다.
		if(rest!=0) {
		if(five>0) {
		--five;
		rest+=5;}
		//3으로 나눠보자
		three = rest/3;
		rest = rest%3;
		//three의 몫
		System.out.println("3로 나눈 몫 "+ three);
		//three의 나머지
		System.out.println("3로 나눈 나머지 "+rest);
		if(rest!=0) {System.out.println("-1");}
		else {
		System.out.println(three + five);}
		}else {
			System.out.println("-1");
		}
		
	}

}
