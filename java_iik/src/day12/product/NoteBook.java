package day12.product;

public class NoteBook extends Product {
	double cpu; //GHZ
	int ram; //G
	
	public NoteBook(String brand, String pcode, String pname, double cpu, int ram) {
		super(brand, pcode, pname);
		this.cpu = cpu;
		this.ram = ram;
	}
	
	public void print() {
		System.out.println("----------------");
		System.out.println("브랜드 : "+brand);
		System.out.println("제품명 : "+name);
		System.out.println("제품코드 : "+ code);
		System.out.println("CPU" + cpu + "GHz");
		System.out.println("램 : "+ram + "G");
	}
	
	
}
