package day03;

import java.util.Scanner;

public class ForPrimeNumberEx1 {

	public static void main(String[] args) {
		/* 소수 판별 예제
		 * 주어진 정수가 소수인지 아닌지 판별하는 코드를 작성하세요.
		 * 소수는 약수가 2개인 수를 소수라고 함
		 * 약수는 어떤 수를 나누었을 때 나머지가 0이 되게 하는 수.
		 * 4의 약수:1,2,4
		 * 5의 약수: 1,5
		 * 반복회수	: i는 1부터 (정수)까지 1씩 증가
		 * 규칙성		: i가 num의 약수이면 약수의 개수를 1 증가
		 *			  num을 i로 나누었을 때 나머지가 0와 같으면 count를 1 증가
		 *반복문종료후 : count가 2이면 소수, 아니면 소수가 아님이라고 출력
		 */

    Scanner sc=new Scanner(System.in);
    
    int number=sc.nextInt();
    int count;
    int i;
    
    for(i=1,count=0; i <= number ; i++ )
    {
    	if(number%i==0) 
    	count++;	
    	
    }
    if(count==2)
    	System.out.println(number + "는 소수");
    else
    	System.out.println(number + "는 소수 아님");
    
    
    sc.close();
		
	}

}
