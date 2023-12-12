package day03;

public class WhileTestEx3 {

	public static void main(String[] args) {
		/* 1에서 10 사이의 모든 짝수를 순서대로 출력하는 코드를 작성하세요.
		 * 2
		 * 4
		 * 6
		 * 8
		 * 10
		 * 방법1
		 * i가 2부터 10까지 2씩 증가
		 * i를 출력
		 * 방법2
		 * i는 1부터 10까지 1씩 증가
		 * i가 짝수이면 i를 출력
		 * 방법3
		 * i는 1부터 5까지 1씩 증가
		 * 2*i를 출력
		 * */
		
		int number=1;
		int i;
		while(number<=10)
		{   	
			if(number%2==0)
			System.out.println(number);
			number++;
			
	
		}
		
		number=1;
		
		while(number <= 5)
		{
		   System.out.println(2*number);
		   ++number;
			
		}
		
		
		number=2;
		
		while(number<=10)
		{
			if(number%2==0)
			System.out.println(number);
			
			number+=2;
		}
		number =10;
		i=1;
		while(i<=number/2)
		{
			System.out.println(2*i);
			++i;
			
		}
		
	}
	

}
