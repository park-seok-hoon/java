package day04;

import java.util.Scanner;

public class InfiniteLoopEx1 {

	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		while(true)
     {
        System.out.println("정수 입력 : ");
        int num = sc.nextInt();
       	System.out.println("정수 출력 : "+num); 
    	 
     }
		
		/*  for( ; ; )
		 *    {
			        System.out.println("정수 입력 : ");
			        int num = sc.nextInt();
			       	System.out.println("정수 출력 : "+num); 
    	 
     		  }
		 * 
		 * 
		 * */

	}

}
