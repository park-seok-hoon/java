package day05;

import java.util.Arrays;

public class ArraySortEx1 {

	public static void main(String[] args) {
		// 배열 정렬 방법
		
		int arr[] = new int[] {1,3,5,7,2,4,6,8};
		
		//버블정렬
		/* 옆에 인접한 값들을 비교하여 정렬하는 방식
		 * 1 3 5 7 2 4 6 8
		 * 오름차순 정렬 가정
		 * 1번쨰: 1 3 5 2 4 6 7 8
		 * 2번쨰: 1 3 2 4 5 6 7 8
		 * 3번쨰: 1 2 3 4 5 6 7 8
		 * */
		
		//버블정렬 구현
		for(int i= 0; i<arr.length-1; i++ ) //arr.length-1로 하는 이유는 2개씩 비교하므로 길이-1
		{
			 for(int j=0; j<arr.length-1; j++)
			 {
				 if(arr[j]>arr[j+1])
				   {int tmp= arr[j];
				    arr[j]= arr[j+1];
				    arr[j+1]=tmp; //변수가 필요해서 나오는 변수
				   } 
			 }
			
			
		}
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i] + " ");
			
		}
		
		System.out.println();
		int arr2[] = {1,3,5,7,9,2,4,6,8};
		//오름차순으로 정렬
		
		Arrays.sort(arr2); //퀵정렬,오름차순만 가능하다
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(+arr2[i] + " ");
			
		}
		
		System.out.println();
		

	}

}
