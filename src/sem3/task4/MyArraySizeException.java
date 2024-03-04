package sem3.task4;

public class MyArraySizeException extends RuntimeException{
    public MyArraySizeException(int row, int column){
        super("массив должен иметь размеры 4х4, у вас (" + row + ", "
                                                            + column + ")");
    }
    public MyArraySizeException() {
        super("массив должен иметь размеры 4х4");
    }
}
