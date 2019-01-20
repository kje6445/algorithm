package week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
단어 공부 


문제
 

알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.




입력
 

첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 주어지는 단어의 길이는 1,000,000을 넘지 않는다.




출력
 

첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.






예제 입력 1 복사 
 Mississipi





예제 출력 1 복사 
 ?







예제 입력 2 복사 
 zZa





예제 출력 2 복사 
 Z







예제 입력 3 복사 
 z





예제 출력 3 복사 
 Z







예제 입력 4 복사 
 baaa





예제 출력 4 복사 
 A

*/
public class Code_1157 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//문자를 입력 받고 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다.
		//가장 많이 사용된 알파벳이 같을 경우에는 '?'를 출력
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine().trim().toUpperCase(); //입력받은 문자를 전부 대문자로 입력 받는다.
		
		int[] count = new int[26]; //a-z까지 알파벳을 입력 받는 배열
		for(int i=0; i<input.length(); i++) {
			count[input.charAt(i)-65]++; // 해당 알파벳 자리에 몇 번 나왔는지를 더해준다. 
		}
		
		int max = Integer.MIN_VALUE; //max에 제일 처음 0을 받게 저장한다.
		for(int i=0; i<26; i++) {	//알파벳 중에서 제일 많이 나온 알파벳을 max로 구해본다. 
			if(count[i] > max) {
				max = count[i];
			}
		}
		
		StringBuilder sb = new StringBuilder();
		int check =-1;
		for(int i=0; i<26; i++) {
			if(count[i] == max) {	//제일 많이 나온 알파벳이라면 max로 지정한다.
				if(check != -1) {	//만약 max가 중복 된다면 '?'를 출력
					sb.append("?");
					System.out.print(sb.toString());
					return;
				}
				check = i;	//제일 많이 나온 알파벳 count 번호를 check에 입력 받는다.
			}
		}
		
		sb.append((char)(check+65)); //check에 65을 더해 대문자로 입력 받는다.
		System.out.print(sb.toString()); //출력한다.
	}

}
