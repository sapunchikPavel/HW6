package Task1;

import java.util.Arrays;

public class Task1_1_2_3 {
    public static void sortStrings(String... args) {
        int[] lengthsArr = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            lengthsArr[i] = args[i].length();
        }

        Arrays.sort(lengthsArr);

        System.out.println("Task1");
        for (String str : args) {
            if (str.length() == lengthsArr[0]) {
                System.out.print("Самоая короткая строка: ");
                System.out.println(str);
            } else if (str.length() == lengthsArr[lengthsArr.length - 1]) {
                System.out.print("Самоая длинная строка: ");
                System.out.println(str);
            }
        }
        System.out.println("Task2");
        for (int i = 0; i < args.length; i++) {
            for (int j = 0; j < args.length; j++) {
                if (lengthsArr[i] == args[j].length()) {
                    System.out.println(args[j]);
                    break;
                }
            }
        }

        System.out.println("Task3");

        double averageLength = (lengthsArr[0] + lengthsArr[lengthsArr.length - 1]) / 2;
        for (String str : args) {
            if (str.length() < averageLength) {
                System.out.println(str + " её длина " + str.length());
            }
        }

    }
}
