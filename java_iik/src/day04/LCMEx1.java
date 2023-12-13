package day04;

import java.util.Scanner;

public class LCMEx1 {

	public static void main(String[] args) {
		/* 두 정수의 최소 공배수를 구하는 코드를 작성하세요.
		* 10의 배수 : 10, 20, 30, ...
		* 15의 배수 : 15, 30, 45, ...
		* 10과 15의 공배수 : 30, 60, 90, ...
		* 10과 15의 최소 공배수 : 30
		* 반복회수 	: i는 1부터 num1 * num2까지 1씩 증가
		* 규칙성		: i가 num1과 num2의 공배수이면 i를 출력하고 반복문 종료
		* 			->i가 num1의 배수이고, i가 num2의 배수이면 i를 출력하고 반복문 종료
		* 			->i를 num1으로 나누었을 때 나머지가 0과 같고 i를 num2로 나누었을 때 나머지가 0과 같다면
		* 			->i를 출력하고 반복문 종료
		* 
		*/
		Scanner sc=new Scanner(System.in);
		int one=sc.nextInt();
		int two=sc.nextInt();
		
		//i가 1부터 1씩 증가
		for(int i= 1 ; i<=one*two; i++)
		{
			if(i%one== 0 && i % two == 0)
			{
				System.out.println("최소공배수는 "+i);
			break;
			}
			
		}
		//i가 num1부터 num1씩 증가 -> i를 num1의 배수들로만 계산
		for(int i= 1 ; i<=one*two; one+=one)
		{
			if(i%one== 0 && i % two == 0)
			{
				System.out.println("최소공배수는 "+i);
			break;
			}
			
		}
		
		sc.close();
		
	
	}

}
