package lesson02;
import java.io.*;
import java.util.*;
/*
배열 합치기 

문제
 

정렬되어있는 두 배열 A와 B가 주어진다. 두 배열을 합친 다음 정렬해서 출력하는 프로그램을 작성하시오.




입력
 

첫째 줄에 배열 A의 크기 N, 배열 B의 크기 M이 주어진다. (1 ≤ N, M ≤ 1,000,000)

둘째 줄에는 배열 A의 내용이, 셋째 줄에는 배열 B의 내용이 주어진다. 배열에 들어있는 수는 절대값이 109보다 작거나 같은 정수이다.




출력
 

첫째 줄에 두 배열을 합친 후 정렬한 결과를 출력한다.






예제 입력 1 복사 
 2 2
3 5
2 9





예제 출력 1 복사 
 2 3 5 9







예제 입력 2 복사 
 2 1
4 7
1





예제 출력 2 복사 
 1 4 7







예제 입력 3 복사 
 4 3
2 3 5 9
1 4 7





예제 출력 3 복사 
 1 2 3 4 5 7 9

*/




public class Code_11728 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		int n = Integer.parseInt(br.readLine());
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str," ");
		while(st.hasMoreTokens()) {
			int key = Integer.parseInt(st.nextToken());
			if(map.containsKey(key))
				map.replace(key, map.get(key)+1);
			else
				map.put(key, 1);
		}
		int m = Integer.parseInt(br.readLine());
		str = br.readLine();
		st = new StringTokenizer(str," ");
		while(st.hasMoreTokens()) {
			int key = Integer.parseInt(st.nextToken());
			if(map.containsKey(key))
				bw.write(map.get(key)+" ");
			else
				bw.write("0 ");
		}
		bw.flush();
	}

}
