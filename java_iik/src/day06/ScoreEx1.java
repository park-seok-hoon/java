package day06;

import java.util.Scanner;
public class ScoreEx1 {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		int menu;
		int subject = 0,studentnum,score,submenu; //과목,학생 번호 선택,성적 입력
		int maxStudent=30;
		int [] kor=new int[maxStudent];
		int [] eng=new int[maxStudent];
		int [] math=new int[maxStudent]; 
		
					do {
					System.out.println("메뉴");
					System.out.println("1.성적수정");
					System.out.println("2.성적조회");
					System.out.println("3.프로그램 종료");
					System.out.print
					("메뉴 선택 :");
					menu=sc.nextInt();
					
					switch(menu)
					{	
						case 1: //성적수정 번호
						System.out.println("1.국어");
						System.out.println("2.영어");	
						System.out.println("3.수학");
						
						System.out.print("과목 선택:");
						subject=sc.nextInt();
						System.out.print("학생 선택");
						studentnum=sc.nextInt();
						System.out.print("성적 입력");
						score=sc.nextInt();
						
								switch(subject) //국어 영어 수학 성적 번호별 입력
								{
									case 1:
										kor[studentnum]=score;
										break;
									case 2:
										eng[studentnum]=score;
										break;
									case 3:
										math[studentnum]=score;
										break;
								}
						break;
						
						case 2: //성적조회 번호
							System.out.println("1.과목별조회");
							System.out.println("2.학생별조회");
							System.out.print("선택 :");
							submenu=sc.nextInt();	//성적조회->1,2번 중 택 서브 메뉴
								
							switch(submenu)
								{	
									case 1: //1.과목별조회
									
									System.out.println("1.국어");
									System.out.println("2.영어");
									System.out.println("3.수학");
									System.out.println("과목 선택 :");
									
											switch(subject)
											{
												case 1:
													for(int i=0; i<30; i++)
															System.out.println((i+1)+"번 : "+kor[i]+"점");
													break;
												case 2:
													for(int i=0; i<30; i++)
															System.out.println((i+1)+"번 : "+eng[i]+"점");
													break;
												case 3:
													for(int i=0; i<30; i++)
															System.out.println((i+1)+"번 : "+math[i]+"점");
													break;
											
											}
											break;
									case 2:  //학생별조회
									System.out.println("학생 선택 :");
									studentnum=sc.nextInt();
									System.out.println("국어 : "+kor[studentnum]);
									System.out.println("영어 : "+eng[studentnum]);
									System.out.println("수학 : "+math[studentnum]);
					
								}
							
							break;
						case 3:
							System.out.println("프로그램을 종료합니다.");
							break;
						default :
					 System.out.println("메뉴를 다시 고르세요");
					}
					
					
					}while(menu!=3);
	
		sc.close();
	}

}
