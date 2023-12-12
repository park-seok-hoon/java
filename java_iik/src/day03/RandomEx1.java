package day03;

public class RandomEx1 {

	public static void main(String[] args) {
		// min ~ max 사이의 랜덤한 정수를 성생하는 예제
		// math.random()은 0이상 1미만의 랜덤한 실수를 만들어줌
		//min <= 		r*(max-min+1) +min < (max-min+1) +min
		//min <= r * (max-min+1) +min < max + 1
		int min = 1, max = 10;
		int r = (int)(Math.random() * (max-min+1)+ min);
		System.out.println("랜덤 : "+r);
		

	}

}
