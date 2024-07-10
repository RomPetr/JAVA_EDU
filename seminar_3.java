
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;



/*
Задание №0
Даны следующие строки, cравнить их с помощью == и метода equals() класса Object
 String s1 = "hello";
 String s2 = "hello";
 String s3 = s1;
 String s4 = "h" + "e" + "l" + "l" + "o";
 String s5 = new String("hello");
 String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});



public class seminar_3 {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = s1;
        String s4 = "h" + "e" + "l" + "l" + "o";
        String s5 = new String("hello");
        String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        System.out.println();

        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3));

        System.out.println();

        System.out.println(s1 == s4);
        System.out.println(s1.equals(s4));

        System.out.println();

        System.out.println(s1 == s5);
        System.out.println(s1.equals(s5));

        System.out.println();

        System.out.println(s1 == s6);
        System.out.println(s1.equals(s6));
    }
}
*/

/*
Задание №1
Заполнить список десятью случайными числами.
Отсортировать список методом sort() и вывести его на экран.



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
*/

/*
Задание №2.1
 Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
 Вывести название каждой планеты и количество его повторений в списке.

Задание №2.2 (если выполнено предыдущее задание)
Пройти по списку из предыдущего задания и удалить повторяющиеся элементы.


public class seminar_3 {
    public static void main(String[] args) {
        List<String> planets = planetList();
        uniquePlanetCount(planets);
        deleteRepeatPlanet(planets);
        System.out.println(planets);
        
    }

    private static List<String> planetList() {
        List<String> planets = new ArrayList<>();
        planets.add("Mars");
        planets.add("Mars");
        planets.add("Earth");
        planets.add("Earth");
        planets.add("Earth");
        planets.add("Jupiter");
        planets.add("Jupiter");
        planets.add("Jupiter");
        planets.add("Venus");
        planets.add("Neptune");
        planets.add("Saturn");
        planets.add("Uranus");
        planets.add("Mercury");
        planets.add("Earth");
        planets.add("Jupiter");
        planets.add("Venus");
        planets.add("Neptune");
        planets.add("Earth");
        planets.add("Venus");
        return planets;
    }

    private  static  void uniquePlanetCount(List<String> planets) {
        List<String> sortedPlanets = new ArrayList<>(planets);
        Collections.sort(sortedPlanets);
        // for(int i = 0; i < sortedPlanets.size(); i++) {
        //     System.out.println(sortedPlanets.get(i));
        // }
        int count = 1;
        String currentPlanet = sortedPlanets.get(0);

        for(int i = 1; i < sortedPlanets.size(); i++) {
            if(sortedPlanets.get(i).equals(currentPlanet)) {
                count++;
            } else {
                System.out.println(currentPlanet +": "+ count);
                count = 1;
                currentPlanet = sortedPlanets.get(i);
            }

        }
        System.out.println(currentPlanet +": "+ count);
    }

    private static void deleteRepeatPlanet(List<String> planets) {
        for (int i = 0; i < planets.size(); i++) {
            String currentPlanet = planets.get(i);
            for (int j = planets.size() - 1; j > i; j--) {
                if(planets.get(j).equals(currentPlanet)) {
                    planets.remove(j);
                }
            }
        }

    }
}
*/


/*
Задание №3
 Создать список типа ArrayList<String>.
 Поместить в него как строки, так и целые числа.
 Пройти по списку, найти и удалить целые числа. 
*/

public class seminar_3 {
    public static void main(String[] args) {
        List<String> lst = new ArrayList<>(Arrays.asList("One", "Two", "three", "1", "2", "Hello", "-10", "кто тут?"));
        //deleteInt(lst);
        deleteIntIterator(lst);
        System.out.println(lst);
    }

    private static boolean isInt(String str) {
        try {
            Integer.parseInt(str);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    private static void deleteInt (List<String> lst) {
        for (int i = 0; i < lst.size(); i++) {
            if(isInt(lst.get(i))) {
                lst.remove(i);
                i--;
            }
        }
    }

    // с помощью итератора
    private static void deleteIntIterator (List<String> lst) {
        Iterator<String> iter = lst.iterator();
        while (iter.hasNext()) {
            String elem = iter.next();
            if(isInt(elem)) {
                iter.remove();
            }
        }
    }
}