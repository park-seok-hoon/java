package day04;

public class StarEx4 {

	public static void main(String[] args) {
		/* 	  	  *      i=1   " "=4   *=1
		 *   	 ***     i=2   " "=3   *=3
		 *   	*****    i=3   " "=2   *=5
		 *     *******   i=4   " "=1   *=7
		 *    *********  i=5   " "=0   *=9
		 *    					5-i    2*i-1
		 * */
          int i;
		  int rows = 5;
		  for(i=1; i<5; i++)
		  {   
			  //공백 추가
			  for(int j=1; j<rows-i; j++)
			  {
				  System.out.print(" ");
				  
			  }
			  //*출력 2*i-1개
			  for(int j=1; j<=2*i-1; j++)
			  {
				  System.out.print("*");
				  
			  }
             //엔터
			  System.out.println();
		  }
		
		  for(i=1; i<5; i++)
			  System.out.println();
			/*2번쨰 방법
			 *  	  *      i=1    " "=4   *=1 
			 *   	 ** *     i=2   " "=3   *=3
			 *   	*** **    i=3   " "=2   *=5
			 *     **** ***   i=4   " "=1   *=7
			 *    ***** ****  i=5   " "=0   *=9
			 *    					
			 * */
	        
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
			   for(int j=1; j<=i-1; j++)
			   {
				   System.out.print("*");
				   
			   }
			   
			   
			   
			   System.out.println();
			 
				
			   
				
				
			}  
		  
		
	}
		
}


