package day11.product;

import java.util.Scanner;

public class ProductMain {
	
	private static Scanner sc=new Scanner(System.in);
	private static Product[] list = new Product[10];
	private static int count = 0;
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
		//반복문 : 프로그램 종료선택전까지
		
		do {
			//메뉴 출력
			printMenu();
			//메뉴 선택
			menu = sc.nextInt();
			//선택 메뉴에 맞는 기능 실행
			runMenu(menu);
		}while(menu != 5);
		
		//프로그램 종료 안내 문구
		System.out.println("프로그램 종료!");
	
	}
	
	public static void runMenu(int menu) {
		switch(menu)
		{
		case 1:
			storeProduct();
			break;
		case 2:
			break;
		case 3:
			 break;
		case 4:
			break;
		case 5:
			break;
			default:
				System.out.println("잘못된 메뉴입니다.");
		
		}
		
	}
	
	public static void storeProduct() { 
		//제품 정보를 입력
		System.out.println("제품명 : ");
		sc.nextLine(); //엔터 처리
		String name = sc.nextLine();
		
		System.out.println("수량 : ");
		int amount =sc.nextInt();
		
		System.out.println("구매 가격");
		int buyprice =sc.nextInt();
		
		System.out.println("판매 가격");
		int price= sc.nextInt();
		
		
		//일치하는 제품 정보가 잇으면 수량을 변경
		for(int i=0; i<count; i++)
		{	if(list[i].equals(name))
			{
				list[i].updateAmount(amount);
				return;	
			}
		}
		//없으면 추가
		list[count] = new Product(name, amount, buyprice, price);
		count++;
		
		//배열이 다 차면 확장
		if(count ==list.length) {
			expandList();	
		}
	}
	private static void expandList() {
		
	}

	public static void printMenu() {	//메뉴판
		System.out.println("메뉴");
		System.out.println("1. 제품 입고");
		System.out.println("2. 제품 판매");
		System.out.println("3. 제품 수정");
		System.out.println("4. 제품 내역");
		System.out.println("5. 프로그램 종료");
		System.out.println("메뉴 선택 : ");
		
	}
	
	
}
