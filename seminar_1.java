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
Написать программу, которая запросит пользователя ввести
<Имя> в консоли.
Получит введенную строку и выведет в консоль сообщение
“Привет, <Имя>!”

 
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
 

 public class seminar_1 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 1, 1, 1};
        int count = 0;
        int maxCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
                // if (count > maxCount) {
                //     maxCount = count;
                // }
                // maxCount = count > maxCount ? count : maxCount; # тернарный оператор
                maxCount = Math.max(count, maxCount);
            } else {
                count = 0;
            }
            
        }
        System.out.println("Максимальное количество подряд идущих 1: " + maxCount);
    }
 }
 */

/*
 Задание №3
Дан массив nums = [3,2,2,3] и число val = 3.
Если в массиве есть числа, равные заданному, нужно перенести
эти элементы в конец массива.
Таким образом, первые несколько (или все) элементов массива
должны быть отличны от заданного, а остальные - равны ему
  
 

 import java.util.Arrays;
 
 public class seminar_1 {
 
    public static void main(String[] args) {
        int val = 3;
        int[] nums = {3, 2, 2, 3};
        int leftIdx = 0;
        int rightIdx = nums.length - 1;

        // решение ИИ
        // while (leftIdx < rightIdx) {
        //     if (nums[leftIdx] == val) {
        //         int tmp = nums[leftIdx];
        //         nums[leftIdx] = nums[rightIdx];
        //         nums[rightIdx] = tmp;
        //         rightIdx--;
        //     } else {
        //         leftIdx++;
        //     }
        // }
        // for (int i = 0; i < nums.length; i++) {
        //     System.out.printf("%d ",nums[i]);
        // }

        //решение в группе
        while  (leftIdx < rightIdx) {
            while (nums[rightIdx] == val && leftIdx < rightIdx) {
                rightIdx--;
            }

            if (nums[leftIdx] == val) {
                nums[leftIdx] = nums[rightIdx];
                nums[rightIdx] = val;                
            }
            leftIdx++;
        }
        System.out.println(Arrays.toString(nums));
    
    }
 }
 */

 /*
Задание №4
Напишите метод, который находит самую длинную строку общего
префикса среди массива строк.
Если общего префикса нет, вернуть пустую строку "".
 */

 /**
  * seminar_1
  */
 public class seminar_1 {
 
    public static void main(String[] args) {
        //String[] strs = {"flower", "flow", "flight"}; //fl
        String[] strs = {"sun", "sunlight", "sunflower"}; //fl

        String pref = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(pref) != 0) {
                pref = pref.substring(0, pref.length() - 1);
                if (pref.length() == 0) {
                    break;
                }
                
            }
        }
        System.out.println(pref);
    }
}