package day04;

import java.util.Scanner;

public class DowhileEx1 {

		public static void main(String[] args) {
		 //q를 입력하기전까지 문자를 입력하면 입력받은 문자를 출력하는 예제
		 Scanner sc=new Scanner(System.in);
		 
		 char ch;
		 do {
			 System.out.print("입력 : ");
			 ch=sc.next().charAt(0);
			 System.out.println("문자 : "+ ch);
			 
	    }while(ch != 'q');
		 
		 sc.close();
		
			
			

	}

}
