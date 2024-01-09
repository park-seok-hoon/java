package word.service;

import java.util.List;

import word.Word;

public interface FileService {

	List<Word> load(String fileName);

}
