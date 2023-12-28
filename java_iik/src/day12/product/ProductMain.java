package day12.product;

import java.util.Scanner;

public class ProductMain {
	
	static Scanner scan= new Scanner(System.in);
	
	static Product [] list = new Product[30];
	static int count =0;
	
	public static void main(String args[])
	{
		int menu;
		do {
			
			//메뉴 출력
			printMenu();
			//메뉴 선택
			menu=scan.nextInt();
			//기능 실행
			runMenu(menu);
			
		}while(menu != 3);
		
	}
	
	public static void printMenu() {
		System.out.println("--------메뉴----------");
		System.out.println("1. 제품 추가");
		System.out.println("2. 제품 확인");
		System.out.println("3. 종료");
		System.out.println("---------------");
		System.out.println("메뉴 선택 : ");
		
	}
	public static void runMenu(int menu) {
		switch(menu)
		{
			case 1:
				insertProduct();
				break;
			case 2:
				printProduct();
				break;
			case 3:
				System.out.println("프로그램 종료!");
				break;
			default:
				System.out.println("잘못된 메뉴입니다.");
				
		
		}
		
	}

	public static void insertProduct() {
		printProductTitle();
		int select = scan.nextInt();
		System.out.print("브랜드");
		scan.nextLine(); //위에서 입력한 엔터 처리
		String brand = scan.nextLine();
		System.out.println("제품명 : ");
		String title =scan.nextLine();
		System.out.println("제품코드 : ");
		String code =scan.next();
		
		//제품마다 추가 정보 입력
		switch(select)
		{
			case 1: //tv
				System.out.print("화면크기: ");
				int size = scan.nextInt();
				list[count++] =new Tv(brand,code,title,size);
				break;
			case 2:	//에어컨
				System.out.println("냉방면적: ");
				double area = scan.nextDouble();
				list[count++]=new Aircon(brand,code,title,area);
				
				break;
			case 3:	//노트북
				System.out.println("CPU : ");
				double cpu = scan.nextDouble();
				System.out.println("램     : ");
				int ram =scan.nextInt();
				list[count++] = new NoteBook(brand,code,title,cpu,ram);
				break;
			default:
				System.out.println("잘못된 제품입니다.");
				return;
		}
		System.out.println("등록이 완료됐습니다.");
		
	}
	
	public static void printProductTitle() {
		System.out.println("제품 목록");
		System.out.println("1. TV");
		System.out.println("2. 에어컨");
		System.out.println("3. 노트북");
		System.out.println("제품 선택 : ");
	}

	public static void printProduct() {
		
		if(count==0)
			{	System.out.println("등록된 제품이 없습니다.");
				return;
			}
			for(int i=0; i<count; i++)
		{
			list[i].print();
			
		}
	}
	
}
