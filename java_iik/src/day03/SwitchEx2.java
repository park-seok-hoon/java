package day03;

import java.util.Scanner;

public class SwitchEx2 {
	//switch문 예제
	public static void main(String[] args) {
		//정수를 입력받아 입력받은 정수의 홀짝 판별 예제를 switch문을 이용하여 작성하세요.

		Scanner sc=new Scanner(System.in);
		System.out.print("숫자를 입력하세요");
		int number=sc.nextInt();
		
		switch(number%2)
		{
		case 0: 
			System.out.println("짝수입니다.");
			break;
		case 1:
			System.out.println("홀수입니다.");
		break;
		}
		
		
		
		sc.close();
	}

}
