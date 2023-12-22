package day11.product;

import java.util.Scanner;

public class Productpractice {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		/* 제품을 관리하는 프로그램 구현하세요.
		 * 메뉴
		 * 1. 제품 입고 (추가와 수정이 섞여 있는 기능)
		 * 	- 제품을 판매하기 위해 다른 곳에서 제품을 구매
		 * 2. 제품 판매
		 * 	- 입고된 제품을 판매
		 * 3. 제품 수정[가격]
		 * 4. 매출 내역 조회
		 * 5.종료
		 * */
		int menu;
		
		do {
			System.out.println("선택할 메뉴 번호");
			System.out.println("1.제품 입고");
			System.out.println("2.제품 판매");
			System.out.println("3.제품 수정[가격]");
			System.out.println("4.매출 내역 조회");
			System.out.println("5.종료");
			sy
			menu=sc.nextInt();
			
			switch(menu)
	{   case 1:
			System.out.println("제품 입고");
			break;
		case 2:
			System.out.println("제품 판매");
			break;
		case 3:
			System.out.println("제품 수정[가격]");
			break;
		case 4:
			System.out.println("매출 내역 조회");
			break;
		case 5:
			System.out.println("종료");
			break;
	}

	}while(menu!=5);

}

class product{
	public static int sales_history=0;
	String p_name;	//제품 이름
	String p_code;	//제품 코드
	int p_count;	//제품 개수
	int p_price;	//제품 가격
	
	public product(String p_name,String p_code,int p_price, int p_count)
	{
		this.p_name=p_name;
		this.p_code=p_code;
		this.p_price=p_price;
		this.p_count=p_count;
		
	}
	
	public void p_print()
	{
		System.out.println("제품 이름:"+p_name);
		System.out.println("제품 코드:"+p_code);
		System.out.println("제품 개수:"+p_count);
		System.out.println("제품 가격:"+p_price);
		
	}
	}
	
	//제한 사항 품목 무게,기한,품목
	
	
}