package week4;

import java.util.Scanner;
import java.util.Stack;

/*
괄호 


문제
 

괄호 문자열(Parenthesis String, PS)은 두 개의 괄호 기호인 ‘(’ 와 ‘)’ 만으로 구성되어 있는 문자열이다. 그 중에서 괄호의 모양이 바르게 구성된 문자열을 올바른 괄호 문자열(Valid PS, VPS)이라고 부른다. 한 쌍의 괄호 기호로 된 “( )” 문자열은 기본 VPS 이라고 부른다. 만일 x 가 VPS 라면 이것을 하나의 괄호에 넣은 새로운 문자열 “(x)”도 VPS 가 된다. 그리고 두 VPS x 와 y를 접합(concatenation)시킨 새로운 문자열 xy도 VPS 가 된다. 예를 들어 “(())()”와 “((()))” 는 VPS 이지만 “(()(”, “(())()))” , 그리고 “(()” 는 모두 VPS 가 아닌 문자열이다. 

여러분은 입력으로 주어진 괄호 문자열이 VPS 인지 아닌지를 판단해서 그 결과를 YES 와 NO 로 나타내어야 한다. 




입력
 

입력 데이터는 표준 입력을 사용한다. 입력은 T개의 테스트 데이터로 주어진다. 입력의 첫 번째 줄에는 입력 데이터의 수를 나타내는 정수 T가 주어진다. 각 테스트 데이터의 첫째 줄에는 괄호 문자열이 한 줄에 주어진다. 하나의 괄호 문자열의 길이는 2 이상 50 이하이다. 




출력
 

출력은 표준 출력을 사용한다. 만일 입력 괄호 문자열이 올바른 괄호 문자열(VPS)이면 “YES”, 아니면 “NO”를 한 줄에 하나씩 차례대로 출력해야 한다. 






예제 입력 1 복사 
 6
(())())
(((()())()
(()())((()))
((()()(()))(((())))()
()()()()(()()())()
(()((())()(





예제 출력 1 복사 
 NO
NO
YES
NO
YES
NO

*/
public class Code_9012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Integer> stack = new Stack<Integer>(); //Stack를 Integer 형으로 생성한다. 
		String[] st = new String[50]; //String 배열 생성
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt(); //입력 받을 
		
		for(int i=0; i<cnt; i++) {
			int count =0; 
			boolean vps;
			String a = sc.next(); //통채로 (,)들로 해서 입력한다. 
			for(int j=0; j<a.length(); j++) { // a의 길이 만큼 (,)를 세기 위해서 반복문을 돌린다. 
				st[j] = String.valueOf(a.charAt(j)); //(,)를 입력 받는다. 
				if(count<0) { //count가 음수라는 것은  짝수가 안 맞는다는 의미.
					vps = false;
					break;
				}
				if(st[j].equals("(")) { // 여는 문이면 count를 더해준다. 
					count++;
				}else {
					count--;	// 닫히면 count를 빼준다. 
				}
			}
		
		if(count==0)
			vps=true;
		else
			vps=false;
		System.out.println(vps?"YES":"NO");
		stack.clear();
		}
	}

}
