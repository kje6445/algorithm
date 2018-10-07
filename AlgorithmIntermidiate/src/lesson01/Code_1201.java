package lesson01;
import java.util.*;
/*
NMK 스페셜 저지 

문제
 

1부터 N까지의 수를 한 번씩 이용해서 최대 부분 증가 수열의 길이가 M이고, 최대 부분 감소 수열의 길이가 K인 수열을 출력한다.




입력
 

첫째 줄에 N M K가 주어진다. N은 500보다 작거나 같은 자연수, M과 K는 N보다 작거나 같은 자연수이다.




출력
 

첫째 줄에 문제의 정답을 출력한다. 정답이 없다면-1을 출력한다






예제 입력 1 복사 
 4 2 2




예제 출력 1 복사 
 2 1 4 3
*/
public class Code_1201 {
	//최대 증가 부분 수열과 최대 부분 감소 수열은 하나의 요소만 공유하기 때문에 N은 M+K-1이상 이여야함
	// 비둘기집 원리를 참고 해서 문제를 해결해야함
	//최대 증가수열인 M개의 그룹을 만들되 그룹의 최대 숫자는 회대 감소수열의 길이인 K를 넘지 못 한다.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner sc = new Scanner(System.in);
		int N,M,K;
		N = sc.nextInt(); M=sc.nextInt(); K=sc.nextInt();
		
		boolean b = true;
		
		int limit =1 ;
		int count=N;
		if(N < M+K-1 || N>M*K) {
			b=false;
			System.out.println(-1);
		}
		if(b) {
			while(true) {
				M =M-1;
				count = count -K;
				if(M == 0) {
					for(int i=N; i>=limit; i--) System.out.print(i+" ");
					break;
				}
				if(count/M == 0 || count <= 0) {
					for(int i=limit + K-1-(M-count); i>=limit; i--)
						System.out.print(i +" ");
					for(int i=limit+K-(M-count); i<=N; i++)
						System.out.print(i+" ");
					break;
				}
			else {
				for(int i=limit + K -1; i>=limit;i--) {
					System.out.print(i+" ");
				}limit = limit +K;
			}
		}
	}
	}
}
