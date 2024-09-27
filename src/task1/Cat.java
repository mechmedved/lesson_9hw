package task1;

public class Cat extends Animal {

    public Cat(String food, String location) {
        super(food, location);

    }

    @Override
    public void makeNoise() {
        System.out.println("Mew mew mew mew");
    }

    @Override
    public void Abilities() {
        System.out.println("Mouse hunt");
    }
}
