package day06;

import java.util.Scanner;

public class AlphabetcountEx1 {

	public static void main(String[] args) {
		/* 단어를 입력받아 단어 각 알파벳이 몇번 나왔는지 출력하는 코드
		 * 입력 : apple
		 * a : 1
		 * e : 1
		 * l : 1
		 * p : 2
		 * */
		
		
		System.out.println('a'-'a'); //=0
		// 단어를 입력 -> 문자열을 입력
		Scanner sc=new Scanner(System.in);
		System.out.println("단어 입력 : (영어로만 입력) ");
		String words=sc.next();   //sc.nextLine()은 문장으로 할때 사용
		int [] array = new int[26];
		//반복문으로 문자열의 길이만큼 반복
		
		for(int i=0; i<words.length(); i++)
		 {	//문자열의 각 문자를 가져옴
			char ch = words.charAt(i); //문자열 
			//가져운 문자의 배열 번지 숫자를 증가
			//가져온 문자가 a이면 0번지에 있는 숫자를 1증가, b이면 1번지에 있는 숫자를 1증가
			
			array[ch-'a']++; //ch가 a이면 0번지 b이면 1번지 ~ z이면 25번지
		 }
	    for(int i=97; i<=122; i++)
	    {   
	    	char alpha=(char)i;
	    	System.out.println(alpha + " : "+ array[i-97]);
	    	
	    }
		
		//반복문으로 배열의 크기만큼(26개) 반복
	    System.out.println();
	    for(int i=0; i<array.length; i++)
	    {
	    	//개수가 0이 아닌 알파벳들을 출력
	    	if(array[i] !=0)
	    	{
	    		char ch = (char)('a'+i);
	    		System.out.println(ch + " : "+array[i]);
	    		
	    	}
	    	
	    }
	  System.out.println("===========");
	  
	  char ap='a';
	  for(int count : array) {
		  
		  if(count!=0)
		  {
			  System.out.println(ap+ " : "+count);
			  
		  }
		  ap++;
	  }
	    sc.close();
		
	}
		
	
	
		
}


