package day14;

import java.util.ArrayList;
import java.util.Scanner;

public class ListEx3 {

	public static void main(String[] args) {
		//속담을 입력받아 저장하고, 출력하는 코드를 작성하세요.
		Scanner sc=new Scanner(System.in);
		String a;
		ArrayList<String> list=new ArrayList<String>();
		System.out.println("속담 입력");
		for(int i=0; i<5; i++)
		{
			a=sc.nextLine();
			list.add(a);
			
		}
		
		for(int i=0; i<5; i++)
		{
			System.out.println(list.get(i));
			
		}
		
	}

}
