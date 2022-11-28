package lesson7;

public class Plate {
    int food;

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public Plate(int food) {
        this.food = food;
    }
    public void info(){
        System.out.println("В миске еды " + food);
    }
    public void decreaseFood(int n){
        food -=n;
    }

}
