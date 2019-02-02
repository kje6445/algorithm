package week5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*소트인사이드 

문제
 

배열을 정렬하는 것은 쉽다. 수가 주어지면, 그 수의 각 자리수를 내림차순으로 정렬해보자.




입력
 

첫째 줄에 정렬하고자하는 수 N이 주어진다. N은 1,000,000,000보다 작거나 같은 자연수이다.




출력
 

첫째 줄에 자리수를 내림차순으로 정렬한 수를 출력한다.






예제 입력 1 복사 
 2143





예제 출력 1 복사 
 4321

*/
public class Code_1427 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//문제 해결 방안 -> 문자를 입력받은 뒤에 문자를 짤라서 붙인 다음에 숫자를 비교한다.
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String inputNumber = br.readLine();
		int[] sortArray = new int[inputNumber.length()];//inputNumber의 길이 만큼 int형 배열을 생성한다.
		
		for(int i=0; i<inputNumber.length(); i++) {
			//sortArray배열에 string인 inputNumber을 char형으로 한 글자로 나눈다음 int형 변환한다.
			// static int getNumericValue(char ch) ->  Unicode 문자를 정수로 리턴한다.
			 
			sortArray[Character.getNumericValue(inputNumber.charAt(i))]++;
		}
		
		for(int i=sortArray.length-1; i>=0; i--) {
			
			while(sortArray[i] != 0) {
			bw.write(String.valueOf(i));
			sortArray[i]--;
			}
		}
		bw.flush();
	}

}
