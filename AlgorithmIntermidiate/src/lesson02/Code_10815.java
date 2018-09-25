package lesson02;
import java.io.*;
import java.util.*;
/*

숫자 카드 



문제
 

숫자 카드는 정수 하나가 적혀져 있는 카드이다. 상근이는 숫자 카드 N개를 가지고 있다. 숫자 M개가 주어졌을 때, 이 숫자가 적혀있는 숫자 카드를 상근이가 가지고 있는지 아닌지를 구하는 프로그램을 작성하시오.


입력
 

첫째 줄에 상근이가 가지고 있는 숫자 카드의 개수 N (1 ≤ N ≤ 500,000)이가 주어진다. 둘째 줄에는 숫자 카드에 적혀있는 숫자가 주어진다. 숫자 카드에 적혀있는 숫자는 -10,000,000보다 크거나 같고, 10,000,000보다 작거나 같다. 두 숫자 카드에 같은 숫자가 적혀있는 경우는 없다.
셋째 줄에는 M (1 ≤ M ≤ 500,000)이 주어진다. 넷째 줄에는 상근이가 가지고 있는 숫자 카드인지 아닌지를 구해야 할 M개의 숫자가 주어지며, 이 숫자는 공백으로 구분되어져 있다. 이숫자도 -10,000,000보다 크거나 같고, 10,000,000보다 작거나 같다



출력
 
첫째 줄에 입력으로 주어진 M개의 숫자에 대해서, 각 숫자가 적힌 숫자 카드를 상근이가 가지고 있으면 1을, 아니면 0을 공백으로 구분해 출력한다.


예제 입력 1 복사 
5
6 3 2 10 -10
8
10 9 -5 2 3 4 5 -10


예제 출력 1 복사 
 1 0 0 1 1 0 0 1


 */
public class Code_10815 {

	 public static boolean binary_search(int[] a, int num) {

	        int n = a.length;

	        int l = 0;

	        int r = n-1;

	        while (l <= r) {

	            int mid = (l+r)/2;

	            if (a[mid] == num) {

	                return true;

	            } else if (a[mid] > num) {

	                r = mid-1;

	            } else {

	                l = mid+1;

	            }

	        }

	        return false;

	    }

	    public static void main(String args[]) throws IOException {

	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	        int n = Integer.valueOf(br.readLine());

	        String[] line = br.readLine().split(" ");

	        int[] a = new int[n];

	        for (int i=0; i<n; i++) {

	            a[i] = Integer.valueOf(line[i]);

	        }

	        Arrays.sort(a);

	        int m = Integer.valueOf(br.readLine());

	        line = br.readLine().split(" ");

	        StringBuilder ans = new StringBuilder();

	        for (int i=0; i<m; i++) {

	            int num = Integer.valueOf(line[i]);

	            boolean res = binary_search(a, num);

	            if (res) {

	                ans.append("1 ");

	            } else {

	                ans.append("0 ");

	            }



	        }

	        System.out.println(ans);

	    }
}
