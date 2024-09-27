package task1;

public class Animal {


    private String food;
    private String location;

    // constructor

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    // methods

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void eat() {
        System.out.println("Eating...");
    }

    public void sleep() {
        System.out.println("Sleeping...");
    }

    public void makeNoise() {
        System.out.println("Making noise...");
    }

    public void Abilities(){
        System.out.println("Abilities...");
    }
}
