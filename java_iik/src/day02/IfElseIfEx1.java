package day02;

public class IfElseIfEx1 {

	//if else if문 예제
	public static void main(String[] args) {
	
		//num이 0이면 0이라고 출력하고, num이 양수이면 양수라고 출력하고,num이 음수이면 음수라고 출력하는
		//코드를 작성하세요.
		int num=3;
		
		
		if(num==0)
		{
			System.out.println("0입니다.");
		}
		else if(num>0)
		{
			System.out.println("양수입니다.");
			
		}
		else
			System.out.println("음수입니다.");
		
		
	
	}

}
