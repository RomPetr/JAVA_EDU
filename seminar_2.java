/*
Задание №1
Дано четное число N (>0) и символы c1 и c2.
Написать метод, который вернет строку длины N, которая
состоит из чередующихся символов c1 и c2, начиная с c1. 
*/

import java.security.PublicKey;

public class seminar_2 {
    public static void main(String[] args) {
        int n = 100_000;
        char c1 = 'A';
        char c2 = 'B';
        //ABABABAB
        long start = System.currentTimeMillis();
        alternatingCharsStr(n, c1, c2);
        System.out.println(System.currentTimeMillis() - start);

        start = System.currentTimeMillis();
        alternatingCharsSb(n, c1, c2); // через StringBuilder
        System.out.println(System.currentTimeMillis() - start);
    }

    public static String alternatingCharsStr(int n, char c1, char c2) {
        String str = "";
        for(int i = 0; i < n /2; i++) {
            str = str + c1 + c2;
        
        }
        return str;
    }
// через StringBuilder
    public static String alternatingCharsSb(int n, char c1, char c2) {
        StringBuilder sb = new StringBuilder(n);
        for(int i = 0; i < n /2; i++) {
            sb.append(c1).append(c2);
        }

        return sb.toString();
}

}
