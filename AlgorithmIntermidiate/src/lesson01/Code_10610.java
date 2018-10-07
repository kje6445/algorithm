package lesson01;
import java.io.*;
import java.util.*;
/*
30

문제
 

어느날, 미르코는 우연히 길거리에서 양수 N을 보았다. 미르코는 30이란 수를 존경하기 때문에, 그는 길거리에서 찾은 수에 포함된 숫자들을 섞어 30의 배수가 되는 가장 큰 수를 만들고 싶어한다.

미르코를 도와 그가 만들고 싶어하는 수를 계산하는 프로그램을 작성하라.




입력
 

N을 입력받는다. N는 최대 105개의 숫자로 구성되어 있으며, 0으로 시작하지 않는다.




출력
 

미르코가 만들고 싶어하는 수가 존재한다면 그 수를 출력하라. 그 수가 존재하지 않는다면, -1을 출력하라.






예제 입력 1 복사 
 30





예제 출력 1 복사 
 30







예제 입력 2 복사 
 102





예제 출력 2 복사 
 210







예제 입력 3 복사 
 2931





예제 출력 3 복사 
 -1

*/
public class Code_10610 {
//문제 이해: 30은 2*3*5의 조합으로 이루어져있으므로 2,3,5 로 나우어 떨어져야한다.
	//30으로 나누어져 떨어지는 수는 마지막 자리가 0이면서 합이 3으로 나누어 떨어져야한다.-> 합은 변하지 않으므로 마지막 자리수를 0으로 만들어 주면 되는 문제이다.
	//가장 큰 수를 만드록 싶어하므로 내림차순으로 정리해 구하면 된다.
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String n = br.readLine();
		int[] arr = new int[10];
		int sum=0;
		//입력 받은 숫자 n의 길이 만큼 반복문 실행
		for(int i=0; i< n.length(); i++) {
			int num = n.charAt(i) - '0';
			arr[num]++;
			sum +=num;
		}
		
		if(arr[0] == 0 || sum%3 != 0) System.out.println(-1);
		else {
			StringBuilder sb = new StringBuilder();
			//내림차순으로 정렬하기
			for(int i =arr.length-1; i>=0; i--) {
				while(arr[i] --> 0)
					sb.append(i);
			}
			System.out.println(sb);
			br.close();
		}
	}

}
