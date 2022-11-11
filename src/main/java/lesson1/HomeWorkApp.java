package lesson1;

public class HomeWorkApp {
    public static void main(String[] args) {
//        printThreeWords();
//        checkSumSign();
//        printColor();
//        compareNumbers();
        checkSum();
        posizivOrNegativ();
        negativTest(3);
        System.out.println(negativTest(3));
    }

    private static boolean negativTest(int a) {
        if (a < 0) {
            return true;}
        return false;
        }


    private static void posizivOrNegativ() {
    int f = 5;
        if(f>=0){System.out.println(f + "-" +"Положительное");
        } else if (f<=0) {System.out.println(f + "-" +"Отрицательное");
        }
    }

    private static void checkSum() {
        int a = 7;
        int b = 30;
        int sum = a + b;
        if(sum >= 10 && sum <=20){System.out.println("true");
        }
        else {System.out.println("false");
        }
    }


    private static void compareNumbers() {
        int a = 50;
        int b = 10;
        if (a > b){
            System.out.println("a>=b");
        }
        else {
            System.out.println("a<b");
        }
    }

    private static void printColor() {
        int value = 500;
        if (value <= 0 ){
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Жёлтый");
        }
        else if (value > 100){
            System.out.println("Зелёный");
        }
    }

    private static void checkSumSign() {
    int a = 50;
    int b = 66;
    int c = a + b;
        if (c >= 0){
            System.out.println("Сумма положительная");
    }
        else {
            System.out.println("Сумма отрицательная");
        }
    }

    private static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
}
