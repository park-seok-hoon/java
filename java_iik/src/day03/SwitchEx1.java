package day03;

public class SwitchEx1 {

	// switch문 예제
	public static void main(String[] args) {
		/*정수가 0인지 아닌 판별하는 예제
		 * */

		int number=0;
		switch(number)
		{
		case 0: //0인 경우
		System.out.println("0입니다.");
			break;
			
		default:
			//0이 아닌 경우
			System.out.println(number + "는 0이 아닙니다.");
		}

	}
}
