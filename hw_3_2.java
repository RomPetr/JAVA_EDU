/*
Дан произвольный массив целых чисел. Создайте список ArrayList, заполненный данными 
из этого массива. Необходимо удалить из списка четные числа и вернуть результирующий.

Напишите свой код в методе removeEvenNumbers класса Answer. Метод removeEvenNumbers 
принимает на вход один параметр: Integer[] arr - список целых чисел, возвращает 
список ArrayList<Integer>

Примеры.
Исходный массив:
1, 2, 3, 4, 5, 6, 7, 8, 9
Результат:
[1, 3, 5, 7, 9]
Исходный массив:
2, 4, 6, 8
Результат:
[]

Решение GPT:

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class RemoveEvenNumbers {
    
    public static ArrayList<Integer> removeEvens(int[] arr) {
        // Создаем список ArrayList и заполняем его данными из массива
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : arr) {
            list.add(num);
        }

        // Используем итератор для удаления четных чисел
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            int num = iterator.next();
            if (num % 2 == 0) {
                iterator.remove();
            }
        }
        
        return list;
    }

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7, 8, 9, 10};
        
        System.out.println("Исходный массив: " + Arrays.toString(arr));

        ArrayList<Integer> resultList = removeEvens(arr);
        
        System.out.println("Результирующий список (без четных чисел): " + resultList);
    }
}

Объяснение:
1. removeEvens: Этот метод принимает массив целых чисел в качестве параметра, 
создает список ArrayList, заполняет его данными из массива и затем удаляет четные 
числа из списка с помощью итератора. Итератор позволяет безопасно удалять элементы 
из списка во время итерации.

2. main: Основной метод, который:

    Создает произвольный массив целых чисел arr.
    Выводит исходный массив на экран.
    Вызывает метод removeEvens, передавая ему массив arr, и получает результирующий список 
    без четных чисел.
    Выводит результирующий список на экран.
Как это работает:
1. В методе removeEvens создается ArrayList и заполняется данными из переданного массива.
2. Затем с помощью итератора происходит обход всех элементов списка и удаление тех, 
которые являются четными (проверяется условием num % 2 == 0).
3. В основном методе main выводятся как исходный массив, так и результирующий список 
для проверки результата.
Этот код можно скопировать в любой Java-проект и запустить, чтобы увидеть, как работает 
удаление четных чисел из списка.
*/

public class hw_3_2 {
    
}