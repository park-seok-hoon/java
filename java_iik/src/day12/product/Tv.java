package day12.product;

public class Tv extends Product{
	
	int size;//모니터 크기

	public Tv(String brand, String pcode, String pname, int size) {
		super(brand, pcode, pname);
		this.size = size;
	}

	@Override
	public void print() {
		System.out.println("----------------");
		System.out.println("브랜드 : "+brand);
		System.out.println("제품명 : "+name);
		System.out.println("제품코드 : "+ code);
		System.out.println("화면크기" + size + "cm");
		
	}
	
	
	
	

}
