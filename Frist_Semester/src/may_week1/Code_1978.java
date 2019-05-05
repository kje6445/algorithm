package may_week1;

import java.io.IOException;
import java.util.Scanner;

/*소수 찾기 실패 

문제
 

주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.




입력
 

첫 줄에 수의 개수 N이 주어진다. N은 100이하이다. 다음으로 N개의 수가 주어지는데 수는 1,000 이하의 자연수이다.




출력
 

주어진 수들 중 소수의 개수를 출력한다.


예제 입력 1 복사 
 4
1 3 5 7




예제 출력 1 복사 
 3
*/
public class Code_1978 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//소수는 약수가 자기 자신과 1밖에 약수가 없는 수라고 정의한다. 다만 1은 소수라고 하지 않는다.
		int num = sc.nextInt(); // 수의 개수를 N으로 주어진다.
		int sosuCnt = 0, cnt=0; // sosuCnt -> 소수의 개수의 합을 저장.(합의 2이면 소수로 판명) cnt -> num의 개수에 맞게 출력지는 지에 대한 확인
		
		for(int i =1; i<=num; i++) {
			int num2 = sc.nextInt(); // 확인하고 싶은 num2
			sosuCnt =0; // 소수인지 여부에 판별하기 위해 0으로 카운트 하고 수를 올라간다.
			
			for(int j =1; j<=num2; j++) { // 소수인지 아닌지 판별
				if(num2%j==0) //자기 자신과 num2이 나눠지면 나머지가 0
					sosuCnt++; //소수인지 아닌지 
			}
			if(sosuCnt == 2) // 2라면 소수라는 것이기 때문에 cnt를 증가시켜준다.
				cnt++;
		}
		//소수의 개수 출력하기
		System.out.println(cnt);
	
	}

}
