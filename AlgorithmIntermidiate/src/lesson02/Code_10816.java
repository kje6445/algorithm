package lesson02;
import java.io.*;
import java.util.*;
/*
숫자 카드 2 

문제
 

숫자 카드는 정수 하나가 적혀져 있는 카드이다. 상근이는 숫자 카드 N개를 가지고 있다. 숫자 M개가 주어졌을 때, 이 숫자가 적혀있는 숫자 카드를 상근이가 몇 개 가지고 있는지 구하는 프로그램을 작성하시오.




입력
 

첫째 줄에 상근이가 가지고 있는 숫자 카드의 개수 N (1 ≤ N ≤ 500,000)이가 주어진다. 둘째 줄에는 숫자 카드에 적혀있는 숫자가 주어진다. 숫자 카드에 적혀있는 숫자는 -10,000,000보다 크거나 같고, 10,000,000보다 작거나 같다.

셋째 줄에는 M (1 ≤ M ≤ 500,000)이 주어진다. 넷째 줄에는 상근이가 몇 개 가지고 있는 숫자 카드인지 구해야 할 M개의 숫자가 주어지며, 이 숫자는 공백으로 구분되어져 있다. 이숫자도 -10,000,000보다 크거나 같고, 10,000,000보다 작거나 같다.




출력
 

첫째 줄에 입력으로 주어진 M개의 숫자에 대해서, 각 숫자가 적힌 숫자 카드를 상근이가 몇 개 가지고 있는지를 공백으로 구분해 출력한다.






예제 입력 1 복사 
 10
6 3 2 10 10 10 -10 -10 7 3
8
10 9 -5 2 3 4 5 -10





예제 출력 1 복사 
 3 0 0 1 2 0 0 2

*/
public class Code_10816 {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		int n = Integer.parseInt(br.readLine()); 
		  		String str = br.readLine(); 
		  		StringTokenizer st = new StringTokenizer(str, " "); 
		  		while (st.hasMoreTokens()) { 
		  			int key = Integer.parseInt(st.nextToken()); 
		  			if (map.containsKey(key)) 
		  				map.replace(key, map.get(key) + 1); 
		  			else 
		  				map.put(key, 1); 
		  		} 
		  
		 
		  		int m = Integer.parseInt(br.readLine()); 
		  		str = br.readLine(); 
		  		st = new StringTokenizer(str, " "); 
		  		while(st.hasMoreTokens()){ 
		  			int key = Integer.parseInt(st.nextToken()); 
		 			if(map.containsKey(key)) 
		  				bw.write(map.get(key)+" "); 
		  			else 
		  				bw.write("0 "); 
		  		} 
		  		 
		 		bw.flush(); 

	}

}
