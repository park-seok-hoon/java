package day14;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class LottoEx1 {
	public static int count=0;
	public static int bonusnumber=0;
	public static void main(String args[] )
	{   Scanner sc=new Scanner(System.in);
		/* 랜덤으로 당첨 번호를 생성하고, 사용자가 로또 번호를 입력하면 등수를 알려주는 코드를 작성하세요.
		 * 단 컬렉션을 이용
		 * 당첨번호 : 6개, 보너스 : 1개
		 * 사용자 : 6개
		 * 번호 범위 : 1~45 
		 * */
		
		List<Integer> list =new ArrayList<Integer>();
		int min = 1, max = 45;

	
		for(int i=0; i<7; i++)
		{	
			Random random = new Random();
			int tmp = random.nextInt(max - min + 1)+ min;
			list.add(tmp);
		}
		
		for(int i=0; i<list.size(); i++)
		{
			System.out.print(list.get(i)+" ");
		}
		
		List<Integer> user = new ArrayList<Integer>();
		
		System.out.println();
		for(int i=0; i<7; i++)
		{	int number=sc.nextInt();
			user.add(number);
		}
		
		for(int i=0; i<list.size(); i++)
		{
			
			System.out.print(user.get(i)+" ");
		}
		
		
		
	
	}
		
		
	
}

