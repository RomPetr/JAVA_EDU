
import java.util.Iterator;
import  java.util.List;


/*
public  class  lecture_3 {

    public static void main(String[] args) {
        Object ob = 1;
        GetType(ob);
        ob = 1.2;
        GetType(ob);


        ArrayList<Integer> list = new ArrayList<Integer> ();
        list.add(2809);

        for (Object o : list) {
            System.out.println(o);
        }


        StringBuilder day = new StringBuilder("28");
        StringBuilder month = new StringBuilder("9");
        StringBuilder year = new StringBuilder("1990");
        StringBuilder[] date = new StringBuilder[]{day, month, year};
        List<StringBuilder> d = Arrays.asList(date);
        System.out.println(d);
        date[1] = new StringBuilder("09");
        System.out.println(d);

    }

    static  void GetType(Object obj) {
        System.out.println(obj.getClass().getName());
    }
}
*/

public class lecture_3 {

    public static void main(String[] args) {
        
        List<Integer> list = List.of(1, 12, 123, 1234, 12345);

        for(int item : list) {
            System.out.println(item);
        }

        Iterator<Integer> col = list.iterator();
        System.out.println();

        while(col.hasNext()) {
            System.out.println(col.next());
        }
    }
}