import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Введите строку:");

        int tmp = 0;

        do {
            String str =scr.next();
            try {
                checkStr(str);
                break;

            } catch (FormatException fe) {

                System.out.println("Ошибка!\nНе допускается наличие цифр и повтор букв трижды подряд!");
                System.out.println("В строке содержится цифра/повтор буквы: "+ fe.getChar());
                tmp =1;
            }
        }
        while (tmp==1);
        System.out.println("Все ОК!");
    }

    public static String checkStr (String str){
        char[] chArray = str.toCharArray();
        char[] nums = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

        for (int i = 1; i < str.length(); i++) {
            for (int j = i+1; j < str.length(); j++) {
                if (chArray[i-1]==chArray[i] && chArray[i]==chArray[j]){
                    throw new FormatException(chArray[i]);
                }

            }
        }

        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < nums.length; j++) {
                if(chArray[i]==nums[j]){
                    throw new FormatException(chArray[i]);
                }
            }
        }
        return str;
    }
}
