package week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
베르트랑 공준 

문제
 

베르트랑 공준은 임의의 자연수 n에 대하여, n보다 크고, 2n보다 작거나 같은 소수는 적어도 하나 존재한다는 내용을 담고 있다.

이 명제는 조제프 베르트랑이 1845년에 추측했고, 파프누티 체비쇼프가 1850년에 증명했다.

예를 들어, 10보다 크고, 20보다 작거나 같은 소수는 4개가 있다. (11, 13, 17, 19) 또, 14보다 크고, 28보다 작거나 같은 소수는 3개가 있다. (17,19, 23)

n이 주어졌을 때, n보다 크고, 2n보다 작거나 같은 소수의 개수를 구하는 프로그램을 작성하시오. 


입력
 

입력은 여러 개의 테스트 케이스로 이루어져 있다. 각 케이스는 n을 포함하며, 한 줄로 이루어져 있다. (n ≤ 123456)

입력의 마지막에는 0이 주어진다.



출력
 

각 테스트 케이스에 대해서, n보다 크고, 2n보다 작거나 같은 소수의 개수를 출력한다.




예제 입력 1 복사 
 1
10
13
100
1000
10000
100000
0



예제 출력 1 복사 
 1
4
3
21
135
1033
8392

*/
public class C_4948 {
	static int getPrimeNumbers(int n) {
		int count = 0;
		boolean[] prime = new boolean[n + 1];
		Arrays.fill(prime, true);
		prime[0] = false;
		prime[1] = false;
		for (int i = 2; (i * i) <= n; ++i) {
			if (prime[i]) {
				for (int j = i * 2; j <= n; j += i)
					prime[j] = false;
			}
		}
		ArrayList<Integer> result = new ArrayList<>();
		for (int i = 2; i <= n; ++i) {
			if (prime[i]) {
				++count;
				result.add(i);
			}
		}
		return count;
	}

	static List<Integer> getPrimeNumbers2(int n) {
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
		return result;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			int n = Integer.parseInt(br.readLine());
			if (n == 0)
				break;
			int x = getPrimeNumbers(2 * n);
			int y = getPrimeNumbers(n);
			System.out.println(x - y);
			/*System.out.println(getPrimeNumbers2(2*n));
			System.out.println(getPrimeNumbers2(n));*/
			
		}
	}

}
