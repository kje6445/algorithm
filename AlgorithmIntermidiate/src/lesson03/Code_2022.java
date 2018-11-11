package lesson03;

import java.util.Scanner;

/*
사다리 

문제
 

아래의 그림과 같이 높은 빌딩 사이를 따라 좁은 길이 나있다. 두 개의 사다리가 있는데 길이가 x인 사다리는 오른쪽 빌딩의 아래를 받침대로 하여 왼쪽 빌딩에 기대져 있고 길이가 y인 사다리는 왼쪽 빌딩의 아래를 받침대로 하여 오른쪽 빌딩에 기대져 있다. 그리고 두 사다리는 땅에서부터 정확하게 c인 지점에서 서로 교차한다. 그렇다면 두 빌딩은 얼마나 떨어져 있는 걸까?

입력
 

첫째 줄에 차례대로 x, y, c에 해당하는 양의 실수 세 개가 입력된다.




출력
 

두 빌딩사이에 너비가 되는 수치를 소수점 4째 자리에서 반올림 하여 소수점 3째 자리까지 출력한다.



예제 입력 1 복사 
 30 40 10





예제 출력 1 복사 
 26.033







예제 입력 2 복사 
 12.619429 8.163332 3





예제 출력 2 복사 
 7.000







예제 입력 3 복사 
 10 10 3





예제 출력 3 복사 
 8.000







예제 입력 4 복사 
 10 10 1





예제 출력 4 복사 
 9.798


 */
public class Code_2022 {
	// 나는 직선의 방정식을 이용하여 문제를 풀었지만 아마 비율을 이용해서 문제를 풀 수 있을 것 같다. 그 문제 풀이에 대해 논의 해보자
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		//실수 3개 받기  x,y,c x-> 왼쪽의 높이, y-> 오른쪽 빌딩의 높이 c-> 중간지점의 높이
		double x=sc.nextDouble();double y=sc.nextDouble();double c=sc.nextDouble();
		
		
		//직선의 방정식을 이용하여 문제 풀기
		// -> 도형의 왼쪽 빌딩의 시작을 좌표평면안에 (0,0)으로 대입하여 (0,0)을 지나는 직선으로 가정하고 문제 풀이
		//구해진 방정식 안에 l를 넣었을 때 c보다 크면 l의 길이를 늘려야 되고(왼쪽), 그 반대면 높여야 한다.(오른쪽) 
		double left = 0.0; double right = min(x,y);
		while(right-left>1e-6) {
		//두 빌딩간의 떨어진 길이를 l라고 한다.
		double l = (left + right)/2.0;
		double hx = Math.sqrt(x*x - l*l);
		double hy = Math.sqrt(y*y - l*l);
		//(k,c)의 좌표
		double k = l*c/hy;
		//직선의 방정식에서 x=k를 대입해서 나오는 값 즉 c와 같이 비교 대상이 되는 값이다.
		double f = (-hx*k/l)+hx;
		
		if(f>c)
			left=l;
		else
			right=l;
		
		}
		//소수 4짜자리에서 반올림해서 3째자리까지 나타내기
		System.out.println("두 빌딩 사이의 값: "+ (double)Math.round(left*1000)/1000.0);
		
		
	}

	 static double min(double x, double y) {
		// TODO Auto-generated method stub
		if(x>y)
			return y;
		else
			return x;
	}

}
