package week1;
import java.util.Scanner;

//A/B 스페셜 저지 

//문제 
//두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성하시오.
//입력 
//첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
//출력 
//첫째 줄에 A/B를 출력한다. 절대/상대 오차는 10-9 까지 허용한다.
//예제 입력 1 복사 
//1 3
//예제 출력 1 복사 
//0.33333333333333333333333333333333
//예제 입력 2 복사 
//4 5
//예제 출력 2 복사 
//0.8
public class Code_1008 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A,B;
		A=sc.nextInt();
		B=sc.nextInt();
		//절대/상대 오차는 10-9 까지 허용한다. 라고 했기 때문에 값을 double까지로 확장해준다.
		System.out.println((double)A/B);
	}

}
