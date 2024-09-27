package task1;

public class Dog extends Animal {
    public Dog(String food, String location) {
        super(food, location);


    }

    @Override
    public void makeNoise() {
        System.out.println("Bow-wow-wow-wow");
    }

    @Override
    public void Abilities() {
        System.out.println("Can guard");
    }
}
