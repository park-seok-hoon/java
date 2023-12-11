package day02;

import java.util.Scanner;

public class TextEx3 {

	public static void main(String[] args) {
		// 정수를 입력받아 0인지, 양수인지, 음수인지 판별하는 코드를 작성하시오.
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		int number=sc.nextInt();
		
		if(number==0)
			System.out.println("0입니다.");
		else if(number>0)
			System.out.println("양수입니다.");
		else
			System.out.println("음수입니다.");
		
		
		sc.close();
		

	}

}
