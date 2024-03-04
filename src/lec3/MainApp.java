package lec3;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MainApp {
    public static void main(String args[]) {
        try (FileReader reader = new FileReader(new File("1.txt"));
            FileWriter writer = new FileWriter("test")) {
            while (reader.ready()) {
                writer.write(reader.read());
            }

        } catch (RuntimeException | IOException e) {
            System.out.println("catch exception: " + e.getClass().getSimpleName());
        }
        System.out.println("Copy successfully");
//        FileReader reader = null;
//        try {
//            reader = new FileReader("file.txt");
// Полезная работа, связанная с чтением файла..

//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                if (reader != null) {
//                    reader.close();
//                }
//            } catch(IOException e) {
//
//                e.printStackTrace();
//            }
    }
}
