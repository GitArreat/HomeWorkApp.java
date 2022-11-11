package lesson3;

import java.util.Arrays;
import java.util.Random;

public class homeWork {
    public static void main(String[] args) {
//        1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
//        С помощью цикла и условия заменить 0 на 1, 1 на 0;
        int array [] = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        change01(array);
        System.out.println(Arrays.toString(array));
//        2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
        int arr [] = new int[100];
        pagination(arr);
        System.out.println(Arrays.toString(arr));
//        3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
            int arr2 [] = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
            nums(arr2);
        System.out.println(Arrays.toString(arr2));
//        4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами
//        (можно только одну из диагоналей, если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны,
//        то есть [0][0], [1][1], [2][2], …, [n][n];

        line();
//        5. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа int длиной len,
//        каждая ячейка которого равна initialValue;

        inArray(4,6);
//        6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
        int mmArr [] = {13,2,3,4,1,55};
        minmaxArr(mmArr);

    }

    private static void minmaxArr(int[] mmArr) {
        int min = mmArr[0];
        int max = mmArr[0];
        for (int i = 0; i < mmArr.length; i++) {
            if (mmArr[i] < min) {
                min = mmArr[i];
            }
        }
            for (int i = 0; i < mmArr.length; i++) {
                if (mmArr[i] > max) {
                    max = mmArr[i];
                }
            }
            System.out.println("Maximum" +" "+ max);
            System.out.println("Minimum" +" "+ min);
    }




    private static void inArray(int len,int initialValue) {
        int Array[]= new int[len];
        for (int i =0; i < len; i ++){
            Array [i] = initialValue;
            System.out.println("[" + i + "]" + Array[i] + " ");
        }
    }

    public static Random random = new Random();
    private static void line() {
      int lineArray[][] = new int[5][5];
        for (int i = 0; i < lineArray.length; i++) {
            for (int j = 0; j <lineArray[i].length ; j++) {
                lineArray[i][j] = random.nextInt(20);
                if (i==j){ lineArray[i][j] = 1;
                }
                System.out.print(lineArray[i][j] + "|");
            }
            System.out.println();
        }
    }

    private static void nums(int[] arr2) {
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i]<6){
                arr2[i] *=2;
            }
        }
    }

    private static void pagination(int[] arr) {
        for (int i =0; i < arr.length; i++){
            arr [i] = i+1; // 100 включено
        }
    }

    private static void change01(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                array[i] = 0;}
            else {array[i] = 1;}
        }
    }
}



