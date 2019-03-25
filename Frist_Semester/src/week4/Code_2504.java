package week4;

import java.util.Scanner;
import java.util.Stack;


/*
괄호의 값 


문제
 

4개의 기호 ‘(’, ‘)’, ‘[’, ‘]’를 이용해서 만들어지는 괄호열 중에서 올바른 괄호열이란 다음과 같이 정의된다.
1.한 쌍의 괄호로만 이루어진 ‘()’와 ‘[]’는 올바른 괄호열이다. 
2.만일 X가 올바른 괄호열이면 ‘(X)’이나 ‘[X]’도 모두 올바른 괄호열이 된다. 
3.X와 Y 모두 올바른 괄호열이라면 이들을 결합한 XY도 올바른 괄호열이 된다.

예를 들어 ‘(()[[]])’나 ‘(())[][]’ 는 올바른 괄호열이지만 ‘([)]’ 나 ‘(()()[]’ 은 모두 올바른 괄호열이 아니다. 우리는 어떤 올바른 괄호열 X에 대하여 그 괄호열의 값(괄호값)을 아래와 같이 정의하고 값(X)로 표시한다. 
1.‘()’ 인 괄호열의 값은 2이다.
2.‘[]’ 인 괄호열의 값은 3이다.
3.‘(X)’ 의 괄호값은 2×값(X) 으로 계산된다.
4.‘[X]’ 의 괄호값은 3×값(X) 으로 계산된다.
5.올바른 괄호열 X와 Y가 결합된 XY의 괄호값은 값(XY)= 값(X)+값(Y) 로 계산된다.

예를 들어 ‘(()[[]])([])’ 의 괄호값을 구해보자.  ‘()[[]]’ 의 괄호값이 2 + 3×3=11 이므로  ‘(()[[ ]])’의 괄호값은 2×11=22 이다. 그리고  ‘([])’의 값은 2×3=6 이므로 전체 괄호열의 값은 22 + 6 = 28 이다.

여러분이 풀어야 할 문제는 주어진 괄호열을 읽고 그 괄호값을 앞에서 정의한대로 계산하여 출력하는 것이다. 




입력
 

첫째 줄에 괄호열을 나타내는 문자열(스트링)이 주어진다. 단 그 길이는 1 이상, 30 이하이다.




출력
 

첫째 줄에 그 괄호열의 값을 나타내는 정수를 출력한다. 만일 입력이 올바르지 못한 괄호열이면 반드시 0을 출력해야 한다. 






예제 입력 1 복사 
 (()[[]])([])




예제 출력 1 복사 
 28
*/
public class Code_2504 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		Stack<String> stack = new Stack<String>();
		
		boolean isAble = true;
		for(int i=0; i < str.length(); i++) {
			String c = str.substring(i, i+1);
			
			//여는 괄호일 경우 본인이 닫는 괄호를 스택에 저장한다.
			if("(".equals(c)) {
				stack.push(")");
				continue;
			}
			
			if("[".equals(c)) {
				stack.push("]");
				continue;
			}
		
		
		//닫는 괄호일 경우 까다롭다. 
		//스택이 빌때까지 계속 꺼낸다.
		//아직 짝이 안됐는데 스택이 비어있다면 isAble은 false가 된다. 
		// 숫자 혹은 본인과 맞는 괄호가 아닌게 나온다면 isAble은 fasle가 된다.
		// 숫자가 나오면 숫자는 계속 합한다.
		//본인에 맞는 괄호가 나오면 본인 괄호 크기에 맞게 위에 합한 수를 곱한 뒤 그 값을 push한다.
		int num=0;
		while(true) {
			//아직 본인 괄호가 나오지 않았는데 스택이 비었다는 뜻, 유효하지 않은 괄호 문자열
			if(stack.isEmpty()) {
				isAble = false;
				break;
			}
			if(isNumber(stack.peek())){
				num+=Integer.parseInt(stack.pop());
			}else {
				if(isVPS(c,stack.peek())) {
					stack.pop();
					int t = ("(".equals(c)) ? 2:3;
					
					if(num == 0) {
						stack.push(String.valueOf(t));
					}else {
						stack.push(String.valueOf(t*num));
					}
					break;
				}else {
					isAble = false;
					break;
				}
			}
		}
		if(!isAble) break;	
	}
	int result = 0;
	
	//스택이 빌때까지 POP한다.
	//정상적인 괄호 문자열이라면 스택에는 숫자만 들어 있어야 한다.
	while(!stack.isEmpty()) {
		if(isNumber(stack.peek())) {
			result += Integer.parseInt(stack.pop());
		}else {
			isAble = false;
			break;
		}
	}
	
	if(isAble) System.out.println(result);
	else  System.out.println(0);
}

	public static boolean isVPS(String c, String target) {
		if(c.equals(target)) return true;
		return false;
	}
	
	//두 괄호가 아니면 무조건 숫자이다.
	public static boolean isNumber(String str) {
		if(str.equals(")") || str.equals("]")) return false;
		return true;
	}
}

