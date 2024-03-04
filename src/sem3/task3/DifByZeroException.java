package sem3.task3;

public class DifByZeroException extends ArithmeticException {
    public DifByZeroException() {
        super("Нельзя делить на ноль!");
    }
}
