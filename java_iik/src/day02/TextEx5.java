package day02;

import java.util.Scanner;

public class TextEx5 {

	public static void main(String[] args) {
		/* 월을 입력받아 입력받은 월의 계절을 출력하세요.
		 * 3,4,5 봄
		 * 6,7,8 여름
		 * 9,10,11 가을
		 * 12,1,2 겨울
		 * 그 외 :잘못된 월
		 * */ 
		Scanner sc=new Scanner(System.in);
		
		System.out.println("월을 입력하세요.");
		int month=sc.nextInt();
		
		if(month>=3 && month<=5)
			System.out.println("봄입니다.");
		else if(month>=6 && month<=8)
			System.out.println("여름입니다.");
		else if(month>=9 && month<=11)
			System.out.println("가을입니다.");
		else if(month==12 || month>=1 && month<=2)
			System.out.println("겨울입니다.");
		else
			System.out.println("잘못된 월입니다.");
		
		
		if(month< 1 || month >12)
			System.out.println("잘못된 월입니다.");
		else if(month <=2 || month ==12)
			System.out.println("겨울입니다.");
		else if(month<=5)
			System.out.println("봄입니다.");
		else if(month<=8)
			System.out.println("여름입니다.");
		else if(month<=11)
			System.out.println("가을입니다.");
		
		
		
		sc.close();

	}

}
