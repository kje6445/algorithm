package week3;
/*검문

문제
트럭을 타고 이동하던 상근이는 경찰의 검문을 받게 되었다. 경찰은 상근이가 운반하던 화물을 하나하나 모두 확인할 것이기 때문에, 검문하는데 엄청나게 오랜 시간이 걸린다.

상근이는 시간을 때우기 위해서 수학 게임을 하기로 했다.

먼저 근처에 보이는 숫자 N개를 종이에 적는다. 그 다음, 종이에 적은 수를 M으로 나누었을 때, 나머지가 모두 같게 되는 M을 모두 찾으려고 한다. M은 1보다 커야 한다.

N개의 수가 주어졌을 때, 가능한 M을 모두 찾는 프로그램을 작성하시오.

입력
첫째 줄에 종이에 적은 수의 개수 N이 주어진다. (2 ≤ N ≤ 100)

다음 줄부터 N개 줄에는 종이에 적은 수가 하나씩 주어진다. 이 수는 모두 1보다 크거나 같고, 1,000,000,000보다 작거나 같은 자연수이다. 같은 수가 두 번 이상 주어지지 않는다.

항상 M이 하나 이상 존재하는 경우만 입력으로 주어진다.

출력
첫째 줄에 가능한 M을 공백으로 구분하여 모두 출력한다. 이때, M은 증가하는 순서이어야 한다.

예제 입력 1 
3
6
34
38
예제 출력 1 
2 4*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main_2981 {
//hit 정말 수학적으로 접근해서 문제를 해결할 것. -> a,b,c를 입력 받았을 때  a=k*M + m, b=p*M + m, c=i*M + m
//임으로 (k-m),(p-m),(i-m) -> M의 배수이다.  
//즉 입력받은 N개의 수의 최대공약수를 구하고 N개의 수 중에서 제일 작은 값보다 작은 최대공약수의 배수까지 구하는 원리
	static int GCD(int a,int b) {
		while(a !=0) {
			if(b > a) {
				int t = a;
				a = b;
				b = t;
			}
			a = a-b;
		}
		return b;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		StringBuilder st = new StringBuilder();
		
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
	
		Arrays.sort(arr); // 오름차순으로 정리
		for(int i=1; i<N; ++i) {
			arr[i] = arr[i] - arr[i-1];
		}
		int gcd=GCD(Math.min(arr[0], arr[1]),Math.max(arr[0], arr[1]));
		
		for(int k=0; k<N; k++) {
			int g = GCD(Math.min(arr[k], arr[k+1]),Math.max(arr[k], arr[k+1]));
			if(g<gcd)
				gcd =g;
		}
		for(int i=2; i<gcd/2; ++i) {
			if(gcd % i ==0)
				st.append(i);
				st.append(" ");
		}
		
		System.out.println(st);
		bw.flush();
		bw.close();
	}

}
