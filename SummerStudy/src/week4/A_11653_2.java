package week4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A_11653_2 {
	static List<Integer> getPrimeNumbers(int n){
		boolean[] prime = new boolean[n+1];
		Arrays.fill(prime, true);
		prime[0] = false;
		prime[1] = false;
		for(int i=2; (i*i) <= n; ++i) {
			if(prime[i]) {
				for(int j=i*2; j<=n; j +=i)
					prime[j] = false;
			}
		}
		ArrayList<Integer> result = new ArrayList<>();
		for(int i=2; i<=n; ++i)
			if(prime[i]) result.add(i);
		return result;
	}
	
	static List<Integer> getPrimeFactors(int n){
		List<Integer> primeNumbers = getPrimeNumbers(n);
		List<Integer> result = new ArrayList<Integer>();
		for(int p : primeNumbers) {
			while(n%p==0) {
			result.add(p);
			n/=p;
			}
			if(n==1) break;
		}
		return result;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		for(int f : getPrimeFactors(N))
			System.out.println(f);
	}

}
