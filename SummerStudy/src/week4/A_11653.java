package week4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*소인수분해 
 

문제
 
정수 N이 주어졌을 때, 소인수분해하는 프로그램을 작성하시오.

입력

첫째 줄에 정수 N (1 ≤ N ≤ 10,000,000)이 주어진다.

출력
 
N의 소인수분해 결과를 한 줄에 하나씩 오름차순으로 출력한다.

예제 입력 1 복사 
 72

예제 출력 1 복사 
 2
2
2
3
3


예제 입력 2 복사 
 3

예제 출력 2 복사 
 3


예제 입력 3 복사 
 6


예제 출력 3 복사 
 2
3


예제 입력 4 복사 
 2


예제 출력 4 복사 
 2

예제 입력 5 복사 
 9991

예제 출력 5 복사 
 97
103

*/
public class A_11653 {
//hint 소수로 나눈 나머지가 1이될 경우 다음 소수로 소인수 분해를 하며 몫이 1이 될 때 stop
	/*
	 * static List<Integer> getPrimeNumbers(int n) { boolean[] prime = new boolean[n
	 * + 1]; Arrays.fill(prime, true); prime[0] = false; prime[1] = false; for (int
	 * i = 2; (i * i) <= n; ++i) if (prime[i]) { for (int j = i * 2; j <= n; j += i)
	 * prime[j] = false; } ArrayList<Integer> result = new ArrayList<>(); for (int i
	 * = 2; i <= n; ++i) if (prime[i]) result.add(i); return result; }
	 */

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());

		System.out.println(n);
		// n까지의 소수 전부 구하기
		boolean[] prime = new boolean[n + 1];
		Arrays.fill(prime, true);
		prime[0] = false;
		prime[1] = false;
		for (int i = 2; (i * i) <= n; ++i)
			if (prime[i]) {
				for (int j = i * 2; j <= n; j += i)
					prime[j] = false;
			}
		ArrayList<Integer> result = new ArrayList<>();
		for (int i = 2; i <= n; ++i)
			if (prime[i])
				result.add(i);

		System.out.println("result 1: " + result.get(1));
		System.out.println("result 2: " + result.get(2));
		System.out.println("result size " + result.size());

		for (int i = 1; i < result.size(); i++) {
			System.out.println("result: " + i + " " + result.get(i));
		}
		// result에 n까지의 소수가 저장되어있다.
		int count =0;
		for (int i = 1; i < result.size(); i++) {
			if ((n % result.get(i) == 0) && (n / result.get(i) == 1)) { // 마지막까지 왔을 때 아웃.
				System.out.println(result.get(i));
				break;
			} else if ((n % result.get(i) == 0)) { // 나눠지면 출력
				System.out.println(result.get(i));
				--i;
				if (i == (result.size() - 1)) {
					break;
				}
			}
		}

	}

}
