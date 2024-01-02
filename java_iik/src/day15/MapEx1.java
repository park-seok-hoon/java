package day15;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapEx1 {

	public static void main(String[] args) {
		Map<String, String> map= new HashMap<String,String>(); 	
		//key 값의 타입 value값의 타입
		map.put("abc123", "abc123!");
		map.put("def456", "abc123!"); //비번이 중복 -> value가 중복 -> 가능
		map.put("abc123", "qwe123"); //아이디 중복->아이디 추가가 안됨 value가 변경
		map.put("admin","admin");
		map.put("def", "def");
		System.out.println(map.remove("abc123")); //key 값을 삭제 value 값을 반환
		System.out.println(map);
		
		Set<String> keySet = map.keySet();
		for(String tmp : keySet) {
			String value = map.get(tmp);
			System.out.print(value+" ");
		}	
		//EntrySet을 이용한 반복문 예제
		Set<Map.Entry<String, String>> entrySet = map.entrySet();
		System.out.println();
		for(Map.Entry<String,String> tmp : entrySet) {
			System.out.println("["+ tmp.getKey() + " , "+ tmp.getValue()+ "]");
			
		}
		A a = new A();
		A.B b = a.new B();
	}	

}
class A{
	public class B{
		int num;
	}
}
