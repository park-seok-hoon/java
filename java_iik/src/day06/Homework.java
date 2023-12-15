package day06;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		/* 숫자 야구에임을 구현하세요.
		 * 1~9사이의 중복되지 않은 3개의 수를 랜덤으로 선택해서 해당 숫자를 맞추는 게임
		 * - S :숫자가 있고 위치가 같은 경우
		 * - B :숫자가 있지만 위치가 다른 경우
		 * -O :일치하는 숫자가 하나도 없는 경우
		 * -35가 되면 게임이 종료
		 * 
		 * 예시
		 * 랜덤으로 생성된 숫자 : 3 9 1
		 * 입력 : 1 2 3
		 * 결과 : 2B
		 * 입력 : 4 5 6
		 * 결과 : out
		 * 입력 : 7 9 8
		 * 결과 : 1S
		 * 입력 : 3 1 9
		 * 결과 : 1S2B
		 * 입력 : 3 9 1
		 * 결과 : 3S
		 * 정답입니다. 
		 * */
		 Scanner sc=new Scanner(System.in);
		 int min=1,max=9;
	     int com[]=new int[3];
	     int count=0; //배열에 저장된 중복되지 않은 수의 개수
	     int user[]=new int[3];
	     int userinsert;   
		 System.out.println("랜덤으로 생성된 숫자 : ");
		 int rand;
		 int strikecounter=0;
		 int ballcounter=0;
		
		 
	     
	     while(true)
	     {
	    	 while(count< 3 ) {
	        	 //랜덤수 생성
	        	rand=(int)(Math.random()*(max+min-1)+min);
	        	
	        	//중복 확인
	        	boolean duplicated=false; //중복 여부를 알려주는 변수로, true이면 중복,false이면 중복이 아님
	        	
	        	for(int i =0; i<count; i++)
	        	{
	        		if(com[i]==rand)
	        		{  duplicated=true;
	        			break;
	        		}
	        		
	        		
	        	}
	        	//중복되지 않으면 저장 후 count 증가
	        	if(!duplicated)
	        	{   com[count]=rand;
	        		count++;		
	        	}
	        }  //중복 도출 끝
	     
	    	 
	    	
	    	 
	    	 
			     System.out.print("입력 : ");  //숫자 3개 입력 받기
				 int num1,num2,num3;
				 num1=sc.nextInt();    //숫자 1
				 num2=sc.nextInt();    // 숫자 2
				 num3=sc.nextInt();   // 숫자 3
				 
				 user[0]=num1;      //숫자 1 대입 사용자 배열 0번지
				 user[1]=num2;		//숫자 2 대입 사용자 배열 1번지
				 user[2]=num3;		//숫자 3 대입 사용자 배열 2번지
				 
				 for(int i=1; i<=3; i++)
				 {
					 System.out.print(com[i-1]+" ");  //랜덤 야구 숫자
					 
				 }
				 System.out.println();
				 
				for(int i=0; i<3; i++)
				{
					for(int j=0; j<3; j++)
					{
						if(user[i]==com[j])
						{
							ballcounter++;
						}
					}
					
				}
				
				for(int i=0; i<3; i++)
				if(user[i]==com[i])
				{
					ballcounter--;
				    strikecounter++;
				}
				
			
				
				
				if(strikecounter>0 && ballcounter >0)
				System.out.println("결과: "+strikecounter+"S"+ballcounter+"B");
				else if(strikecounter>0 && ballcounter==0)
				{
					System.out.println("결과: "+strikecounter+"S");
				
				}
				else if(strikecounter==0 && ballcounter>0)
					System.out.println("결과: "+ballcounter+"B");
				else if(strikecounter==0 && ballcounter==0)
					System.out.println("결과: "+"OUT");
						
				if(strikecounter==3)
				{	System.out.println("정답입니다.");
					break;
				}
				
				if(strikecounter==3)
				{	System.out.println("정답입니다.");
					break;
				}
				
				ballcounter=0;
				strikecounter=0;
			
				
				
	     }
			
		 
	     }
		 
		 
	

			 
	}
		 
		
		 
		 
		 
		 
	     
		 



