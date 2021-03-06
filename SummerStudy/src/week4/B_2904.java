package week4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

/*
수학은 너무 쉬워 

문제

상근이의 할머니는 매우 유명한 수학자이다. 할머니는 매일 수학 문제로 상근이를 힘들게 한다. 할머니는 종이 N장에 숫자를 하나씩 쓴 다음 상근이에게 준다. 그 다음 상근이는 다음과 같이 문제를 풀어야 한다.
두 수 A와 B를 고르고, A를 나눌 수 있는 소수 X를 고른다. 그 다음, A를 지우고 A/X를 쓰고, B를 지우고 B×X를 쓴다.
상근이는 위의 행동을 무한히 반복할 수 있다. 할머니는 상근이가 만든 수를 보고 점수를 계산한다. 점수가 높을수록 할머니는 상근이에게 사탕을 많이 준다. 점수는 종이에 적혀있는 모든 수의 최대공약수이다.
상근이가 얻을 수 있는 가장 높은 점수를 구하는 프로그램을 작성하시오. 또, 그 점수를 얻으려면 최소 몇 번 해야 하는지도 구한다.


입력
 

첫째 줄에 N이 주어진다. (1 ≤ N ≤ 100) 둘째 줄에는 종이에 적혀있는 수 N개가 주어진다. 수는 모두 1,000,000보다 작거나 같은 양의 정수이다.

출력

첫째 줄에 상근이가 얻을 수 있는 가장 큰 점수와 최소 몇 번 만에 그 점수를 얻을 수 있는지를 출력한다. 

예제 입력 1 복사 
 3
8 24 9


예제 출력 1 복사 
 12 3			-> 최대 12점 얻을 수 있고 최소 3번 해야한다.

*/
public class B_2904 {
	static List<Integer> getPrimeNumbers(int n) {
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

	static List<Integer> getPrimeFactors(int n) {
		List<Integer> primeNumbers = getPrimeNumbers(n);
		List<Integer> result = new ArrayList<Integer>();
		for (int p : primeNumbers) {
			while (n % p == 0) {
				result.add(p);
				n /= p;
			}
			if (n == 1)
				break;
		}
		return result;
	}

	static long GCD(long a, long b) {
		while (b != 0) {
			long t = a % b;
			a = b;
			b = t;
		}
		return a;
	}

	static long GCD(int... a) {
		long result = a[0];
		for (int i = 1; i < a.length; ++i)
			result = GCD(result, a[i]);
		return result;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[n];
		Map<String, List<Integer>> prime = new HashMap<String, List<Integer>>();
		int max = 0;
		int maxScore = 1;
		int countNum = 0;
		int[] countPrime = new int[1000000];
		
		// n의 개수 만큼 string을 잘라서 넣어야한다.
		for (int i = 0; i < n; i++) {
			String check = st.nextToken();
			arr[i] = Integer.parseInt(check);
			if (arr[i] >= max)
				max = arr[i];
			prime.put(check, getPrimeFactors(arr[i])); // 입력한 값 소인수 분해한 것 담기
			System.out.println(prime.get(check));
			for (int j = 0; j < getPrimeFactors(arr[i]).size(); j++) {
				int x = getPrimeFactors(arr[i]).get(j);
				++countPrime[x];
			}
		}

		for (int i = 0; i < 1000000; i++) {
			int x = countPrime[i] / n;

			if (x >= 1) {
				int y = x * i;
				maxScore *= y;
				for (int j = 0; j < x; j++) {
					System.out.println(i);
				}
			}
		}
		System.out.println("maxScore " + maxScore);

		


	}

}
