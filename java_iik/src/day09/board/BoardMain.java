package day09.board;
import java.util.Scanner;
public class BoardMain {
	private static Scanner scan=new Scanner(System.in);
	private static Board [] boardList = new Board[5]; //게시글 목록
	private static int boardNum = 1; //추가될 게시글 번호
	private static int count = 0; //현재 등록된 게시글 개수
	
/* 게시판에서 게시글 관리를 위한 콘솔 프로그램 작성하세요.

	 * - 제한사항 정리
	 *   - 게시판은 1개
	 *   - 로그인, 회원가입 구현 X => 게시글 작성 시 아이디를 입력
	 *   - 게시글 제목과 내용은 한 줄만 가능
	 *   - 작성일을 입력 
	 * 1. 필요한 기능을 정리해서 메뉴로 출력
	 * 
	 * 메뉴
	 * 		1.게시글 목록 조회
	 * 		2.게시글 등록
	 * 		3.프로그램 종료
	 * 		메뉴 선택 : 1
	 * 
	 * 	게시글 목록
	 * 		2. 가입인사 2023-12-20 tjrgs 1
	 * 		1. rhdwl 2023-12-19 admin 3 
	 * 
	 * 메뉴 ->게시글 목록조회 시
	 * 		1.게시글 상세 조회
	 * 		2.게시글 수정
	 * 		3.게시글 삭제
	 * 		4.뒤로가기
	 * 		메뉴 선택 : 1
	 * 	
	 * 	조회할 게시글 번호 : 2
	 * 		번호 : 2
	 * 		제목 : 안녕하세요.
	 * 		일자 : 2023-12-20
	 * 		작성자 : tirgs
	 * 		조회수 : 2
	 * 
	 * 메뉴
	 * 		1. 게시글 상세 조회
	 * 		2.게시글 수정
	 * 		3.게시글 삭제
	 * 		4.뒤로가기
	 * 		메뉴 선택 : 2
	 * 		수정할 게시글 번호 : 2
	 * 		제목 : 가입인사입니다.
	 * 		내용 : 만나서 반갑습니다.
	 * 		수정이 완료되었습니다.
	 * 게시글 목록
	 * 		2. 가입인사 2023-12-20 
	 * 메뉴
	 * 		1. 게시글 상세 조회
	 * 		2.게시글 수정
	 * 		3.게시글 삭제
	 * 		4.뒤로가기
	 * 		메뉴 선택 :4
	 * 메뉴
	 * 		1. 게시글 목록 조회
	 * 		2.게시글 등록
	 * 		3.프로그램 종료
	 * 		메뉴 선택 : 2
	 * 		제목 :테스트
	 * 		내용 : 테스트
	 * 		일자 : 201-12-20
	 * 		아이디:tjrgs
	 * 		등록이 완료되었습니다.
	 *  메뉴
	 * 		1. 게시글 목록 조회
	 * 		2.게시글 등록
	 * 		3.프로그램 종료
	 * 		메뉴 선택 : 1
	 * 게시글 목록
	 * 	3. 테스트 2023-12-20 qwe 0
	 *  2. 가입인사입니다. 2023-12-20 asd 2
	 *  
	 *  메뉴
	 * 		1. 게시글 목록 조회
	 * 		2.게시글 등록
	 * 		3.프로그램 종료
	 * 		메뉴 선택 :
	 * 2. 기능을 구현
	 * */
	
	public static void main(String[] args) {
		
		
		//반복문
		int menu;
		do {
			//메뉴 출력
			printMenu();
			//메뉴 선택
			menu = scan.nextInt();
			//선택한 기능 실행
			runMenu(menu);
		}while(menu != 3); //메뉴 3일때 종료
	}
/**
 * menu가 주어지면 menu에 맞는 기능을 실행하는 메서드
 * @param menu 실행할 메뉴의 번호
 */
private static void runMenu(int menu) {
	switch(menu)
	{
	case 1:             
	    //게시글 목록을 출력. 번호가 높은 순으로
		for(int i = A; i B C; D)
		
				//A는 초기값: count-1
				//B는 비교연산자: >=
				//C는 값 : 0
				//D는 증감연산식 : i--
				BoardList[i].printInfo();
		//서브메뉴를 출력
		
		//서브메뉴 선택
		
		//서브메뉴에 맞는 기능 실행
		break;
	case 2:
		//게시글 등록 기능을 구현
		insertBoard();
		for(int i= 0; i<count; i++)
		{  
			boardList[i].printInfoDetail();
		}
		//1. 게시글 배열이 필요(어느 위치에서 선언하고 생성할건지. 크기는 얼마로?)
		//제목, 내용, 일자, 아이디 순으로 입력받음
		//입력받은 정보들을 이용하여 게시글 인스턴스를 생성
		//생성된 인스턴스를 배열에 저장(몇번지)
		break;
	case 3:
		System.out.println("프로그램 종료");
		break;
	default:
			System.out.println("잘못된 메뉴입니다.");
	}
}
/** 게시글 정보를 입력받아 게시글을 등록하는 메서드
 *  
 */
private static void insertBoard() {
	scan.nextLine();//입력 버퍼에 남아있는 엔터 처리
	//제목, 내용, 일자, 아이디 순으로 입력받음
	System.out.print("제목 : ");
	String title =scan.nextLine();
	System.out.print("내용 : ");
	String contents = scan.nextLine();
	System.out.print("일자 : ");
	String date= scan.next();
	System.out.print("작성자: ");
	String writer =scan.next();
	//입력받은 정보들을 이용하여 게시글 인스턴스를 생성
	Board board = new Board(boardNum++, title, contents, writer, date);
	++boardNum; //추가될 게시글 번호를 1증가
	//생성된 인스턴스를 배열에 저장(몇번지)
	boardList[count] = board;
	++count; //저장된 개수를 1 증가
}
private static void printMenu() {
	System.out.println("---------메뉴---------");
	System.out.println("1. 게시글 목록 조회");
	System.out.println("2. 게시글 등록");
	System.out.println("3. 프로그램 종료");
	System.out.println("---------------------");
	System.out.print("메뉴 선택 : ");
	
}

}
