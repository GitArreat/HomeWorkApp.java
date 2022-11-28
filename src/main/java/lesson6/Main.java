package lesson6;

public class Main {
    public static void main(String[] args) {
        String win = "смог";
        String loss = " не смог";
        String eventName;
        String eventResult;

        Cat cat = new Cat("Кот","Бася",10,0);
        Cat cat2 = new Cat("Кот","Людовинг",250,0);
        Dog dog = new Dog("Собака","Ричард",500,333);
        Dog dog2 = new Dog("Собака","Клеверок",1000,3330);


        Animal[] animals = {cat,cat2,dog,dog2};
        int distance = 150;
        int swimLeight = 100;

        for (int i = 0; i < animals.length; i++) {
            String nameString = animals[i].getType() + " " + animals[i].getName() + " может пробежать ";
            eventName = animals[i].getMaxRun() + "м.,а пытается пробежать" +" "+  distance + "м. а в результе ";
            eventResult = animals[i].run(distance) ? win : loss;
            System.out.print(nameString + eventName + eventResult);
            System.out.println();



            if (animals[i].maxSwim == 0){
                System.out.println("Кошки не умеют плавать");
            }
            else {
                String catString = animals[i].getType() + " " + animals[i].getName() + " может проплыть ";
                eventName = animals[i].getMaxSwim() + "м. а пытается проплыть" + " " + swimLeight + "м. а в результе ";
                eventResult = animals[i].swim(swimLeight) ? win:loss;
                System.out.println(catString+eventName+eventResult);

            }
        }



    }

}
