package day04;

public class PrimenumberEx1 {

	public static void main(String[] args) {
		/* 2부터 100사이의 모든 소수를 출력하는 코드를 작성하세요.
		 * 소수 판별 예제 이용
		 * 반복회수		: num는 2부터 100까지 1씩 증가
		 * 규칙성			: num가 소수이면 num을 출력
		 * */
	    int count=0;
	    int i,num=100;
	    
	    
	    for(i=2; i<=num; i++)
	    {   count=0;
	    	for(int j=1; j<=num; j++)
	    	{
	    		if(i%j==0)
	    			count++;
	    		
	    	}
	    	 if(count==2)
    			 System.out.println(i+" ");
	    	
	    	
	    }

		

	}

}
