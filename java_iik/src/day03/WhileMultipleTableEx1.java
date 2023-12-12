package day03;

public class WhileMultipleTableEx1 {

	public static void main(String[] args) {
		/* 구구단 2단을 출력하는 코드를 작성하세요.
		 * 2 * 1 = 2
		 * 2 * 2 = 4
		 * ...
		 * 2 * 9 = 18
		 * 반복회수 	:i는 1부터 9까지 1씩 증가
		 * 규칙성		: 2 X i = 2*i를 출력
		 * 반복문종료후	: 없음
		 * */
		
		int num1=2,num2=1;

		while(num2<=9)
		{
			
			System.out.println(num1 + " * " + num2 + " = " + (num1*num2) );
			num2++;
		}
		
		
	}

}
