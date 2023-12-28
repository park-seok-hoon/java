package day14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArithmeticExceptionEx2 {

	public static void main(String[] args) {
		
	}
public static double calculate(int num1, char op , int num2)
{	throws RuntimeException{
	switch(op) {
	
	case'+': return num1+num2;
	case'-': return num1-num2;
	case'*': return num1*num2;
	case'%': return num1%num2;
		if(num2 ==0) { throw new ArithmeticException("0으로 나눌 수 없습니다.");
		}
		return num1 % num2 ;
	case '/':
		if(num2 ==0) { throw new ArithmeticException("0으로 나눌 수 없습니다.");
		}
		return num1 / (double)num2 ;
	default :
	
	}
	

}

}
}
