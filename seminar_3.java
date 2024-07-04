
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
/*
Задание №1
Заполнить список десятью случайными числами.
Отсортировать список методом sort() и вывести его на экран.
*/


public  class seminar_3 {
    public static void main(String[] args) {
        
        int count = 10;
        ArrayList<Integer> randomList = new ArrayList<>();
        fillRandomList(randomList, count, 1, 100);

        System.out.println("До сортировки: " + randomList);
        Collections.sort(randomList);
        System.out.println("После сортировки: " + randomList);
    }

    private static void fillRandomList(ArrayList<Integer> randomList, int count, int min, int max) {
        Random rnd = new Random();
        
        for (int i = 0; i < count; i++) {
            randomList.add(rnd.nextInt(1, 100));
        }
    }
}