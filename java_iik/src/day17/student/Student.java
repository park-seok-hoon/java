package day17.student;

import java.io.Serializable;
import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data //@Getter,@Setter,@ToString,@HashcodAndEquals 등을 합쳐 놓은 것
@AllArgsConstructor //모든 멤버들을 매개변수로 갖는 생성자,매개변수 순서대로 한다.
public class Student implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6588474647564459241L;
	
	private int grade, classNum, num; //학년,반,번호
	private String name;	//이름
	@Override
	public boolean equals(Object obj) { //이름을 제외한 학년,반,번호가 같다면 일치한다는 의미
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return classNum == other.classNum && grade == other.grade && num == other.num;
	}
	@Override
	public int hashCode() {
		return Objects.hash(classNum, grade, num);
	}
	@Override	//print 메소드를 만들지 않아도 간단하게 출력이 가능함.
	public String toString() {
		return "[" + grade + "학년 " +classNum + "반 " + num + "번 " +name + "]";
	}
	
	
	
}
