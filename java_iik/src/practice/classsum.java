package practice;

public class classsum {

	public static void main(String[] args) {
		/*	학생이 버스를 타거나 지하철을 탔을 때 상황
		 * 학생 클래스
		 * 학생 이름
		 * 학년
		 * 가지고 있는 돈
		 * 
		 * 버스 클래스
		 * 버스 번호
		 * 승객 수
		 * 버스 수입
		 * 
		 * 지하철 클래스
		 * 지하철 노선
		 * 승객 수
		 * 지하철 수입
		 * 
		 * */
		student st1=new student("박",40000);
		student st2=new student("김",30000);
		
		Bus bus1=new Bus(100);
		st1.pay(bus1);
		st1.show();
		bus1.Busprint();
		
		subway sub=new subway("2호선");
		st2.pay(sub);
		st2.show();
		sub.subprint();
		
		
		
	}

}

class student{
	String name;
	int grade;
	int money;
	
	public student(String name,int money)
	{	this.name=name;
		this.money=money;
		
	}
	
	public void pay(Bus bus) //버스에 지불한 금액
	{
		bus.take(1500);
		this.money-=1500;
		
	}
	
	public void pay(subway Subway)
	{
		Subway.take(1500);
		this.money-=1500;
		
	}
	
	public void show()
	{
		System.out.println(name+"님의 남은 돈은"+money+"입니다.");
		
	}
	
	
}

class Bus{
	int busnumber;
	int Buspassenger;
	int busimport;
	
	public Bus(int busnumber)
	{
		this.busnumber=busnumber;
		
	}
	
	public void take(int money)
	{	
		busimport+=money;
		Buspassenger++;
	}
	
	public void Busprint()
	{
		System.out.println("버스 번호는"+busnumber+"승객 수는"
				+Buspassenger+"버스 수입은"+busimport);
	}
	
}
class subway{
	String subwaynumber;
	int subwaypassenger;
	int subwayimport;

	public subway(String subwaynumber)
	{
		this.subwaynumber=subwaynumber;
		
	}
	
	public void take(int money)
	{
		subwayimport+=money;
		subwaypassenger++;
		
	}
	
	public void subprint()
	{
		System.out.println("지하철 번호는"+subwaynumber+"승객 수는"
	+subwaypassenger+"지하철 수입은"+subwayimport);
		
	}
}