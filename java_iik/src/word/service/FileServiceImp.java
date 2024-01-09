package word.service;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

import word.Word;

public class FileServiceImp implements FileService {

	@Override
	public List<Word> load(String fileName) {
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName)))
		{		return (List<Word>) ois.readObject();
		}
		catch (Exception e) {
		}
		return null;
	}

	
}
