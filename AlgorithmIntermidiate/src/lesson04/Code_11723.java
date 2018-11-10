package lesson04;
import java.util.Scanner;

/*
집합 

문제
 

비어있는 공집합 S가 주어졌을 때, 아래 연산을 수행하는 프로그램을 작성하시오.
•add x: S에 x를 추가한다. (1 ≤ x ≤ 20) S에 x가 이미 있는 경우에는 연산을 무시한다.
•remove x: S에서 x를 제거한다. (1 ≤ x ≤ 20) S에 x가 없는 경우에는 연산을 무시한다.
•check x: S에 x가 있으면 1을, 없으면 0을 출력한다.
•toggle x: S에 x가 있으면 x를 제거하고, 없으면 x를 추가한다. (1 ≤ x ≤ 20)
•all: S를 {1, 2, ..., 20} 으로 바꾼다.
•empty: S를 공집합으로 바꾼다. 




입력
 

첫째 줄에 수행해야 하는 연산의 수 M (1 ≤ M ≤ 3,000,000)이 주어진다.

둘째 줄부터 M개의 줄에 수행해야 하는 연산이 한 줄에 하나씩 주어진다.




출력
 

check 연산이 주어질때마다, 결과를 출력한다.






예제 입력 1 복사 
 26
add 1
add 2
check 1
check 2
check 3
remove 2
check 1
check 2
toggle 3
check 1
check 2
check 3
check 4
all
check 10
check 20
toggle 10
remove 20
check 10
check 20
empty
check 1
toggle 1
check 1
toggle 1
check 1





예제 출력 1 복사 
 1
1
0
1
0
1
0
1
0
1
1
0
0
0
1
0

 */
public class Code_11723 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		//문자를 한번에 받기 위해서 StringBuilder를 사용합시다.
		StringBuilder result = new StringBuilder();
		// 내가 할 연산 횟수를 지정 
		int num = scan.nextInt();
		//비어있는 공집합 S
		int S =0;
		for(int i=0; i<num; i++) {
			//처음 입력 받는 말로 경우를 나누기 위해 입력받는 말을 command라고 지정한다.
			String command = scan.next();
			if(command.equals("add")) {
				//추가할 숫자를 입력 받기
				int x = scan.nextInt();
				//S에 x를 추가한다. 
				S =S|(1<<x);
				System.out.println("add된 값: S: "+S );
				
			}
			else if(command.equals("remove")) {
				int x = scan.nextInt();
				//S에 x를 제거한다. 
				S=S&~(1<<x);
				System.out.println("remove된 값: S: "+S );
			}else if(command.equals("check")) {
				int x = scan.nextInt();
				if((S&(1<<x))>0) result.append("1\n");
				else result.append("0\n");
			}else if(command.equals("toggle")) {
				int x = scan.nextInt();
				//S에 x가 있으면 제거하고 없으면 x 추가
				S=S^(1<<x);
			}else if(command.equals("all")) {
				
				S=(1<<21)-1;
			}else
				S=0;
		}
		System.out.println(result);
	}

}
