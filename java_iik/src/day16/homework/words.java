package day16.homework;

import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Data;



@Data
public class words {

	String englishwords; //영단어
	String means; //영단어 의미
	
	public void wordsprint()
	{
		System.out.println("영단어 : "+englishwords);
		System.out.println("의미 : "+means);
		
	}

	public words(String englishwords, String means) {
		
		this.englishwords = englishwords;
		this.means = means;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		words other = (words) obj;
		return Objects.equals(englishwords, other.englishwords) && Objects.equals(means, other.means);
	}

	@Override
	public int hashCode() {
		return Objects.hash(englishwords, means);
	}
	
	
	
	
}
