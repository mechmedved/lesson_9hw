package task1;

public class Horse extends Animal {

    public Horse(String food, String location) {
        super(food, location);
    }

    @Override
    public void makeNoise() {
        System.out.println("Ihh-go-go");
    }

    @Override
    public void Abilities() {
        System.out.println("Sleeps stands up");
    }
}
