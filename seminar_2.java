/*
Задание №1
Дано четное число N (>0) и символы c1 и c2.
Написать метод, который вернет строку длины N, которая
состоит из чередующихся символов c1 и c2, начиная с c1. 


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
*/

/*
Задание №2
Напишите метод, который сжимает строку.
Пример: вход aaaabbbcdd. 
Результат a3b4c1d2


// Решение ИИ
public class seminar_2 {
    public static void main(String[] args) {
        String str = "aaaabbbcdd";
        System.out.println(compress(str));
    }

    public static String compress(String str) {
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for(int i = 0; i < str.length() - 1; i++) {
            if(str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                sb.append(str.charAt(i)).append(count);
                count = 1;
            }
        }
        sb.append(str.charAt(str.length() - 1)).append(count);
        return sb.toString();
    }
}


// решение в группе
public class seminar_2 {
    public static void main(String[] args) {
        String str = "aaaabbbcdd";
        System.out.println(compressString(str));
    }

    public static String compressString(String str) {
        StringBuilder res = new StringBuilder();
        int count = 1;
        char currentChar = str.charAt(0);

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == currentChar) {
                count++;
            } else {
                res.append(currentChar).append(count);
                currentChar = str.charAt(i);
                count = 1;
            }
        }
        res.append(currentChar).append(count);
        return res.toString();
    }
}
*/

/*
Задание №3
Напишите метод, который принимает на вход строку (String) и
определяет является ли строка палиндромом (возвращает boolean значение). 


// решение ИИ
public class seminar_2 {
    public static void main(String[] args) {
        String str = "А роза упала на лапу Азора";
        System.out.println(isPalindrome(str));
    }

    public static boolean isPalindrome(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return str.equals(sb.toString());
    }
}
*/
// решение в группе

public class seminar_2 {

    public static void main(String[] args) {
        
        String word = "довод";
        System.out.println(isPalindrom(word));
    }

    public static boolean isPalindrom(String inputStr) {
        for (int i = 0; i < inputStr.length() / 2; i++) {
            if (inputStr.charAt(i) != inputStr.charAt(inputStr.length() -1 - i)) {
                return false;
            }

        }
        return true;
    }

}