package Task1;

public class Task1_4_5 {
    public static void checkWords(String... args) {
        System.out.println("Task4");
        boolean flag = false;
        for (String str : args) {
            for (int i = 0; i < (str.length()-1); i++) {
                for (int j = i + 1; j < str.length(); j++) {
                    if (str.charAt(i) == str.charAt(j)) {
                        flag = true;
                    }
                }
            }
            if(!flag){
                System.out.println(str);
            }
            flag = false;
        }
        if(flag){
            System.out.println("Такого слова нет");
        }

        System.out.println("Task5");

        flag = true;
        boolean isPolinom = true;
        for (String str : args) {
           for(int i = 0; i< str.length();i++){
               if (!('0'<=str.charAt(i) && '9'>=str.charAt(i))){
                   flag = false;
               }
           }
           if(flag){
               for(int i = 0; i<str.length()/2; i++){
                   if(str.charAt(i)!=str.charAt(str.length()-i-1)){
                       isPolinom = false;
                       break;
                   }
               }
               if(isPolinom){
                   System.out.println(str);
               }
           }
           flag =true;
           isPolinom = true;
        }
    }
}
