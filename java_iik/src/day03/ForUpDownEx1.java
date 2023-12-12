package day03;

import java.util.Scanner;

public class ForUpDownEx1 {

	public static void main(String[] args) {
		/* 숫자 업다운 게임을 작성하세요.
		 * 랜덤으로 생성된 숫자를 맞추는 게임. 1~100
		 * 예시
		 * 랜덤으로 생성된 숫자 : 30
		 * 정수 : 50
		 * down!
		 * 정수 : 20
		 * up!
		 * 정수 : 30
		 * 정답!
		 * */
		Scanner sc=new Scanner(System.in);
		int max=100;
		int min=1;
		int rands=(int)(Math.random() * (max+min+1)+min);
	    int number=min-1;
	/*
		for( ; ; )
		{
			System.out.println("랜덤한 수"+ rands);
			System.out.print("정수 : ");
		 int number=sc.nextInt();
			
		if(number==rands)
		{ 
			System.out.println("정답입니다.");
			break;
		}
			if(number>rands)
			System.out.println("UP!");
			else if(number<rands)
				System.out.println("Down!");
		}
		*/

		for(; number!=rands;)
		{   	System.out.println("랜덤한 수 "+ rands);
		    number=sc.nextInt(); 
			
		    if(number==rands)
			System.out.println("정답입니다.");
		    else if(number>rands)
			System.out.println("UP!");
			else if(number<rands)
				System.out.println("Down!");
			
			
		}
		
		
		sc.close();
		
	
	}

}
