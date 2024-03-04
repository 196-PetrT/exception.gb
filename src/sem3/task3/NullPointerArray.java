package sem3.task3;

public class NullPointerArray extends NullPointerException{
    public NullPointerArray () {
        super("Элемент пустой");
    }

    public NullPointerArray(int count) {
        super("Элемент пустой в индексе: " + count);
    }
}
