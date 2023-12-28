package day14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArithmeticExceptionEx1 {
	public static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		//두 정수와 산술 연산자를 입력받아 산술연산하는 코드를 작성하세요.
		//단, 0으로 나눌 때 예외처리를 적용
		int num1,num2;
		char op;
		System.out.print("정수와 산술 연산자 입력");
		num1=sc.nextInt();
		op=sc.next().charAt(0);
		num2=sc.nextInt();
	
		try {	
			
			switch(op)
			{
		
			case '+':
				System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
				break;
			case '-':
				System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
				break;
			case '*':
				System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
				break;
			case '%':
				System.out.println(num1 + " % " + num2 + " = " + (num1%num2));
				break;
			case '/':
				System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
				break;
			}	
			
			}catch(ArithmeticException e)
			{
				
				System.out.println(num1 + " 로 " + num2 +" 를 나눌수 없다.");
				
			}catch(InputMismatchException e)
			{
				System.out.println("입력을 잘 못했습니다.");
			}
			
		
		
	}

}
