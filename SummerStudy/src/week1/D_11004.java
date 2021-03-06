package week1;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*K번째 수 

문제
 

수 N개 A1, A2, ..., AN이 주어진다. A를 오름차순 정렬했을 때, 앞에서부터 K번째 있는 수를 구하는 프로그램을 작성하시오.


입력
 
첫째 줄에 N(1 ≤ N ≤ 5,000,000)과 K (1 ≤ K ≤ N)이 주어진다.
둘째에는 A1, A2, ..., AN이 주어진다. (-109 ≤ Ai ≤ 109)


출력
 

A를 정렬했을 때, 앞에서부터 K번째 있는 수를 출력한다.


예제 입력 1 복사 
 5 2
4 1 2 3 5


예제 출력 1 복사 
 2

*/

public class D_11004 {
	//병합로하면 문제해결됨 -> 나는 퀵정렬했는데 오류남
	//최악의 경우를 생각해야되기 때문에  병합정렬로 문제 풀이 할 것

	public static void main(String[] ar) throws Exception{
	        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	        StringTokenizer st = new StringTokenizer(in.readLine());
	        int n = Integer.parseInt(st.nextToken());
	        int k = Integer.parseInt(st.nextToken());
	        st = new StringTokenizer(in.readLine());
	        int[] arr = new int[n];
	        for(int i=0; i<n; i++) arr[i] = Integer.parseInt(st.nextToken());
	        System.out.print(quickSearch(arr, 0, n-1, k-1));
	    }

	    public static int quickSearch(int[] arr, int start, int end, int k){
	        int pivot = partition(arr, start, end);
	        if(pivot == k) return arr[pivot];
	        else if(pivot > k) return quickSearch(arr, start, pivot-1, k);
	        else return quickSearch(arr, pivot+1, end, k);
	    }

	    public static int partition(int[] arr, int start, int end){
	        int pivot = arr[end];
	        int i = start-1;
	        for(int j=start; j<=end; j++){
	            if(arr[j] < pivot){
	                i++;
	                swap(arr, i, j);
	            }
	        }
	        i++;
	        swap(arr, i, end);

	        return i;
	    }

	    public static void swap(int[] arr, int a, int b){
	        int temp = arr[a];
	        arr[a] = arr[b];
	        arr[b] = temp;
	    }
	}

