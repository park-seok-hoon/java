package day05;

import java.util.Arrays;

public class LottoEx1 {

	public static void main(String[] args) {
		/* 1~45 사이의 랜덤한 수 6개를 생성하여 출력하는 예제 작성
		 * 단, 정렬이 되게끔
		 * */
		//랜덤으로 중복되지 않은 6개의 수를 생성
		
		int lotto[]=new int[6];
	    int max=45,min=1;
		int count=0;
		
		while(count<lotto.length)
		{
			int rand=(int)(Math.random()*(min+max-1)+min);
			
			int i;
			
			for(i=0; i<count; i++)
			{
				if(lotto[i]==rand)
					break;
				
			}
			//중복되지 않으면 저장 후 count 증가
			if(i == count)
			{  
				lotto[count++]= rand;
			}
			
		}
		
		for(int i=0; i<lotto.length-1; i++)
		{
			
			for(int j=0; j<lotto.length-1; j++)
			{
				
				 if(lotto[j]>lotto[j+1])
				 {   
					 int tmp;
				 	 
					 tmp=lotto[j];	 
				  	 lotto[j]=lotto[j+1];
					 lotto[j+1]=tmp;
					 
					 
					 
				 }
					
			}	
		}
		
		
		for(int i=0; i<lotto.length; i++)
		{
			System.out.print(lotto[i]+" ");
			

		}
		
		
	}

}
