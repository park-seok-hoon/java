package day01;

public class VaraibleEx5 {

	// String 선언 예제
	public static void main(String[] args) {
	  
		//기본형 변수에는 null로 저장이 불가능하다
		String str1=null;
		//string은 참조형 변수여서 null이 가능하다
	  System.out.println(str1);
	  
	  String str2= "Hello";
	  System.out.println(str2);
	 //String 클래스에 문자를 저장할 수 없다.
	  //String str3='a';
	  String str4="A";
	  System.out.println(str4);
	  
	  //String 클래스에 빈 문자열을 저장할 수 있다.
	  String str5="";
	  System.out.println(str5);
	  //문자열에 정수 또는 실수 또는 논리값을 더하면 문자열이 됨
	 //빈문자열 + 'A'는 "A"가 되어서 저장이 가능
	  String str6= "" + 'A';
	  System.out.println(str6);
	}

}
