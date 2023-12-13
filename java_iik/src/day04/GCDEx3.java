package day04;

import java.util.Scanner;

public class GCDEx3 {

	public static void main(String[] args) {
		/* 두 정수의 최대 공약수를 구하는 코드를 작성하세요.
		 * 최대 공약수 : 공약수 중 가장 큰 공약수
		 * 약수 : 나누어서 떨어지는 수
		 * 공약수 : 공통으로 있는 약수
		 * 12의 약수 : 1,2,3,4,6,12
		 * 8의 약수 : 1,2,4,8
		 * 8과 12의 공약수 : 1,2,4
		 */
		Scanner sc=new Scanner(System.in);
		int one=sc.nextInt();
		int two=sc.nextInt();
		int max=0;
		if(one>two)
			for(int i=1; i<=one; i++)
			{	
				if(one%i==0 && two%i==0)
				{		System.out.print(i+" ");
					if(max<i)
					{
						max=i;
					
					}

				}
			}	
			else if(one<two)
				for(int i=1; i<=two; i++)
				{	
					if(one%i==0 && two%i==0)
					{
						System.out.print(i+" ");
				
						if(max<i)
							max=i;
						
					
					}
			
				}
		System.out.println("최대공약수는 : "+ max);
		
		
		sc.close();
		

	}

}
