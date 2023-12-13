package day04;

public class StarEx2 {

	public static void main(String[] args) {
		/* *		i=1  *=1
		 * **		i=2	 *=2
		 * *** 		i=3  *=3
		 * ****		i=4	 *=4
		 * ***** 	i=5  *=5
		 * 				*=i개
		 * 반복횟수	:  i는 1부터 5까지 1씩 증가
		 * 규칙성		:*를 i개 출력 후 엔터
		 * 			반복회수	:  j는 1부터 i까지
		 * 			규칙성	:	*을 출력
		 * 			반복문종료후 : 엔터
		 * 
		 * */
		
		int i,j;
		
		for(i=0; i<5; i++)
		{
			
			for(j=0; j<=i; j++)
			{
			   System.out.print("*");
				
			}
			System.out.println();
			
			
		}

	}

}
