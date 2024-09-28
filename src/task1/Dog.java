package task1;

public class Dog extends Animal {

    public String toGuard;

    public Dog(String food, String location, String toGuard) {
        super(food, location);
        this.toGuard = toGuard;

    }

    public String getToGuard() {
        return toGuard;
    }

    public void setToGuard(String toGuard) {
        this.toGuard = toGuard;
    }

    @Override
    public String makeNoise() {
        return "Bow-wow-wow-wow";
    }

    @Override
    public String toString() {
        return "Dog [to guard = " + toGuard + ", food = " + super.getFood() + ", location = " + super.getLocation() + "]";
    }
}
