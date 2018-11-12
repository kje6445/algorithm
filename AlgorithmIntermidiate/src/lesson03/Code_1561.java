package lesson03;
import java.util.*;
/*
놀이 공원 



문제
 

N명의 아이들이 한 줄로 줄을 서서 놀이공원에서 1인승 놀이기구를 기다리고 있다. 이 놀이공원에는 총 M종류의 1인승 놀이기구가 있으며, 1번부터 M번까지 번호가 매겨져 있다.

모든 놀이기구는 각각 정해진 운행 시간이 정해져 있어서, 운행 시간이 지나면 탑승하고 있던 아이는 내리게 된다. 놀이 기구가 비어 있으면 현재 줄에서 가장 앞에 서 있는 아이가 빈 놀이기구에 탑승한다. 만일 여러 개의 놀이기구가 동시에 비어 있으면, 더 작은 번호가 적혀 있는 놀이기구를 먼저 탑승한다고 한다.

놀이기구가 모두 비어 있는 상태에서 첫 번째 아이가 놀이기구에 탑승한다고 할 때, 줄의 마지막 아이가 타게 되는 놀이기구의 번호를 구하는 프로그램을 작성하시오.




입력
 

첫째 줄에 N(1<= N<= 2,000,000,000)과 M(1<= M<= 10,000)이 빈칸을 사이에 두고 주어진다. 둘째 줄에는 각 놀이기구의 운행 시간을 나타내는 M개의 자연수가 순서대로 주어진다. 운행 시간은 1 이상 30 이하의 자연수이며, 단위는 분이다.




출력
 

첫째 줄에 마지막 아이가 타게 되는 놀이기구의 번호를 출력한다.






예제 입력 1 복사 
 22 5
1 2 3 4 5





예제 출력 1 복사 
 4
*/
public class Code_1561 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		//사람의 수 -> n
		int n = sc.nextInt();
		//놀이기구의 수 -> m
		int m = sc.nextInt();
		//play에 개수를 넣는다.
	/*	double[] play =new double[m];*/
		double[] play = new double[10001];
		//운행시간
		int time;
		double lo=0, hi=2e9*31, mid, sum;
		for(int i=1; i<m; i++) {
			play[i]=i;
		}
		//놀이기구보다 사람 수가 적으면 n을 출력한다. 마지막으로 탄 아이의 놀이기구 번호는 자기의 번호이다.
		if(n<=m) {
			System.out.println(n);
		}
		

		while(lo+1!=hi) {
			mid =(lo+hi)/2;
			
			sum=m;
			for(int i=0; i<m;i++) {
				sum +=mid/play[i];
			}
			if(sum>=n) hi =mid;
			else lo= mid;
		}
		
		sum= m;
		for(int i=0; i<m; i++)
			sum +=lo/play[i];
		
		if(sum>=n) {
			lo--;
			sum=m;
			for(int i=0; i<m; i++)
				sum+=lo/play[i];
		}
		
		lo++;
		
		if(sum==n) {
			System.out.println(m);
		}
		if(lo==0) {
			System.out.println(n);
		}
		for(int i=0; i<m; i++) {
			if(lo%play[i]==0) {
				sum++;
				if(sum==n) {
					System.out.println(i+1);
					break;
				}
			}
		}
	}



}
