package day04;

import java.util.Scanner;

public class TestEx1 {

	public static void main(String[] args) {
		/* Scanner를 이용하여 국어,영어,수학 성적을 입력받고,
		 * 총점과 평균을 구하는 코드를 작성하세요. */
		Scanner sc=new Scanner(System.in);
		
		//성적을 입력받기 위한 안내 문구 출력
		//성적을 Scanner를 통해 입력
		
		//성적의 총점과 평균을 계산
		
		//성적의 총점과 평균이 출력
		
		
		
		System.out.print("국어,영어,수학을 입력하세요.");
		int Kor=sc.nextInt();
		int eng=sc.nextInt();
		int math=sc.nextInt();
		int sum=Kor+eng+math;
		int avg=sum/3;
		
		
		System.out.println("총점은 "+sum + " 평균은 "+(double)avg);
		
		
		
		
		
		
		sc.close();
		
	}

}
