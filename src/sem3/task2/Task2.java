package sem3.task2;
// Создайте класс Count, у которого есть метод add(), увеличивающий значение внутренней int переменнтой на 1.
// Сделайте так, чтобы с объектом такого типа можно было работать в блоке try-with-resources. Нужно бросить
// исключение, если работа с объектом типа счетчик была не в ресурсном try и/или ресурс остался открыт.
// Подумайте какой тип исключения подойдет лучше всего.

import java.io.IOException;

public class Task2 {
    private Integer count;
        public Task2() {
            this.count = 0;
        }

    public static void main(String[] args) throws IOException {
        Task2 task = new Task2();
        task.add();
        task.add();
        task.add();
        System.out.println(task.getCount());
        task.terminateCount();
        task.add();
    }


    public void add() throws IOException {
        check();
        this.count++;
    }

    public  void check() throws IOException{
        if (count == null) {
        throw new IOException("null!");
        }
    }
    public Integer getCount() throws IOException {
        check();
        return count;
    }

    public void terminateCount() {
        this.count = null;
    }
}
