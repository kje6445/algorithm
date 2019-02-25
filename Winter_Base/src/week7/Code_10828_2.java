package week7;

import java.util.*;

/*
스택 


문제
 

정수를 저장하는 스택을 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.

명령은 총 다섯 가지이다.
•push X: 정수 X를 스택에 넣는 연산이다.
•pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
•size: 스택에 들어있는 정수의 개수를 출력한다.
•empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
•top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.




입력
 

첫째 줄에 주어지는 명령의 수 N (1 ≤ N ≤ 10,000)이 주어진다. 둘째 줄부터 N개의 줄에는 명령이 하나씩 주어진다. 주어지는 정수는 1보다 크거나 같고, 100,000보다 작거나 같다. 문제에 나와있지 않은 명령이 주어지는 경우는 없다.




출력
 

출력해야하는 명령이 주어질 때마다, 한 줄에 하나씩 출력한다.






예제 입력 1 복사 
 14
push 1
push 2
top
size
empty
pop
pop
pop
size
empty
pop
push 3
empty
top





예제 출력 1 복사 
 2
2
0
2
1
-1
0
1
-1
0
3







예제 입력 2 복사 
 7
pop
top
push 123
top
pop
top
pop





예제 출력 2 복사 
 -1
-1
123
123
-1
-1

*/
public class Code_10828_2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n =sc.nextInt(); //명령의 수 입력
		int[] arr = new int[n]; //작업을 위한 배열
		int top = -1; //배열 위치
		String input; //명령
		
		for(int i=0; i<n; i++) {
			input = sc.next(); //값을 입력 받음
			
			if(input.equals("push")) //입력 받은 글이 push일때 실행
			{
				top++;
				arr[top] = sc.nextInt(); //top위치에 값을 입력함
			}else if(input.equals("pop")) { //스택에서 가장 위에 있는 정수를 삭제하고 스텍이 비어있는면 -1를 출력
				if(top == -1) {
					System.out.println(-1);
				}else {
					System.out.println(arr[top]);
					top--;
				}
			}else if(input.equals("size")) { //스택의 크기를 출력한다.
				System.out.println(top+1);
			}else if(input.equals("empty")) { //스택이 비어있으면 1을 출력 아니면 0을 출력
				if(top == -1) {
					System.out.println(1);
				}else {
					System.out.println(0);
				}
			}else if(input.equals("top")) { //스택에 가장 위에 있는 정수를 출력
				if(top == -1) {
					System.out.println(-1);
				}else {
					System.out.println(arr[top]);
				}
			}
		}
	}

}
