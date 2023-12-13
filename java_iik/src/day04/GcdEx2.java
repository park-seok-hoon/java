package day04;

import java.util.Scanner;

public class GcdEx2 {

	public static void main(String[] args) {
		/*두 정수의 공약수를 출력하는 코드를 작성하세요.
		 * 약수 : 나누어서 떨어지는 수
		 * 공약수 : 공통으로 있는 약수
		 * 12의 약수 : 1,2,3,4,6,12
		 * 8의 약수 : 1,2,4,8
		 * 8과 12의 공약수 : 1,2,4*/
		
		Scanner sc=new Scanner(System.in);
		int one=sc.nextInt();
		int two=sc.nextInt();
		
		if(one>two)
		for(int i=1; i<=one; i++)
		{	
			if(one%i==0 && two%i==0)
				System.out.print(i+" ");
		
		}	
		else if(one<two)
			for(int i=1; i<=two; i++)
			{	
				if(one%i==0 && two%i==0)
					System.out.print(i+" ");
			
			}	
			sc.close();
	}

}
