package June_week2;

import java.util.*;

/*자연수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution을 완성해주세요.*/


public class Level1_FactorSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int sum=0;
		
		for(int i=1; i<=n; i++) {
			if(n%i==0) {
				sum+=i;
			}
		}
		
		System.out.println(sum);
	}

}
