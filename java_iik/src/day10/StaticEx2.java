package day10;

public class StaticEx2 {

	public static void main(String[] args) {
	   
		System.out.println(sum1(1,2)); //sum1은 객체 없이 호출 가능
		
		StaticEx2 ex =new StaticEx2();
		System.out.println(ex.sum2(1, 2));
		//System.out.println(sum2(1,2)); //에러발생,sum2는 객체가 반드시 있어야 함
		

	}
	public static int sum1(int num1,int num2) {
		
		return num1+num2;
	}
	public int sum2(int num1, int num2)
	{
		return num1 + num2;
		
	}
	
	//(인스턴스)객체 메서드 : static이 안 붙어서
	public void test()
	{ 	System.out.println(sum1(1,2));
		System.out.println(sum2(1,2));
		
	}
}

//지역변수: 스택 메모리에 생성
//멤버변수: 힙 메모리에 생성,객체가 Gc에 의해 수거될 때 해제 됨.
//클래스 변수:프로그램 영역 중 데이터 영역(상수,문자열,클래스변수)에 생성,프로그램이 종료될 때 해제
//싱글톤 : 인스턴스를 단 하나만 생성하는 디자인 패턴
//생성자는 private 클래스 변수를 이용하여 인스턴스 생성