import lombok.Data;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		a.setNum(10);
	}

}

@Data
class A{
	private int num;
} 