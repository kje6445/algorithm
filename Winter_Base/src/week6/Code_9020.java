package week6;

import java.util.ArrayList;
import java.util.Scanner;

/*
골드바흐의 추측 


문제
 

1보다 큰 자연수 중에서  1과 자기 자신을 제외한 약수가 없는 자연수를 소수라고 한다. 예를 들어, 5는 1과 5를 제외한 약수가 없기 때문에 소수이다. 하지만, 6은 6 = 2 × 3 이기 때문에 소수가 아니다.

골드바흐의 추측은 유명한 정수론의 미해결 문제로, 2보다 큰 모든 짝수는 두 소수의 합으로 나타낼 수 있다는 것이다. 이러한 숫자를 골드바흐 숫자라고 한다. 또, 짝수를 두 소수의 합으로 나타내는 표현을 그 숫자의 골드바흐 파티션이라고 한다. 예를 들면, 4 = 2 + 2, 6 = 3 + 3, 8 = 3 + 5, 10 = 5 + 5, 12 = 5 + 7, 14 = 3 + 11, 14 = 7 + 7이다. 10000보다 작거나 같은 모든 짝수 n에 대한 골드바흐 파티션은 존재한다.

2보다 큰 짝수 n이 주어졌을 때, n의 골드바흐 파티션을 출력하는 프로그램을 작성하시오. 만약 가능한 n의 골드바흐 파티션이 여러 가지인 경우에는 두 소수의 차이가 가장 작은 것을 출력한다.




입력
 

첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있고 짝수 n이 주어진다. (4 ≤ n ≤ 10,000)




출력
 

각 테스트 케이스에 대해서 주어진 n의 골드바흐 파티션을 출력한다. 출력하는 소수는 작은 것부터 먼저 출력하며, 공백으로 구분한다.






예제 입력 1 복사 
 3
8
10
16





예제 출력 1 복사 
 3 5
5 5
5 11

*/
public class Code_9020 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 짝수를 두 소수의 합으로 나타내는 표현 
		// 출력하는 소수는 작은 것부터 먼저 출력하며, 공백으로 출력한다.
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); //테스트 케이스를 입력
		ArrayList nums = new ArrayList(); //골드바흐 파티션을 구할 값을 입력 받아 저장할 수
		ArrayList help = new ArrayList(); //소수를 구하기 전에 소수인지 판
		ArrayList primes = new ArrayList(); //소수가 정장되어있는 List
		int max=0; 
		for(int i=0; i<N; i++) {
			int num =sc.nextInt();
			nums.add(num);
			if(max<=num)
				max=num;
		}
		
		for(int i=1; i<max; i++) {
			help.add(i);
			for(int j=1; j<i; j++) {
				
			}
		}
/*		for(int j=1; j<) {
			
		}*/
		for(int j=0; j<N; j++) {
			System.out.println(nums.get(j));
		}
		//작은 수부터 소수를 구한 다음에  값을 비교해서 출력 한다. 
		//ArrayList의 크기 출력 nums.size()
		//ArrayList의 그 인덱스의 값 출력 nums.get(index);
	}

}
