package day03;

public class WhileSumEx1 {

	public static void main(String[] args) {
		/* 1부터 5까지의 합을 구하는 코드를 작성하세요.
		 * 
		 * */
		
		int number=1;
		int sum=0;
		while(number<=5)
		{
			sum+=number;
			number++;
		}
		
		System.out.println(sum);

	}

}
