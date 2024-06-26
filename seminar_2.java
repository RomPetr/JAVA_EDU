/*
Задание №1
Дано четное число N (>0) и символы c1 и c2.
Написать метод, который вернет строку длины N, которая
состоит из чередующихся символов c1 и c2, начиная с c1. 
*/

//import java.security.PublicKey;

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
*/

/*
HW 1
Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса,
используя StringBuilder. Данные для фильтрации приведены ниже в виде json строки.
Если значение null, то параметр не должен попадать в запрос.
Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}

Пример: Строка sql-запроса:

select * from students where 

Параметры для фильтрации:

 {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}

Результат:

select * from students where name='Ivanov' and country='Russia' and city='Moscow'


Для решения данной задачи на языке программирования Java, необходимо выполнить следующие шаги:

1. Прочитать JSON строку с параметрами.
2. Распарсить JSON строку и получить значения параметров.
3. Использовать StringBuilder для формирования части WHERE SQL-запроса, исключая параметры со значением "null".
Ниже приведён пример кода, который выполняет указанные шаги.


import org.json.JSONObject;

public class seminar_2 {

    public static String answer(String QUERY, String PARAMS) {
        // Инициализация StringBuilder для формирования части WHERE
        StringBuilder whereClause = new StringBuilder();

        // Преобразование строки JSON в объект JSONObject
        JSONObject params = new JSONObject(PARAMS);

        // Перебор всех ключей в JSONObject
        for (String key : params.keySet()) {
            String value = params.getString(key);

            // Если значение не "null", то добавляем его в запрос
            if (!"null".equals(value)) {
                if (whereClause.length() > 0) {
                    whereClause.append(" and ");
                }
                whereClause.append(key).append("='").append(value).append("'");
            }
        }

        // Формирование итогового запроса
        String finalQuery = QUERY + whereClause.toString();
        return finalQuery;
    }

    public static void main(String[] args) {
        String query = "select * from students where ";
        String params = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";

        String result = answer(query, params);
        System.out.println(result);
    }
}
*/
//-------------------------------------
/*
Решение без использования внешних библиотек

Для решения задачи без использования внешней библиотеки org.json.JSONObject мы можем воспользоваться встроенными средствами Java 
для работы с строками. Мы будем обрабатывать JSON строку вручную, используя метод split и другие методы работы со строками.

Этот код выполняет следующие действия:

1. Метод answer принимает на вход два параметра: начало SQL-запроса QUERY и строку JSON с параметрами PARAMS.
2. Удаляем фигурные скобки и пробелы в начале и в конце строки JSON.
3. Разделяем строку на пары ключ-значение, используя метод split с запятой в качестве разделителя.
4. Для каждой пары ключ-значение:
    Разделяем пару на ключ и значение, используя метод split с двоеточием в качестве разделителя.


public class seminar_2 {

    public static String answer(String QUERY, String PARAMS) {
        // Инициализация StringBuilder для формирования части WHERE
        StringBuilder whereClause = new StringBuilder();

        //System.out.println(PARAMS);

        // Удаление фигурных скобок и пробелов в начале и в конце строки
 
        PARAMS = PARAMS.substring(1, PARAMS.length() - 1);
        //System.out.println(PARAMS);

        // Разделение строки на пары ключ-значение
        String[] pairs = PARAMS.split(",");

        //Выводим элементы массива строк разбитые по парам ключ : значение (для проверки)
        for (String pair : pairs) {
            System.out.println(pair);
        }

        

        for (String pair : pairs) {
            // Разделение каждой пары на ключ и значение
            String[] keyValue = pair.split(":");
     
            // Удаление лишних кавычек и пробелов
            String key = keyValue[0].trim().replaceAll("\"", "");
            String value = keyValue[1].trim().replaceAll("\"", "");
            //Выводим элементы массива строк без кавычек и двоеточий (для проверки)
            System.out.printf("%s  %s\n", key, value);

            // Если значение не "null", то добавляем его в запрос
            if (!"null".equals(value)) {
                if (whereClause.length() > 0) {
                    whereClause.append(" and ");
                }
                whereClause.append(key).append("='").append(value).append("'");
            }
        }

        // Формирование итогового запроса
        String finalQuery = QUERY + whereClause.toString();
        return finalQuery;
    }

    public static void main(String[] args) {
        String query = "select * from students where ";
        String params = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";

        String result = answer(query, params);
        System.out.println(result);
    }
}
*/


/*
HW 2
Сортировка пузырьком с логированием

Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

Напишите свой код в методе sort класса BubbleSort. Метод sort принимает на вход один параметр:

int[] arr - числовой массив

После каждого прохода по массиву ваш код должен делать запись в лог-файл 'log.txt' 
в формате год-месяц-день час:минуты {массив на данной итерации}. Для логирования использовать логгер logger класса BubbleSort.

Пример

arr = new int[]{9, 4, 8, 3, 1};
sort(arr)

// При чтении лог-файла получим:
2023-05-19 07:53 [4, 8, 3, 1, 9]
2023-05-19 07:53 [4, 3, 1, 8, 9]
2023-05-19 07:53 [3, 1, 4, 8, 9]
2023-05-19 07:53 [1, 3, 4, 8, 9]
2023-05-19 07:53 [1, 3, 4, 8, 9]

Объяснение кода:
Инициализация лог-файла:

1. Создаем файл log.txt и FileWriter в статическом блоке и устанавливаем режим добавления (true), чтобы сохранять все записи в файл.

2. Метод sort:
    Реализуем сортировку пузырьком с дополнительной проверкой на необходимость дальнейших итераций (swapped).
    После каждой итерации внешнего цикла вызываем метод logArrayState для записи состояния массива в лог-файл.

3. Метод logArrayState:
    Получаем текущую дату и время в нужном формате.
    Записываем текущее состояние массива в лог-файл.

4. Метод finalize:
    Закрываем FileWriter при сборке мусора, чтобы убедиться, что все ресурсы освобождены.

Класс Printer:
    Считывает и выводит содержимое лог-файла после выполнения сортировки.

Запуск и тестирование:
    Код можно запустить как обычный Java файл.
    При запуске будет создан лог-файл log.txt, содержащий состояния массива после каждой итерации сортировки.

Этот подход обеспечивает логирование каждой итерации алгоритма сортировки и корректную запись в файл с соответствующими временными метками.


import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
import java.text.SimpleDateFormat;
import java.util.Date;

class BubbleSort {
    private static File log;
    private static FileWriter fileWriter;
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");

    static {
        try {
            log = new File("bubleSortLog.txt");
            fileWriter = new FileWriter(log, true); // Append mode
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void sort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // Log the array state after each pass
            logArrayState(arr);
            if (!swapped) break; // If no two elements were swapped by inner loop, then break
        }
    }

    private static void logArrayState(int[] arr) {
        try {
            String currentTime = dateFormat.format(new Date());
            fileWriter.write(currentTime + " " + Arrays.toString(arr) + "\n");
            fileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        if (fileWriter != null) {
            fileWriter.close();
        }
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class seminar_2 {
    public static void main(String[] args) {
        int[] arr = {};
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
        if (args.length == 0) {
            arr = new int[]{9, 4, 8, 3, 1};
        } else {
            arr = Arrays.stream(args[0].split(", "))
                        .mapToInt(Integer::parseInt)
                        .toArray();
        }

        BubbleSort ans = new BubbleSort();
        ans.sort(arr);

        try (BufferedReader br = new BufferedReader(new FileReader("log.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
*/