package day18.student;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor //기본 생성자 추가
public class StudentManager {
	
	private List<Student> list = new ArrayList<Student>();
	
	
	public StudentManager(List<Student> list) {
		//null일때 처리하기 위해 @AllArgsConstructor를 쓰지 않음
		if(list == null)
		{
			return;			
		}
		this.list=list;
		
		
	}

	public boolean insertStudent(Student std) 
	//중복된 학생 객체를 넣지 않기 위해 하는 작업
												
	{	
		//중복 체크
		if(list.contains(std)) //equals가 있어야 가능한 부분
			return false;
		
		
		//아니면 추가
		list.add(std);
		sort();
		return true;
	}
	
	public void sort() { // 학생 s1과 학생 s2를 가지고 학년,반 별로 정렬
		list.sort((s1, s2)->{
			
			if(s1.getGrade() != s2.getGrade())
				return s1.getGrade() - s2.getGrade();
			if(s1.getClassNum() != s2.getClassNum())
				return s1.getClassNum()- s2.getClassNum();
			return s1.getNum() - s2.getNum();
		});
	}
	
	public void setlist(ArrayList<Student> list)
		//
	{
			if(list==null)
			{
				return;
			}
			this.list=list;
			
	}
	
	public void printStudent() {
		
		list.stream().forEach(s->System.out.println(s)); 
		//학생 객체를 호출하면 toString이 자동으로 호출됨
	}

	public boolean updateStudent(Student std) {
		//등록된 학생인지 확인
		int index = list.indexOf(std);
		//등록된 학생이 아니면 false를 리턴
		if(index< 0) {
			return false;
		}
		
		
		//등록된 학생이면 이름을 수정
		list.get(index).setName(std.getName()); //
		return true;
	
	}
	
}
