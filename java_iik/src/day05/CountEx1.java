package day05;

import java.util.Scanner;

public class CountEx1 {

	public static void main(String[] args) {
		/* 1에서 9사이의 정수를 5개 입력받아 각 숫자가 몇 개씩 입력됐는지 출력하는 코드를 작성하세요.
		 * 1 2 3 1 2
		 * 1 : 2
		 * 2 : 2
		 * 3 : 1
		 * 4 : 0
		 * 5 : 0
		 * 6 : 0
		 * 7 : 0
		 * 8 : 0
		 * 9 : 0
		 * */
		//user가 5개 만큼 정수를 입력 가능한 배열 추가 한다. 배열 1
		int user[]=new int[5];
		int count[] = new int[10];
		//10개짜리 배열(각 숫자가 몇 개 입력 됐는지 저장하는 배열 - count) 선언
		
		//반복문으로 5개의 정수를 입력 받아 user에 저장하고,count배열에 입력받은 정수번지에 해당하는 숫자를 1 증가
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("1~9 사이의 정수를 입력:");
		for(int i=0; i<5; i++)
		{
			
			user[i]=sc.nextInt();
			
		}
		
		for(int j=0; j<user.length; j++)
		{
			for(int i=1; i<=9; i++)
			{
				if(user[j]==i)
				{
					count[i-1]++;
					
				}
			}
		}
		for(int i=0; i<9; i++)
		{
			
			System.out.println(i+1+" : "+ count[i]);
			
		}
		
		
		
	    //만약 유저가 입력한 수가 
		
		
		
		
		sc.close();
	}

}
