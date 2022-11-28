package lesson7;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public String getName() {
        return name;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public Cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }
    public void eat(Plate plate){
        plate.decreaseFood(appetite);
        if (plate.food <= 0 ){
            plate.food = 0;
        }
        if (plate.food < appetite){
            
        }

    }
    public void satietyCat(Plate plate){
        if (plate.food > appetite){
            satiety = true;
            System.out.println("Кот доволен и сыт" + " " + satiety);
        }
        else{
        System.out.println("Кот не доволен и не cыт" + " " + satiety);
        }
    }
}

