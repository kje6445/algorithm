package week5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.StringTokenizer;

/*
단어 정렬 
 
문제
 

알파벳 소문자로 이루어진 N개의 단어가 들어오면 아래와 같은 조건에 따라 정렬하는 프로그램을 작성하시오.
1.길이가 짧은 것부터
2.길이가 같으면 사전 순으로




입력
 

첫째 줄에 단어의 개수 N이 주어진다. (1≤N≤20,000) 둘째 줄부터 N개의 줄에 걸쳐 알파벳 소문자로 이루어진 단어가 한 줄에 하나씩 주어진다. 주어지는 문자열의 길이는 50을 넘지 않는다.




출력
 

조건에 따라 정렬하여 단어들을 출력한다. 단, 같은 단어가 여러 번 입력된 경우에는 한 번씩만 출력한다.






예제 입력 1 복사 
 13
but
i
wont
hesitate
no
more
no
more
it
cannot
wait
im
yours





예제 출력 1 복사 
 i
im
it
no
but
more
wait
wont
yours
cannot
hesitate

*/
public class Code_1181 {

	static StringTokenizer st;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// HashSet은 중복을 허용하지 않는다.
		// Arrays.sort기능에 숫자만 배열 가능한게 아니라 문자도 알파벳 순으로 배열 가능
		// Comparator 형식으로 로직을 만들어서 비교가능

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		HashSet<String> sortedSet =new HashSet<>();
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			sortedSet.add(st.nextToken());
		}
		
		int setSize = sortedSet.size();
		String[] sortedArray = new String[setSize];
		
		sortedSet.toArray(sortedArray);
		Arrays.sort(sortedArray);
		
		Arrays.sort(sortedArray, new Comparator<String>() {
			@Override
			public int compare(String o1,String o2 ) {
				return Integer.compare(o1.length(), o2.length());
			}
		});
		
		for(String output: sortedArray) {
			bw.write(output);
			bw.newLine();
		}
		bw.flush();
	}

}
