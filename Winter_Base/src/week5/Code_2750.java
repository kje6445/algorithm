package week5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*수 정렬하기 

문제
 

N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.




입력
 

첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000)이 주어진다. 둘째 줄부터 N개의 줄에는 숫자가 주어진다. 이 수는 절댓값이 1,000보다 작거나 같은 정수이다. 수는 중복되지 않는다.




출력
 

첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.






예제 입력 1 복사 
 5
5
2
3
4
1





예제 출력 1 복사 
 1
2
3
4
5

*/
public class Code_2750 {

	public static void main(String[] args)  throws NumberFormatException, IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine()); // N개의 수 입력 받기 
		
		int[] arr = new int[N];
		int b;
		for(int i=0; i<N; i++) { // 각각 배열에 수를 입력하기 
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		//선택정렬을 이용해 문제를 해결
		for(int i=0; i<arr.length-1; i++) {
			for(int j = i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					b = arr[j];
					arr[j] = arr[i];
					arr[i] =b;
				}
			}
		}
		for(int i=0; i<N; i++) {
			System.out.println(arr[i]);
		}
	}

}
