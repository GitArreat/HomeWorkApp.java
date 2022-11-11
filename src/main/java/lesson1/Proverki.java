package lesson1;

import java.util.Arrays;
import java.util.Scanner;

public class Proverki {
    public static void main(String[] args) {
//        calculator();

    }

    private static void calculator() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int value1 = scanner.nextInt();
        System.out.println("Введите второе число");
        int value2 = scanner.nextInt();
        int result;
        System.out.println("Введите операцию");
        String res = scanner.nextLine();
        res = scanner.nextLine();
        switch(res) {
            case "+": result=value1+value2;
                System.out.println("Результат :" +result); break;
            case "-": result=value1-value2;
                System.out.println("Результат :" +result); break;
            case "*": result=value1*value2;
                System.out.println("Результат :"+ result); break;
            case "/": if (value2==0) {
                System.out.println("Ошибка");
            } else {result=value1/value2;
                System.out.println("Результат :"+result);}
            default:{
                System.out.println("Введите корректрые значения");
            }
        }
    }
}

