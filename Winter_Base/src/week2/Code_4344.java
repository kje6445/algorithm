package week2;

import java.util.Scanner;

/*평균은 넘겠지 

문제 
대학생 새내기들의 90%는 자신이 반에서 평균은 넘는다고 생각한다. 당신은 그들에게 슬픈 진실을 알려줘야 한다.
입력 
첫째 줄에는 테스트 케이스의 개수 C가 주어진다.
둘째 줄부터 각 테스트 케이스마다 학생의 수 N(1 ≤ N ≤ 1000, N은 정수)이 첫 수로 주어지고, 이어서 N명의 점수가 주어진다. 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
출력 
각 케이스마다 한 줄씩 평균을 넘는 학생들의 비율을 반올림하여 소수점 셋째 자리까지 출력한다.
예제 입력 1 복사 
5
5 50 50 70 80 100
7 100 95 90 80 70 60 50
3 70 90 80
3 70 90 81
9 100 99 98 97 96 95 94 93 91
예제 출력 1 복사 
40.000%
57.143%
33.333%
66.667%
55.556%
 */
public class Code_4344 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int C=sc.nextInt(); //테이스 케이스 수
		int[][] student = new int[C][1000];
		int num=0;
		int[] sum=new int[C];
		double[] aver=new double[C]; //성적의 평균
		double[] persent= new double[C]; //평균을 넘는 퍼센트
		int counts[]=new int[C];//평균을 넘는 사람 수 
		int count=0;
		for(int i=0; i<C; i++) {
			student[i][0]=sc.nextInt(); // 한 줄에 입력받은 사람 수 
			num=student[i][0]; 
				for(int k=1; k<=num; k++) {
					student[i][k]=sc.nextInt();
					sum[i]+=student[i][k];
				}
			aver[i]=sum[i]/student[i][0];
			System.out.println(aver[i]);
		}
		for(int i=0; i<C; i++) {
			for(int k=1; k<=num; k++) {
				if(student[i][k]>aver[i])
					count++;
			}
			counts[i]=count;
			System.out.println("사람수"+student[i][0]);
			persent[i]=(counts[i]*100/student[i][0]);
			System.out.println(count);
			count=0;
		}
		for(int j=0; j<C; j++) {
		    System.out.printf("%.3f",persent[j]);
		    System.out.println("%");
		    
		    System.out.println(Math.round(persent[j]*1000)/1000.0);
		}
	}

}
