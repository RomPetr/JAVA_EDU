/*
 * Работа со строками 1
 */
// Создать строку из 1 млн плюсиков через конкатенацию и через StringBuilder

//import java.security.PublicKey;

public class lecture_2 {
   
    public static void main(String[] args) {
        String str = "";
        // посчитаем время, затраченное на такую операцию
        long start = System.currentTimeMillis();
        simpleConcatenate(str);
        System.out.printf("Время выполнения через конкатенацию = %d ms\n", System.currentTimeMillis() - start);
        //System.out.println(str);

        start = System.currentTimeMillis();
        concatenateUsingStringBuilder(str);
        System.out.printf("Время выполнения через StringBuilder = %d ms\n", System.currentTimeMillis() - start);
    }
    static String simpleConcatenate(String str) {
            for (int i = 0; i < 100_000; i++) {
            str += "+";
        }
        return str;
    }

    static String concatenateUsingStringBuilder(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100_000; i++) {
            sb.append("+");
        }
        return sb.toString();

    }
}

//--------------------------------------
/*
 * Работа с файловой системой 1
// Создать папку и новый файл в этой папке

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
*/