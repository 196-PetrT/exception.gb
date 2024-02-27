package sem2.task3;

// Реализуйте метод, который считывает данные из файла и сохраняет в двумерный массив (либо HashMap, если
// студенты с ним знакомы). В отдельном методе нужно будет пройти по структуре данных, если сохранено
// значение ?, заменить его на соответствующее число.Если на каком-то месте встречается символ, отличный от
// числа или ?, бросить подходящее исключение.Записать в тот же файл данные с замененными символами ?.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("1.txt"));
        List<String> ls = new ArrayList<>();
        String content = br.readLine();
        while (content != null) {
            ls.add(content);
            content = br.readLine();
        }
        br.close();

        HashMap<String, Integer> map = new HashMap<>();
        for (String i: ls) {
            String[] parts = i.split("=");
            if (parts.length != 2)
                throw  new IllegalArgumentException("Неверное кол-во аргументов!");

            map.put(parts[0], parts[0].length());
        }

        // перезапишем наш файл
        StringBuilder sb = new StringBuilder();
        for (String name: map.keySet()) {
            sb.append(name).append("=").append(map.get(name)).append("\n");

        }

        FileWriter fw = new FileWriter("1.txt");
        fw.write(String.valueOf(sb));
        fw.flush();
        fw.close();

    }
}
