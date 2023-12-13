package day04;

public class StarEx3 {

	public static void main(String[] args) {
		/*		*  i=1  " "=4  *=1
		 * 	   **  i=2  " "=3  *=2
		 *    ***  i=3  " "=2  *=3
		 *   ****  i=4  " "=1  *=4
		 * 	*****  i=5  " "=0  *=5
		 * 				" "=5-i	   *=i개
		 *  반복문 공백을  5-1
		 *  		   5-2
		 * 			   5-3
		 * 			   5-4
		 * 			   5-5
		 * */

		int i,rows=5;
		
		for(i=1; i<=rows; i++)
		{  //" "을 5-i개 출력
		   for(int j=1; j<=5-i; j++)
		   {
			   System.out.print(" ");
			   
		   }
		   for(int j=1; j<=i; j++)
		   {
			   System.out.print("*");
			   
		   }
		   System.out.println();
		   //*을 i개 출력
			
		   //엔터
			
			
		}
		 
		
	}

}
