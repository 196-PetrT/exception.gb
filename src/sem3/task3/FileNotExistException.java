package sem3.task3;

import java.io.FileNotFoundException;

public class FileNotExistException extends FileNotFoundException {
    public FileNotExistException() {
        super("файл не существует");
    }

    public FileNotExistException(String baf) {
        super("файл по пути " + baf + " не существует");
    }

}
