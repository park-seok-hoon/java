package day16;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharStream {

	public static void main(String[] args) {
		
		String fileName = "src/day16/CharStreamEx1.txt";
		//문자들을 읽어옴
		try(FileWriter fw = new FileWriter(fileName);
				FileReader fr = new FileReader(fileName)){
			String str = "안녕하세요\n제 이름은 홍길동입니다.\n끝";
			for(int i = 0; i<str.length(); i++) {
				fw.write(str.charAt(i));
			}
			for(int i = 0; i<str.length(); i++) {
				char ch = (char)fr.read();
				System.out.print(ch+",");
			}
			char [] arr =new char[20];
			fr.read(arr);
			System.out.println(arr);
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다.");
		} catch (IOException e) {
			System.out.println("파일 작업 중 예외가 발생했습니다.");
		
		}
		//문자들을 읽어옴
		try(FileReader fr = new FileReader(fileName)) {
			while(fr.ready()) {
					char ch =(char)fr.read();
					System.out.println(ch);
				}
			} catch (FileNotFoundException e) {
				System.out.println("파일을 찾을 수 없습니다.");
			} catch (IOException e) {
				System.out.println("파일 작업 중 예외가 발생했습니다.");
			
			}
		
	}

}
