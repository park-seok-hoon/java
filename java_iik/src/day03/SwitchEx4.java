package day03;

import java.util.Scanner;

public class SwitchEx4 {

	public static void main(String[] args) {
		/* 산술 연산자와 두 정수를 입력받아
		 * 산술연산자에 맞는 연산 결과를 출력하는 코드를 작성하세요.
		 * 예1
		 * 두 정수와 연산자 입력 (예: 1 + 2) : 1 + 2
		 * 1 + 2 =3
		 * 예2
		 * 두 정수와 연산자 입력(예: 1 + 2) : 1 / 2
		 * 예3
		 * 두 정수와 연산자 입력 (예: 1 + 2) : 1 ? 2
		 * ?는 산술연산자가 아닙니다.
		 */
		Scanner sc=new Scanner(System.in);
		
		System.out.println("두 정수와 연산자 입력 (예: 1 + 2)");
		int num1=sc.nextInt();
		char operator=sc.next().charAt(0);
		int num2=sc.nextInt();
		
		
		switch(operator)
		{
		case '+':
			System.out.println(num1+ " " + operator + " " +num2 + " =" + (num1+num2));
			break;
		case '-':
			System.out.println(num1+ " " + operator + " " +num2 + " =" + (num1-num2));
			break;
		case '*':
			System.out.println(num1+ " " + operator + " " +num2  + " =" + (double)(num1)*num2);
			break;
		case '/':
			System.out.println(num1+ " " + operator + " " +num2  + " =" + (double)num1/num2);
			break;
		case '%':
			
			System.out.println(num1+ " " + operator + " " +num2  + " =" + (double)num1+num2);
			break;
			default:
				System.out.println(operator+"는 산술 연산자가 아님");
		
		}
		
		
		sc.close();
		
		
	}

}
