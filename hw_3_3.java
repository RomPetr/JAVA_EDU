/*
Реализуйте метод, который принимает на вход целочисленный массив arr:
- Создаёт список ArrayList, заполненный числами из исходого массива arr.
- Сортирует список по возрастанию и выводит на экран.
- Находит минимальное значение в списке и выводит на экран - Minimum is {число} - Находит максимальное значение в списке и выводит на экран - Maximum is {число}
- Находит среднее арифметическое значений списка и выводит на экран - Average is =  {число}
Напишите свой код в методе analyzeNumbers класса Answer. Метод analyzeNumbers принимает на вход один параметр:

Integer[] arr - массив целых чисел.

Пример.
Исходный массив:

4, 2, 7, 5, 1, 3, 8, 6, 9
Результаты:

[1, 2, 3, 4, 5, 6, 7, 8, 9]
Minimum is 1
Maximum is 9

Решение GPT:

import java.util.ArrayList;
import java.util.Collections;

public class Answer {

    public static void analyzeNumbers(Integer[] arr) {
        // Создание списка ArrayList и заполнение его данными из массива
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, arr);

        // Сортировка списка по возрастанию
        Collections.sort(list);
        System.out.println(list);

        // Нахождение минимального значения
        int min = Collections.min(list);
        System.out.println("Minimum is " + min);

        // Нахождение максимального значения
        int max = Collections.max(list);
        System.out.println("Maximum is " + max);

        // Нахождение среднего арифметического значения
        double average = 0;
        for (int num : list) {
            average += num;
        }
        average /= list.size();
        System.out.println("Average is " + average);
    }

    public static void main(String[] args) {
        Integer[] arr = {4, 2, 7, 5, 1, 3, 8, 6, 9};

        analyzeNumbers(arr);
    }
}

Объяснение:
1. Создание и заполнение списка: В методе analyzeNumbers создается список ArrayList и
 заполняется числами из переданного массива arr с помощью метода Collections.addAll.
2. Сортировка: Список сортируется по возрастанию с использованием метода Collections.sort.
3. Нахождение минимального и максимального значения: Минимальное и максимальное значения
 находятся с использованием методов Collections.min и Collections.max, соответственно.
4. Нахождение среднего арифметического: Среднее арифметическое вычисляется путем 
суммирования всех элементов списка и деления суммы на размер списка.
5. Вывод результатов: Результаты сортировки, минимальное, максимальное и среднее 
значения выводятся на экран.

Этот код можно скопировать и запустить в любой Java-проект, чтобы увидеть работу 
метода analyzeNumbers на примере массива целых чисел.



*/

public class hw_3_3 {
    
}
