package day06;

import java.util.Scanner;

public class ArithmeticEx1 {

	public static void main(String[] args) {
		/* 랜덤으로 산수(+, -, *) 문제를 생성하여 맞추는 게임
		 * 1 + 2 =3
		 * 피연산자 2개,연산자 1개를 랜덤으로 만들고 숫자 범위는 1~99,연산자는 +,-,*
		 * 
		 * 2 * 3 = 5
		 * 틀렸습니다.
		 * */
		
		int user = 0; //내가 쓰는 답
		int max=99,min=1;
		int omax=3,omin=1;
		Scanner sc=new Scanner(System.in);
		char ch = 0;
		
		while(true)
		{    
			System.out.print("시작을 원하면(o) 아니면 (x)");
			ch=sc.next().charAt(0);
			if(ch=='o')
				System.out.println("시작");
			else if(ch=='x')
			{	System.out.println("종료");
			break;
			}
			int pop1=(int)(Math.random()*(max+min-1)+min);
			int operator=(int)(Math.random()*(omax+omin-1)+min);
			int pop2=(int)(Math.random()*(max+min-1)+min);
		
			
		   if(operator==1)
			   System.out.print(pop1 +" + " + pop2 +"=");
		   else if(operator==2)
			   System.out.print(pop1 +" - " + pop2 +"=");
		   else if(operator==3)
			   System.out.print(pop1 +" * " + pop2 +"=");
			user=sc.nextInt();
			   if(user==(pop1+pop2)||user==(pop1-pop2)||user==(pop1*pop2))
				   System.out.println("정답입니다.");
			   else
				   System.out.println("틀렸습니다.");
		}
		
		/*2번째 방법
		switch(operator)
		{
		case 1 :
			System.out.print(pop1 +" + " + pop2 +"=");
			user=sc.nextInt();
			if(user==(pop1+pop2))
				System.out.println("정답입니다.");
			else
				System.out.println("틀렸습니다.");
		    break;
		case 2 :
			System.out.print(pop1 +" - " + pop2 +"=");
			user=sc.nextInt();
			if(user==(pop1-pop2))
				System.out.println("정답입니다.");
			else
				System.out.println("틀렸습니다.");
		    break;
		case 3 :
			System.out.print(pop1 +" * " + pop2 +"=");
			user=sc.nextInt();
			if(user==(pop1*pop2))
				System.out.println("정답입니다.");
			else
					System.out.println("틀렸습니다.");
		    break;

		}
		*/

		
	}

}
