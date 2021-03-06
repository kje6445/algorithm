package week3;
/*링

문제
상근이는 창고에서 링 N개를 발견했다. 상근이는 각각의 링이 앞에 있는 링과 뒤에 있는 링과 접하도록 바닥에 내려놓았다. 



상근이는 첫 번째 링을 돌리기 시작했고, 나머지 링도 같이 돌아간다는 사실을 발견했다. 나머지 링은 첫 번째 링 보다 빠르게 돌아가기도 했고, 느리게 돌아가기도 했다. 이렇게 링을 돌리다 보니 첫 번째 링을 한 바퀴 돌리면, 나머지 링은 몇 바퀴 도는지 궁금해졌다.

링의 반지름이 주어진다. 이때, 첫 번째 링을 한 바퀴 돌리면, 나머지 링은 몇 바퀴 돌아가는지 구하는 프로그램을 작성하시오.

입력
첫째 줄에 링의 개수 N이 주어진다. (3 ≤ N ≤ 100)

다음 줄에는 링의 반지름이 상근이가 바닥에 놓은 순서대로 주어진다. 반지름은 1과 1000를 포함하는 사이의 자연수이다.

출력
출력은 총 N-1줄을 해야 한다. 첫 번째 링을 제외한 각각의 링에 대해서, 첫 번째 링을 한 바퀴 돌리면 그 링은 몇 바퀴 도는지 기약 분수 형태 A/B로 출력한다.

예제 입력 1 
4
12 3 8 4
예제 출력 1 
4/1
3/2
3/1*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main_3036 {
//hit 둘레의 지름의 증가함은 반지름의 지름에 비례하여 증가, 감소를 하며 원의 반지름에 대하여 최대 공약수를 구해 나눠 준다. 
	static int 최대공약수(int a, int b) {
		while(a != 0) {
			if(b>a) {
				int t = a;
				a = b;
				b = t;
			}
			a = a-b;
		}
		return b;
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		StringTokenizer token = new StringTokenizer(br.readLine()); //한 문장으로 여러 숫자를 입력하기
		
		int fix = Integer.parseInt(token.nextToken());
		
		for(int i =0; i<N-1; ++i) {
			int small = Integer.parseInt(token.nextToken());
			int gcd = 최대공약수(Math.min(fix,small), Math.max(fix,small));
			System.out.println((fix/gcd)+"/"+(small/gcd));
			
		}		
	}

}
