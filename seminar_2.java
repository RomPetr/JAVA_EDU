/*
Задание №1
Дано четное число N (>0) и символы c1 и c2.
Написать метод, который вернет строку длины N, которая
состоит из чередующихся символов c1 и c2, начиная с c1. 


import java.security.PublicKey;

public class seminar_2 {
    public static void main(String[] args) {
        int n = 100_000;
        char c1 = 'A';
        char c2 = 'B';
        //ABABABAB
        long start = System.currentTimeMillis();
        alternatingCharsStr(n, c1, c2);
        System.out.println(System.currentTimeMillis() - start);

        start = System.currentTimeMillis();
        alternatingCharsSb(n, c1, c2); // через StringBuilder
        System.out.println(System.currentTimeMillis() - start);
    }

    public static String alternatingCharsStr(int n, char c1, char c2) {
        String str = "";
        for(int i = 0; i < n / 2; i++) {
            str = str + c1 + c2;
        
        }
        return str;
    }
// через StringBuilder
    public static String alternatingCharsSb(int n, char c1, char c2) {
        StringBuilder sb = new StringBuilder(n);
        for(int i = 0; i < n /2; i++) {
            sb.append(c1).append(c2);
        }

        return sb.toString();
    }
}
*/

/*
Задание №2
Напишите метод, который сжимает строку.
Пример: вход aaaabbbcdd. 
Результат a4b3c1d2


// Решение ИИ
public class seminar_2 {
    public static void main(String[] args) {
        String str = "aaaabbbcdd";
        System.out.println(compress(str));
    }

    public static String compress(String str) {
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for(int i = 0; i < str.length() - 1; i++) {
            if(str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                sb.append(str.charAt(i)).append(count);
                count = 1;
            }
        }
        sb.append(str.charAt(str.length() - 1)).append(count);
        return sb.toString();
    }
}


// решение в группе
public class seminar_2 {
    public static void main(String[] args) {
        String str = "aaaabbbcdd";
        System.out.println(compressString(str));
    }

    public static String compressString(String str) {
        StringBuilder res = new StringBuilder();
        int count = 1;
        char currentChar = str.charAt(0);

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == currentChar) {
                count++;
            } else {
                res.append(currentChar).append(count);
                currentChar = str.charAt(i);
                count = 1;
            }
        }
        res.append(currentChar).append(count);
        return res.toString();
    }
}
*/

/*
Задание №3
Напишите метод, который принимает на вход строку (String) и
определяет является ли строка палиндромом (возвращает boolean значение). 


// решение ИИ
public class seminar_2 {
    public static void main(String[] args) {
        String str = "довод";
        System.out.println(isPalindrome(str));
    }

    public static boolean isPalindrome(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return str.equals(sb.toString());
    }
}
*/

/* 
// решение в группе

public class seminar_2 {

    public static void main(String[] args) {
        
        String word = "довод";
        System.out.println(isPalindrom(word));
    }

    public static boolean isPalindrom(String inputStr) {
        for (int i = 0; i < inputStr.length() / 2; i++) {
            if (inputStr.charAt(i) != inputStr.charAt(inputStr.length() -1 - i)) {
                return false;
            }

        }
        return true;
    }

}
*/

/*
Задание №4
Напишите метод, который составит строку, состоящую из 100
повторений слова TEST и метод, который запишет эту строку в
простой текстовый файл, обработайте исключения.



import java.io.FileWriter;
import java.io.IOException;

public class seminar_2 {

    public static void main(String[] args) {
        String str = "TEST";
        int n = 100;
        String newStr = stringMaker(str, n);
        String fileName = "text.txt";
        writeToFile(newStr, fileName);
    }

    public static String stringMaker(String str, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(str).append(" ");
        } 
        
        return sb.toString();
    }

    public static void writeToFile(String str, String fileName) {
        try (FileWriter fw = new FileWriter(fileName, true)) {
            fw.write(str);
            fw.write(System.lineSeparator());
            System.out.println("Written is success");
        } catch (IOException e) {
            System.err.println("Ошибка записи в файл");
        }  
    }

}
*/

/*
Задание №5
1. Напишите метод, который вернет содержимое текущей папки в виде
массива строк.
2. Напишите метод, который запишет массив, возвращенный предыдущим
методом в файл.
3. Обработайте ошибки с помощью try-catch конструкции. В случае
возникновения исключения, оно должно записаться в лог-файл


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class seminar_2 {
    private static Logger logger = Logger.getLogger(seminar_2.class.getName());
    public static void main(String[] args) {
        congfigLogger();  
        String fileName = "FileList.txt";
        String[] contentFolder = getFileList(System.getProperty("user.dir"));
        writeArrayToFile(contentFolder, fileName);
    }
 
    static String[] getFileList(String folderName) {
        File currentFolder = new File(folderName);
        return currentFolder.list();
    }

    static void writeArrayToFile(String[] arr, String fileName) {
        try (FileWriter fw = new FileWriter(fileName)) {
            for(String elem : arr) {
                fw.write(elem);
                //fw.write("\n");
                fw.write(System.lineSeparator());
            }
            System.out.println("Written is success");
            logger.info("Данные успешно записаны");
            } catch (IOException ex) {
            System.err.println(ex.getLocalizedMessage());
            logger.warning("Ошибка записи в файл");
        }
    }

    static void congfigLogger() {
       try {
        //logger.setUseParentHandlers(false);
        FileHandler fh = new FileHandler("log.txt", true);
        logger.addHandler(fh);
        SimpleFormatter sf = new SimpleFormatter();
        fh.setFormatter(sf);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
*/

/*
Задание №6
Напишите метод, который определит тип (расширение) файлов из
текущей папки и выведет в консоль результат вида
1 Расширение файла: txt
2 Расширение файла: pdf
3 Расширение файла:
4 Расширение файла: jpg   

Этот код выполняет следующие шаги:

Получает текущую папку с помощью new File(".").
Получает список файлов в этой папке с помощью метода listFiles().
Проходит по каждому файлу в списке и для каждого файла определяет его расширение с помощью метода getFileExtension().
Выводит в консоль номер файла и его расширение.
Метод getFileExtension(String fileName) возвращает расширение файла, если оно есть, или пустую строку, 
если файл не имеет расширения или если точка стоит в конце имени файла.
*/

import java.io.File;

public class seminar_2 {
    public static void main(String[] args) {

        // Получаем текущую папку
        File currentDirectory = new File(".");

        // Получаем список файлов в текущей папке
        File[] filesList = currentDirectory.listFiles();
        
        if (filesList != null) {
            int fileNumber = 1;
            for (File file : filesList) {
                if (file.isFile()) {
                    // Получаем имя файла
                    String fileName = file.getName();
                    // Получаем расширение файла
                    String fileExtension = getFileExtension(fileName);
                    // Выводим результат в консоль
                    System.out.println(fileNumber + " Имя файла: " + fileName + " Расширение файла: " + fileExtension);
                    fileNumber++;
                }
            }
        } else {
            System.out.println("Текущая папка не содержит файлов.");
        }
    }

        // Метод для получения расширения файла
        private static String getFileExtension(String fileName) {
            int lastIndexOfDot = fileName.lastIndexOf('.');
            if (lastIndexOfDot == -1 || lastIndexOfDot == fileName.length() - 1) {
                // Файл не имеет расширения или точка стоит в конце имени
                return "";
            }
            return fileName.substring(lastIndexOfDot + 1);
        }
}