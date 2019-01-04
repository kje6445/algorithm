import java.util.Scanner;
/*
그대로 출력하기 

문제 
입력 받은 대로 출력하는 프로그램을 작성하시오.
입력 
입력이 주어진다. 입력은 최대 100줄로 이루어져 있고, 알파벳 소문자, 대문자, 공백, 숫자로만 이루어져 있다. 각 줄은 100글자를 넘지 않으며, 빈 줄은 주어지지 않는다. 또, 각 줄은 공백으로 시작하지 않고, 공백으로 끝나지 않는다.
출력 
입력받은 그대로 출력한다.
예제 입력 1 복사 
Hello
Baekjoon
Online Judge
예제 출력 1 복사 
Hello
Baekjoon
Online Judge*/
public class Code_11718 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		//입력 버퍼에 다음 입력 값이 있는지 없는지 자동 판별 가능 => hasNextLine() = 입력된 다른 라인이 있을 경우에 true 반환
		//hasNextLine()는 boolean형 반환
		while(sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}
	}

}
