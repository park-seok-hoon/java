package day06;
import java.util.Scanner;
public class ScoreEx1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		/* 다음 기능을 가진 성적 관리 프로그램을 작성하세요.
		 * - 1반의 성적을 관리
		 * - 최대 30명
		 * - 성적은 번호순으로 관리
		 * - 성적은 국어, 영어, 수학 성적을 관리
		 * 메뉴
		 * 1.성적수정
		 * 2.성적조회
		 * 3.프로그램 종료
		 * 메뉴 선택 : 
		 * 
		 * --성적수정--
		 * 1. 국어
		 * 2. 영어
		 * 3. 수학
		 * 과목 선택 :
		 * 
		 * 학생 선택 : (3번학생) 번호를 선택
		 * 성적 입력 : 100
		 * 
		 * --성적조회--
		 * 1. 과목별조회
		 * 2. 학생별조회
		 * 선택 : 1
		 * 
		 * --과목별조회--
		 * 1. 국어
		 * 2. 영어
		 * 3. 수학
		 * 
		 * 과목 선택 : 
		 * 1번 : 0점
		 * 2번 : 0점
		 * 3번 : 100점
		 * 
		 * ...
		 * 30번 : 0점
		 * 
		 * --성적조회--
		 * 1. 과목별조회
		 * 2. 학생별조회
		 * 선택 : 2
		 * 학생 선택 : 3
		 * 국어 : 100점
		 * 영어 : 0점
		 * 수학 : 0점
		 * */

		
		 // 메뉴
		 // 1.성적수정
		 // 2.성적조회
		 // 3.프로그램 종료
		int menu=0;
		int submenu=0;
		int select_stud; //학생 선택 변수
		int subject;    ///과목 변수
		int score;
		int Kor[]=new int[30]; //국어 배열 30
		int Eng[]=new int[30];  //영어 배열 30
		int Math[]=new int[30]; //수학 배열 30
		
	    do
		{
			 System.out.print("메뉴\n1.성적수정\n2.성적조회\n3.프로그램 종료");
			 System.out.print("메뉴 선택:");                              
			 menu=sc.nextInt();	//메뉴 선택 변수 입력
		
			 
			 switch(menu)
			 {
			 case 1:
			 {  System.out.println("--성적수정--");
				System.out.println("1. 국어");
				System.out.println("2. 영어");
				System.out.println("3. 수학");
				System.out.print("학생 선택 :");
				select_stud=sc.nextInt();  	 	//학생 선택 변수 입력
				System.out.print("과목 선택 :");
				subject=sc.nextInt(); 			//과목 선택 변수 입력
				System.out.print("성적 입력 : ");
				score=sc.nextInt();   			//성적 입력 변수 입력
			 
			 }
			 case 2: //성적조회
			 {
				 System.out.println("1. 과목별조회");
				 System.out.println("2. 학생별조회");
				 System.out.println("선택 : ");
				 submenu=sc.nextInt();
				 
				 if(submenu==1)
				 {
					 System.out.println("1. 국어");
					 System.out.println("2. 영어");
					 System.out.println("3. 수학");
					 System.out.println("과목 선택 : ");
					 System.out.println("1번 : "+ +"점");
					 System.out.println("2번 : "+ +"점");
					 System.out.println("3번 : "+ +"점");
				 }
				 else if(submenu==2)
				 {
					 
				 }
				 
			 } 
			 
			 }
		
			 }while(menu==3);
		
		
		
		
	
	
	}

}
