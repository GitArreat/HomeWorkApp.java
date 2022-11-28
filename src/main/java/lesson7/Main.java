package lesson7;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Бася",5,false);
        Cat cat2 = new Cat("Клеверок",5,false);
        Plate plate = new Plate(4);
//        plate.info();
//        cat1.eat(plate);
//        cat2.eat(plate);
//        plate.info();
//        cat1.satietyFood(plate);
//        cat2.satietyFood(plate);


        Cat [] catsAray = {cat1,cat2};

        for (Cat cat : catsAray) {
            plate.info();
            cat.eat(plate);
            System.out.println("Кот " + cat.getName() + " покушал");
            cat.satietyCat(plate);
        }
    }
}
