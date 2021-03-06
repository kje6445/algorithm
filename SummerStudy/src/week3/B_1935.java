package week3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/*
후위 표기식2 

문제
 

후위 표기식과 각 피연산자에 대응하는 값들이 주어져 있을 때, 그 식을 계산하는 프로그램을 작성하시오.

입력
 

첫째 줄에 피연산자의 개수(1 ≤ N ≤ 26) 가 주어진다. 그리고 둘째 줄에는 후위 표기식이 주어진다. (여기서 피연산자는 A~Z의 영대문자이며, A부터 순서대로 N개의 영대문자만이 사용되며, 길이는 100을 넘지 않는다) 그리고 셋째 줄부터 N+2번째 줄까지는 각 피연산자에 대응하는 값이 주어진다. (3번째 줄에는 A에 해당하는 값, 4번째 줄에는 B에 해당하는값 , 5번째 줄에는 C ...이 주어진다, 그리고 피연산자에 대응 하는 값은 정수이다)

출력
 

계산 결과를 소숫점 둘째 자리까지 출력한다.


예제 입력 1 복사 
 5
ABC*+DE/-
1
2
3
4
5





예제 출력 1 복사 
 6.20




예제 입력 2 복사 
 1
AA+A+
1




예제 출력 2 복사 
 3.00

*/
public class B_1935 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		Map<Character, Integer> map = new HashMap<>();

		String input = br.readLine();
		char key = 'A';

		for (int i = 0; i < N; i++) {
			map.put(key, Integer.parseInt(br.readLine())); // key값에 숫자를 입력 받는다.
			key++;
		}

		Stack<Double> stack = new Stack<>();

		for (char c : input.toCharArray()) {
			if(Character.isAlphabetic(c)) {
				stack.push(Double.valueOf(map.get(c)));
			}else {
				double temp = calculate(stack.pop(),stack.pop(),c);
				stack.push(temp);
			}
		}
		System.out.format("%.2f", stack.pop());
	}

	private static double calculate(Double num1, Double num2, char c) {
		
		switch (c) {
		case '+':
			return num2 + num1;
		case '-':
			return num2 - num1;
		case '*':
			return num2 * num1;
		case '/':
			return num2 / num1;
		default:
			return -1;
		}
	}
}
