import java.util.Scanner;

/*A+B 

문제 
두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
입력 
첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
출력 
첫째 줄에 A+B를 출력한다.
예제 입력 1 복사 
1 2
예제 출력 1 복사 
3*/
public class Code_1000 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int A,B,Sum;
		System.out.println("A 입력: ");
		A=sc.nextInt();
		
		System.out.println("B 입력: ");
		B=sc.nextInt();
		Sum=A+B;
		System.out.println("A+B : "+Sum);
		
		
	}

}
