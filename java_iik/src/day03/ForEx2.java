package day03;

public class ForEx2 {

	public static void main(String[] args) {
		/* 1에서 10 사이의 짝수들의 합을 구하는 코드를 작성하세요.
		 * 반복회수	:
		 * 규칙성		:
		 * 반복문종료후	:
		 * 
		 * */
		int sum=0;
		
		for(int i=1; i<=10; i++)
		{
			
			if(i%2==0)
			sum+=i;	
		}
		
		System.out.println(sum);
	}

}
