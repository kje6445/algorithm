package lesson01;
import java.util.*;
/*
병든 나이트 


문제
 

병든 나이트가 N * M 크기 체스판의 가장 왼쪽아래 칸에 위치해 있다. 병든 나이트는 건강한 보통 체스의 나이트와 다르게 4가지로만 움직일 수 있다.
1.2칸 위로, 1칸 오른쪽
2.1칸 위로, 2칸 오른쪽
3.1칸 아래로, 2칸 오른쪽
4.2칸 아래로, 1칸 오른쪽

병든 나이트는 병들었지만, 그래도 명색이 체스 나이트이기 때문에 많은 칸을 방문하고 싶어 한다. 병든 나이트의 이동에는 제약이 있다. 만약, 이동 횟수가 4번 이상인 경우에는 위의 이동 방법을 각각 한 번씩 이용해야 한다.

체스판의 크기가 주어졌을 때, 병든 나이트가 방문할 수 있는 칸의 최대 개수를 출력하는 프로그램을 작성하시오. 처음에 있는 칸도 센다.




입력
 

첫째 줄에 체스판의 세로 길이 N와 가로 길이 M이 주어진다. N과 M은 2,000,000,000보다 작거나 같은 자연수이다.




출력
 

병든 나이트가 방문할 수 있는 칸의 개수중 최댓값을 출력한다.






예제 입력 1 복사 
 100 50





예제 출력 1 복사 
 48







예제 입력 2 복사 
 1 1





예제 출력 2 복사 
 1







예제 입력 3 복사 
 17 5





예제 출력 3 복사 
 4







예제 입력 4 복사 
 2 4





예제 출력 4 복사 
 2







예제 입력 5 복사 
 20 4





예제 출력 5 복사 
 4

*/
public class Code_1783 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 맵의 높이가 1일 때와 2일 때를 먼저 예외 처리르 해줘야 된다.
		// 맵의 높이가 2일때, 이동횟수가 4 이상이 되면 모든 경우의 이동을 수행해야 하므로 이동을 3번 이내로 제한
		//맵의 높이가 2보다 클 경우는 너비를 신경써서 예외처리한다. -> 최대 너비가 7/ 7보다 작을 경우 4와 비교해 계산
		Scanner sc = new Scanner(System.in);
		int height = sc.nextInt();
		int width = sc.nextInt();
		
		if(height == 1) {
			System.out.println(1);
		}else if(height == 2) {
			System.out.println(Math.min(4,(width+1)/2));
		}else if(height >=3) {
			if(width>=7) {
				System.out.println(width-2);
			}else {
				System.out.println(Math.min(4, width));
			}
		}
	}

}
