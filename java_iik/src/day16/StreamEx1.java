package day16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

public class StreamEx1 {

	public static void main(String[] args) {
		List<Student> list =Arrays.asList(new Student(1,1,1,"홍길동", 100, 100, 100),
				new Student(1,1,1,"임꺽정",95,85,55),
				new Student(1,1,1,"고길동",50,10,20));
		
	Stream<Student> stream = list.stream();
	stream.filter(s->s.getGrade() == 1).forEach(s->System.out.println(s));
	
	//학생 정보에서 국어 성적을 추출해서 점수를 출력
	stream.map(s->s.getKor()).forEach(k->System.out.println("국어 : "+ k));
	stream = list.stream();
	//학생들의 국어 성적 평균을 계산
	//map : A에서 B로 변환 시킴.
	//mapToInt : A에서 Integer로 변환 시킴.
	//orElse : 값이 null이면 0으로 대체해서 계산
	double avg = stream.mapToInt(Student::getKor).average().orElse(0.0);
	System.out.println("국어 성적 평균 : " + avg);
	
	stream = list.stream();
	//국어 성적에 2를 곱한 뒤 합을 구함
	Integer res =stream.mapToInt(Student::getKor).reduce((a,b)->{
		return 2*a+b;
	}).orElse(0);
	System.out.println("2배 총합 : "+ res);
}
	
	
}
@Data
@RequiredArgsConstructor
class Student{
	@NonNull
	Integer grade,classNum,num;
	@NonNull
	String name;
	@NonNull
	Integer kor,eng,math;
	
	
}
