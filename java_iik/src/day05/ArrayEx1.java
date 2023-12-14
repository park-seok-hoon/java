package day05;

import java.util.Scanner;

public class ArrayEx1 {

	public static void main(String[] args) {
		//학생 5명의 국어 성적을 저장하기 위한 배열
		
		Scanner sc=new Scanner(System.in);
		int score[]=new int[5];
		
		for(int i=0; i<5; i++)
		{
			System.out.print("학생의 성적을 입력하세요.");
			score[i]=sc.nextInt();
			
		}
	
	for(int i=0; i<5; i++)
	{
		System.out.println("학생" + (i+1) + "성적 : "+score[i]);
		
		
	}
		
		
		
		
		
		
		
		sc.close();
	}

}
