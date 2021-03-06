package week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

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
public class E_1929 {

	public static void main(String[] args) throws NumberFormatException, IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()); 
		StringBuilder sb = new StringBuilder();
/*		String nums = br.readLine();
		StringTokenizer st = new StringTokenizer(nums,""); // 공백으로 문자 자르기
		String[] arr = new String[st.countTokens()];
		
		int i=0;
		while(st.hasMoreTokens()) {
			arr[i++] = st.nextToken();
			System.out.println(arr[i]);
		}
		
		int[] numss = Arrays.stream(arr).mapToInt(Integer::parseInt).toArray();
		int M = numss[0];
		int N = numss[1];*/
		
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		System.out.println("M :"+M+" N :"+N);
		
		int i=0;

		for(i=Math.min(M, N); i<Math.max(M, N); i++){ //소수인지 아닌지 구별하자.
			int count = 0;//약수의 갯수를 체크해주는 count
			for(int j=2; j<i;j++) {
				if(i%j==0)
					++count;
			}
			if(count==0)
				sb.append(i+"\n");
		}
		System.out.println(sb.toString());
	}

}
