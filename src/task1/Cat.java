package task1;

public class Cat extends Animal {

    private String toHunt;

    public Cat(String food, String location, String toHunt) {
        super(food, location);
        this.toHunt = toHunt;
    }

    public String getToHunt() {
        return toHunt;
    }

    public void setToHunt(String toHunt) {
        this.toHunt = toHunt;
    }

    @Override
    public String makeNoise() {
        return "Mew mew mew mew";
    }

    @Override
    public String toString() {
        return "Cat [to hunt = " + toHunt + ", food = " + super.getFood() + ", location = " + super.getLocation() + "]";
    }
}
