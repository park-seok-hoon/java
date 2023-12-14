package day05;

import java.util.Scanner;

public class ArrayScoreEx1 {

	public static void main(String[] args) {
	/* 학생 5명의 국어 성적을 입력받고, 총점과 평균을 구하는 코드를 작성하세요.
	 * */
		
		
		Scanner sc=new Scanner(System.in);
		int kscore[]=new int[5];
		int total=0;
		for(int i=0; i<5; i++)
		{	
			System.out.print("성적 입력:");
			kscore[i]=sc.nextInt();
			
			
		}
		
		for(int i=0; i<5; i++)
		{
			total+=kscore[i];
			
			
		}
		
		System.out.println("총점은 "+total+" 평균은 "+(double)total/5 );
		
		
		
		sc.close();
		
		
		
	}

}
