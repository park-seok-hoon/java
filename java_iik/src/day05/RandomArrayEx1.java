package day05;

import java.util.Arrays;

public class RandomArrayEx1 {

	public static void main(String[] args) {
		/* 1~9사이의 랜덤한 수를 3개 생성해서 배열에 저장하는 코드를 작성하세요.
		 * 3개짜리 배열을 생성하여 랜덤한 수를 저장
		 * 
		 * */
		int max=9,min=1;
		int[] rnumber=new int[3];
		for(int i=0; i<3; i++)
		{   
			int rand=(int)(Math.random()*(max+min-1)+min);
			rnumber[i]=rand;
		}
		
		for(int i=0; i<3; i++)
		{
			System.out.print(rnumber[i]+" ");
			
		}

		System.out.println();
		Arrays.sort(rnumber);
		
		for(int i=0 ;i<3; i++)
		{
		System.out.print(rnumber[i]+" ");
		}

	}

}
