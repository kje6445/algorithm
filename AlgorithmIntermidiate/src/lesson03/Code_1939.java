package lesson03;


import java.util.Arrays;
import java.util.Scanner;

/*중량제한 
문제 
N(2≤N≤10,000)개의 섬으로 이루어진 나라가 있다. 이들 중 몇 개의 섬 사이에는 다리가 설치되어 있어서 차들이 다닐 수 있다.
영식 중공업에서는 두 개의 섬에 공장을 세워 두고 물품을 생산하는 일을 하고 있다. 물품을 생산하다 보면 공장에서 다른 공장으로 생산 중이던 물품을 수송해야 할 일이 생기곤 한다. 그런데 각각의 다리마다 중량제한이 있기 때문에 무턱대고 물품을 옮길 순 없다. 만약 중량제한을 초과하는 양의 물품이 다리를 지나게 되면 다리가 무너지게 된다.
한 번의 이동에서 옮길 수 있는 물품들의 중량의 최댓값을 구하는 프로그램을 작성하시오.
입력 
첫째 줄에 N, M(1≤M≤100,000)이 주어진다. 다음 M개의 줄에는 다리에 대한 정보를 나타내는 세 정수 A, B(1≤A, B≤N), C(1≤C≤1,000,000,000)가 주어진다. 이는 A번 섬과 B번 섬 사이에 중량제한이 C인 다리가 존재한다는 의미이다. 서로 같은 두 도시 사이에 여러 개의 다리가 있을 수도 있으며, 모든 다리는 양방향이다. 마지막 줄에는 공장이 위치해 있는 섬의 번호를 나타내는 서로 다른 두 정수가 주어진다. 공장이 있는 두 섬을 연결하는 경로는 항상 존재하는 데이터만 입력으로 주어진다.
출력 
첫째 줄에 답을 출력한다.
예제 입력 1 복사 
3 3
1 2 2
3 1 3
2 3 2
1 3
예제 출력 1 복사 
3*/
public class Code_1939 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int n=0, m=0;
		
		//나무의 수 n
		n=sc.nextInt();
		//가져 가고 싶은 나무의 길이 m
		m=sc.nextInt();
		//가져갈 수 있는 길이의 합 sum
		int sum=0;
		//베어가야 되는 나무의 길이의 값
		int k=0;
		//제일 짧은 나무의 길이
		int min=0;
		
		int[] arr = new int[n];
		int[] minarr = new int[n];
		
		for(int i=0; i <n; i++) {
			arr[i]=sc.nextInt();
/*			if(i==0) {
				min=arr[i];
			}
			if(arr[i]<min) {
				min = arr[i];
			}*/
		}
		
		for(int j=0; j<n; j++) {
		System.out.printf(" "+arr[j]+" ");
		}
		
/*		System.out.println(min);*/
		Arrays.sort(arr);

		for(int p=0; p < n;p++) {
			sum+=arr[p]-arr[0];
			if()
		}
		
	}

}
