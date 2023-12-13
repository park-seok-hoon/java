package day04;

import java.util.Scanner;

public class UpDownGame {

	public static void main(String[] args) {
		/* Up Down 게임을 구현하세요.
		 * - 다음과 같은 메뉴를 가져야 합니다.
		 * 1. 새게임
		 * 2. 최고기록 확인
		 * 3. 프로그램 종료
		 * 
		 * - 새게임은 업다운 게임을 시작
		 *  -랜덤으로 생성된 수를 맞추는 게임
		 *  -맞췄을 때 맞춘 횟수를 출력하고 메뉴로 돌아감
		 * - 최고기록 확인 업다운 게임을 하면서 맞춘 횟수 중 가장 적은
		 *   횟수를 알려줌 
		 * */
		
		//반복문 -
			//메뉴를 출력
		
			//메뉴를 선택
		
			//선택한 메뉴에 따라 기능을 실행
			//1번메뉴 선택
				//업다운 게임을 실행
				//랜덤한 수 생성
				//반복문
					//정수 입력
					//입력횟수를 1 증가
					//입력한 정수와 랜덤한 수 비교후 up/down/정답 출력
				//게임이 끝났으면 현재 횟수와 최고기록 횟수보다 좋으면
				//최고 기록횟수를 현재 횟수로 수정
		
		//2번메뉴 선택
			//최고기록을 출력
		
		//3번메뉴 선택
			//프로그램을 종료
		
		int max=100,min=4;
		Scanner sc=new Scanner(System.in);
		int pick;  //1,2,3 중 하나를 고름
		int choice; //랜드 숫자를 맞추기 위한 변수
		int correctchoice=0; // 랜드 숫자를 맞추기 위해 도전한 횟수
		
		int rand=(int)(Math.random() *(max+min-1)+min);
		int max1=0;
		do{
			
			System.out.println("1. 새게임");
			System.out.println("2. 최고기록 확인");
			System.out.println("3. 프로그램 종료");
			
			System.out.println();
			
			pick=sc.nextInt();
			
			 
			
			if(pick==2)
	    	 {   System.out.println("메뉴 선택 : "+pick);
	    		 System.out.println("최고기록:"+max1);
	    		 System.out.println();
	    	 }
			
			 
			 if(pick==1) //1번 메뉴 선택
		     {   
				 System.out.println("메뉴 선택 : "+pick);
				correctchoice=0;
				System.out.println("업 다운 게임 시작");
				System.out.println("랜덤한 수"+rand);
		    	
		    	 
		    	 do
		    	 {   System.out.print("수를 선택하세요 : ");
		    		 choice=sc.nextInt();
		    		 
		    		 if(choice==rand)
		    		 {    correctchoice++;
		    			 System.out.println("맞았습니다."+correctchoice +"번만에 맞춤");
		    			 
		    			 if(max1<correctchoice)
		    				 max1=correctchoice;
		    			 break;
		    		 }
		    		 else { 
		    			 
		    			 if(choice<rand)
		    				 System.out.println("up");
		    			 else if(choice>rand)
		    				 System.out.println("down");
		    				 
		    			 
		    			 correctchoice++;
		    			 System.out.println("틀렸습니다. 틀린 횟수:" +correctchoice);
		    			
		    		 }
		    		 
		    	 }while(choice!=rand);
		   
		    	 
		    	 
		    	 
		     }
			
		     
		
		       
		}while(pick!=3);
		
		System.out.println("프로그램을 종료합니다.");

		
		sc.close();
	}

}
