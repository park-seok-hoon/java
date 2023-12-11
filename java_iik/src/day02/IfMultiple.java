package day02;

import java.util.Scanner;

public class IfMultiple {

	// 정수를 입력받아 3의 배수인지 아닌지 판별하는 코드를 작성하세요.
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("정수를 입력하세요.");
		int number=sc.nextInt();
		
		if(number%3==0)
		System.out.println("3의 배수입니다.");
		else
			System.out.println("3의 배수가 아닙니다.");
		
		sc.close();
	}

}
