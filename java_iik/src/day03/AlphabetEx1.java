package day03;

public class AlphabetEx1 {

	public static void main(String[] args) {
		/* a부터 z까지 반복문을 이용하여 출력하는 코드를 작성하세요.
		 * 반복회수 :
		 * 규칙성  :
		 * 
		 * 
		 * */
		
		char ch='a';
        char c;
	    for(int i=97; i<=122; i++)
		{ c=(char)i;
	    	System.out.println(c);
		}
	    	
	    while(true)
	    {
	    	if(ch=='z')
	    		break;
	    	System.out.println(ch);
	    	ch+=1;
	  
	  }
	    
	    for(char ss='a'; ss<='z'; ss++)
	    	System.out.println(ss);
      
	    
}

}