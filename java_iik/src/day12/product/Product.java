package day12.product;

public abstract class Product {
	
	String brand,code, name;
	
	public Product(String brand,String pcode,String pname) {	
		this.brand=brand;
		this.code=pcode;
		this.name=pname;
	}
	
	public abstract void print();

	
	
}
