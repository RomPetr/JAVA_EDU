/*
Задание №0
Вывести в консоль “Hello world!”.
Вывести в консоль системные дату и время.
*/

import java.sql.Date; // для класса Date (устаревший)
import java.time.LocalDateTime; // для класса Calendar (устаревший)
import java.util.Calendar;

public class seminar_1 {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //Date
        //Calendar
        System.out.println(LocalDateTime.now());
    }
}
