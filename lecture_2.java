/*
 * Работа с файловой системой
 */

import java.io.File;
import java.io.IOException;

public class lecture_2 {
    public static void main(String[] args) {
        // Создаем новую папку
        File dir = new File("new_folder");
        if (!dir.exists()) {
            dir.mkdir();
        } else {
            System.out.println("Папка уже существует");
        }

        // Создаем новый файл
        File file = new File("new_folder/new_file.txt");
        try {
            if (!file.createNewFile()) {
                System.out.println("Файл уже существует");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Проверяем существование папки и файла
        System.out.println("Папка существует: " + dir);
    }
}