package June_week2;
import java.util.*;
/*1부터 입력받은 숫자 n 사이에 있는 소수의 개수를 반환하는 함수, solution을 만들어 보세요. 

소수는 1과 자기 자신으로만 나누어지는 수를 의미합니다.
 (1은 소수가 아닙니다.)
*/
public class Level1_FindDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n =sc.nextInt();
		int count=0;
		int check=0;
		System.out.println("답");
		for(int i=1; i<=n; i++) { //범위를 지정하는 반복문
			if(i==1) { //1은 소수가 아니기 때문에 반별하지 않는다. 
				break;
			}
			for(int j=1; j<i; j++) { //소수인지 아닌지 판별하는 코드 
				if((j!=1)&&(i%j == 0)) { //나눠 진다면 
					++check;
					break;
				}
				System.out.println(check);
			}
			if(check==0) {
				count++;
			}
			check=0;
			System.out.println(check);
		}
		
		System.out.println(count);
	}

}
