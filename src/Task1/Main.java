package Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 1 строку");
        String str1 = scanner.next();
        System.out.println("Введите 2 строку");
        String str2 = scanner.next();
        System.out.println("Введите 3 строку");
        String str3 = scanner.next();
        Task1_1_2_3.sortStrings(str1, str2, str3);
        Task1_4_5.checkWords(str1,str2,str3);



    }
}
