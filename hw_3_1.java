/*
 Внутри класса MergeSort напишите метод mergeSort, который принимает массив целых чисел, реализует алгоритм сортировки слиянием. 
 Метод должен возвращать отсортированный массив.

Пример

a = {5, 1, 6, 2, 3, 4} -> [1, 2, 3, 4, 5, 6]

import java.util.Arrays;

class MergeSort {
    public static int[] mergeSort(int[] a) {
        // Напишите свое решение ниже
    

    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer{ 
    public static void main(String[] args) { 
        int[] a;

        if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = new int[]{5, 1, 6, 2, 3, 4};
        } else {
            a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
        }

        MergeSort answer = new MergeSort();
        String itresume_res = Arrays.toString(answer.mergeSort(a));
        System.out.println(itresume_res);
    }
}

Решение:

public class MergeSort {
    
    // Метод для слияния двух подмассивов
    private static void merge(int[] arr, int left, int mid, int right) {
        // Определение размеров двух подмассивов
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Создание временных массивов
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // Копирование данных во временные массивы
        for (int i = 0; i < n1; ++i) {
            leftArray[i] = arr[left + i];
        }
        for (int j = 0; j < n2; ++j) {
            rightArray[j] = arr[mid + 1 + j];
        }

        // Индексы для первого и второго подмассивов
        int i = 0, j = 0;

        // Начальный индекс для объединенного подмассива
        int k = left;
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Копирование оставшихся элементов leftArray[], если есть
        while (i < n1) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        // Копирование оставшихся элементов rightArray[], если есть
        while (j < n2) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }

    // Основной метод сортировки, использующий сортировку слиянием
    private static void sort(int[] arr, int left, int right) {
        if (left < right) {
            // Найти среднюю точку
            int mid = (left + right) / 2;

            // Сортировать первую и вторую половины
            sort(arr, left, mid);
            sort(arr, mid + 1, right);

            // Слить отсортированные половины
            merge(arr, left, mid, right);
        }
    }

    // Вспомогательный метод для печати массива
    private static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Основной метод для тестирования сортировки слиянием
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7};
        System.out.println("Исходный массив:");
        printArray(arr);

        sort(arr, 0, arr.length - 1);

        System.out.println("Отсортированный массив:");
        printArray(arr);
    }
}

Объяснение:
1. merge: Этот метод объединяет два подмассива в один отсортированный массив.
2. sort: Этот метод рекурсивно делит массив на подмассивы и использует метод merge для их объединения.
3. printArray: Этот метод выводит массив на экран.
4. main: Основной метод, который создает массив, вызывает метод sort и выводит результаты до и после сортировки.
Этот код можно запустить в любой среде разработки Java, и он продемонстрирует работу сортировки слиянием.

*/

public class hw_3_1 {
    
}
