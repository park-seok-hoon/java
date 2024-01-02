package day15;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MapEx2 {

	public static void main(String[] args) {
		/*	회원을 관리하는 프로그램을 작성하세요.
		 * 	메뉴
		 * 	1. 회원가입
		 * 		-아이디와 비번만 입력	
		 * 		-이미 가입된 회원인지 체크(containsKey)
		 * 2. 회원검색
		 * 		-아이디를 입력해서 회원 정보를 조회
		 * 3.종료
		 * 
		 * */
		int menu;
		Scanner sc=new Scanner(System.in);
		Map<String,String> map = new HashMap<String,String>();
		String id,pw;
		
		do {
			menuboard();
			menu=sc.nextInt();
			switch(menu)
			{
			case 1:
				System.out.print("아이디 입력");
				id=sc.next();
				System.out.println("비밀번호 입력");
				pw=sc.next();
				if(map.containsKey(id))
				{	System.out.println("이미 가입된 회원 아이디입니다.");
					continue;
				}
				else
				map.put(id,pw);
				break;
			case 2:
				Set<Map.Entry<String,String>> entrySet = map.entrySet();
				System.out.println();
				
				for(Map.Entry<String,String> tmp : entrySet) {
					System.out.println("[ " + tmp.getKey() + " , "+ tmp.getValue() + "]");
				}
				break;
			case 3:
				System.out.println("종료합니다.");
				break;
			
			}
		}while(menu!=3);
	}

	public static void menuboard() {
		System.out.println("메뉴");
		System.out.println("1. 회원가입");
		System.out.println("2. 회원검색");
		System.out.println("3. 종료");
		
	}

}
