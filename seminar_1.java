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
*/

/*
HW_1
Вычислить n-ое треугольного число(сумма чисел от 1 до n).

Внутри класса Answer напишите метод countNTriangle, который принимает число n и возвращает его n-ое треугольное число.
Если число n < 1 (ненатуральное) метод должен вернуть -1.

Пример
n = 4 -> 10
n = 5 -> 15

class Answer {
    public int countNTriangle(int n) {
        if (n < 1) {
            return -1;
        }
        return n * (n + 1) / 2;
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer{ 
    public static void main(String[] args) { 
      int n = 0;
      
      if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
        n = 6;
      }
      else{
        n = Integer.parseInt(args[0]);
      }     
      
        // Вывод результата на экран
      Answer ans = new Answer(); 
      int itresume_res = ans.countNTriangle(n);     
      System.out.println(itresume_res);
    }
}
*/

/*
HW_2
Напишите функцию printPrimeNums, которая выведет на экран все простые числа в промежутке от 1 до 1000, 
каждое на новой строке.

Напишите свой код в методе printPrimeNums класса Answer.

Пример
2
3
5
7
11
...


Пояснение к методу
Метод printPrimeNums:

Проходит в цикле по всем числам от 2 до 1000 (1 не является простым числом).
Для каждого числа вызывает метод isPrime, чтобы проверить, является ли число простым.
Если число простое, выводит его на экран.
Метод isPrime:

Проверяет, является ли число простым.
Если число меньше или равно 1, возвращает false.
Проходит в цикле от 2 до квадратного корня из числа, чтобы проверить делимость.
Если находится делитель, возвращает false.
Если делителей не найдено, возвращает true.


import java.util.Scanner;

class Answer {
    public void printPrimeNums(int num) {
        for (int i = 2; i <= num; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    private boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer{ 
    public static void main(String[] args) { 
      
      Answer ans = new Answer();
      Scanner scanner = new Scanner(System.in);
      System.out.println("Введите число: ");
      int num = scanner.nextInt();
      System.out.println("Простые числа от 1 до " + num + ":");30
      ans.printPrimeNums(num);

    }
}
*/

/*
HW_3
Реализуйте простой калькулятор

В методе calculate класса Calculator реализовать калькулятор, который будет выполнять математические операции
 (+, -, *, /) над двумя целыми числами и возвращать результат вещественного типа.

В классе Printer необходимо реализовать проверку переданного оператора, при некорректном операторе программа
 должна вывести сообщение об ошибке "Некорректный оператор: 'оператор'".

    Аргументы, передаваемые в метод/функцию:

'3'
'+'
'7'

На выходе:
10.0 

Пояснение к методу
Метод calculate:

Принимает оператор (op) и два целых числа (a и b).
Использует switch для выполнения соответствующей операции.
Возвращает результат в виде double.
В случае деления проверяет, чтобы b не был равен нулю, иначе выбрасывает ArithmeticException.
Если оператор некорректный, выбрасывает IllegalArgumentException.
Класс Printer:

Считывает аргументы командной строки или использует значения по умолчанию.
Вызывает метод calculate и обрабатывает исключения:
IllegalArgumentException для некорректного оператора.
ArithmeticException для деления на ноль.

Примеры
Для ввода 3 + 7:
3
+
7
=
10.0
3+7=10.0

Для ввода 10 / 0:
Делениенанольневозможно

Для ввода 5 % 2:
Некорректныйоператор

Таким образом, данный код реализует простой калькулятор с обработкой основных арифметических операций
и соответствующей обработкой ошибок.

 

 class Calculator {
    public double calculate(char op, int a, int b) {
        switch (op) {
            case '+':
                return (double) a + b;
            case '-':
                return (double) a - b;
            case '*':
                return (double) a * b;
            case '/':
                if (b == 0) {
                    throw new ArithmeticException("Деление на ноль невозможно");
                }
                return (double) a / b;
            default:
                throw new IllegalArgumentException("Некорректный оператор: '" + op + "'");
        }
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer { 
    public static void main(String[] args) { 
        int a = 0;
        char op = ' ';
        int b = 0;

        if (args.length == 0) {
            // При отправке кода на выполнение, вы можете варьировать эти параметры
            a = 3;
            op = '+';
            b = 7;
        } else {
            a = Integer.parseInt(args[0]);
            op = args[1].charAt(0);
            b = Integer.parseInt(args[2]);
        }

        try {
            Calculator calculator = new Calculator();
            double result = calculator.calculate(op, a, b);
            System.out.println(result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
*/