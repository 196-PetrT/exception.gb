package sem3.task4;

// Напишите метод, на вход которого подается двумерный
//строковый массив 4х4. При подаче массива другого размера
//необходимо сбрасывать исключение MyArraySizeException.
//1. Далее метод должен пройтись по всем элементам массива, 
//преобразовать в int и просуммировать. Если в каком-то элементе 
//массива преобразование не удалось (например в ячейке лежит символ
//или текст вместо числа), должно быть брошено исключение MyArrayDataException
// с детализацией, в какой именно ячейке лежат неверные данные.
//3. В методе main() вызвать полученный метод, обработать возможные исключения 
//MyArraySizeException и MyArrayDataException и вывести результат счета 
//(сумму элементов, при условии, что подали на вход корректный массив).

public class Main {
    public static void main(String[] args) throws Exception {
        String[][] i = {{"1", "1", "1", "1"}, {"1", "1", "1", "1"},
                {"1", "1", "1", "1"}, {"1", "1", "1", "1"}};
        System.out.println(sumElementArray(i));
    }

    public static int sumElementArray(String[][] array) {
        if (array.length != 4 && array[0].length != 4)
            throw new MyArraySizeException(array.length, array[0].length);
        int resultSum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++){
                try{
                    resultSum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return resultSum;
    }
}
