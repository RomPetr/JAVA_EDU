/*
Задание №0
Вывести в консоль “Hello world!”.
Вывести в консоль системные дату и время.


import java.sql.Date; // для класса Date (устаревший)
import java.time.LocalDateTime; // для класса Calendar (устаревший)
import java.util.Calendar;

public class seminar_1 {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //Date
        //Calendar
        System.out.println(LocalDateTime.now());
        int[] arr = {23, 34, 45};

        for (int elem : arr) {
           System.out.print (elem + " ");
        }
        System.out.println();
    }
}
*/

/*
 * Задание №1
📌 Написать программу, которая запросит пользователя ввести
<Имя> в консоли.
📌 Получит введенную строку и выведет в консоль сообщение
“Привет, <Имя>!”
 * 
 
import java.util.Scanner;

public class seminar_1 {

    public static void main(String[] args){
        // первый вариант
        // System.out.println("Введите имя");
        // String name = System.console().readLine();
        // System.out.println("Привет, " + name + "!");

        // второй вариант
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Введите имя");
        String name1 = inputScanner.nextLine();
        System.out.printf("Привет, %s !", name1);
        System.out.println(" ");   
        inputScanner.close();

    }
}
*/

/*
 * Задание №2
Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести
максимальное количество подряд идущих 1.
 */

 public class seminar_1 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 1, 1, 1};
        int count = 0;
        int maxCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
                if (count > maxCount) {
                    maxCount = count;
                }
            } else {
                 count = 0;
                }
            
        }
        System.out.println("Максимальное количество подряд идущих 1: " + maxCount);
    }
 }