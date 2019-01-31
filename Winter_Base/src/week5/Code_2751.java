package week5;

import java.util.Scanner;

/*
수 정렬하기 2 
 

문제
 

N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.




입력
 

첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄부터 N개의 줄에는 숫자가 주어진다. 이 수는 절댓값이 1,000,000보다 작거나 같은 정수이다. 수는 중복되지 않는다.




출력
 

첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.






예제 입력 1 복사 
 5
5
4
3
2
1





예제 출력 1 복사 
 1
2
3
4
5

*/
public class Code_2751 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int[] arr = new int[T];
		
		for(int i=0; i<T; i++) {
			arr[i] =sc.nextInt();
		}
		/*printArray(arr);*/
		mergeSort(arr, 0, arr.length-1);
		printArray(arr);
	}

	public static void printArray(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+"  ");
		}
		System.out.println();
	}
	
	public static void mergeSort(int arr[], int first, int last) {
		if(first<last) {
			int mid = (first+last)/2;
			mergeSort(arr,first,mid);
			mergeSort(arr,mid+1,last);
			merge(arr,first,mid,last);
		}
	}
	
	public static void merge(int arr[], int first, int mid, int last) {
		int i = first;
		int j = mid +1;
		int k = first;
		int temp[] = new int[arr.length];
		while(i<=mid && j<=last) {
			if(arr[i] < arr[j]) {
				temp[k++] = arr[i++];
			}else {
				temp[k++] = arr[j++];
			}
		}
		while(i <=mid)
			temp[k++] = arr[i++];
		while(j<=last)
			temp[k++] = arr[j++];
		for(int index=first; index<k; index++)
			arr[index] = temp[index];
	}
}
