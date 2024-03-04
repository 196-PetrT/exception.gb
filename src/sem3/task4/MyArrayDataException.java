package sem3.task4;

public class MyArrayDataException extends NumberFormatException{
    public MyArrayDataException(int i, int j){
        super("не удалось преобразовать элемент (" + i + ", " + j + ")");

    }
    public MyArrayDataException() {
        super("не удалось преобразовать элемент");
    }
}
