package day17.student;

import java.util.ArrayList;
import java.util.Comparator;

import lombok.Data;


@Data
public class StudentManager {

	private ArrayList<Student> list = new ArrayList<Student>();
	
	/** 학생 정보가 주어지면 학생 정보를 추가하는 메서드, 
	 * 학년, 반, 번호가 같은 학생이 있는 경우 학생 정보를 추가하지 않음
	 * @param student 학생정보
	 * @return 학생 정보를 추가했는지에 대한 여부
	 */
	public boolean insertStudent(Student std) {
		if(list.contains(std))  //학년,반,번호를 비교했을 때 같으면 list에 추가하지 않는다.
			return false;
		
		list.add(std);
		//학년, 반, 번호 순으로 정렬
		sort();
			return true;
		
	}
	/**
	 * 가지고 있는 학생 정보들을 정렬하는 메서드
	 */
	public void sort() {  //학생 s1과 학생 s2가 주어지면
		list.sort(new A());
		list.sort((s1, s2)->  
		{ 
			if(s1.getGrade() != s2.getGrade())
				return s1.getGrade() -s2.getGrade();   //학년 별로 오름차순으로 정렬
			
			if(s1.getClassNum() != s2.getClassNum()) { 
				return s1.getClassNum() - s2.getClassNum();  //반 별로 오름차순으로 정렬
				
			}
		return s1.getNum() - s2.getNum();
		});
	}
	//학생 정보 추가
	
	//학생 정보 출력
	public void printAll() { //리스트를 스트림으로 만들어주고 s(아무 이름 상관 x)
							//forEach는 반복문이라고 생각,s를 출력하면 s에 있는 tostring형식을 자동 출력해줌->
						   //tostring을 재정의 해주지 않으면 hashcode형식으로 나온다.
		list.stream().forEach(s->System.out.println(s));
		
	}
	public void setlist(ArrayList<Student> list) {
		if(list == null) {
			return;
		}
		this.list = list;
		
	}
	/*public void sort2(Comparator<Student> t) {
		for(int i = 0; i<list.size()-1; i++) {
			for(int j =0; j<list.size()-2; j++) {
				if(t.compare(list.get(j), list.get(j+1))>0) {
					//두 위치 변경
				}
			}
		}
	} */
}
class A implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		if(s1.getGrade() != s2.getGrade())
			return s1.getGrade() -s2.getGrade();   //학년 별로 오름차순으로 정렬
		
		if(s1.getClassNum() != s2.getClassNum()) { 
			return s1.getClassNum() - s2.getClassNum();  //반 별로 오름차순으로 정렬
			
		}
		return s1.getNum() - s2.getNum();
	}
	
}

