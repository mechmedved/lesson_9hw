package task1;

public class Horse extends Animal {

    private String toRun;

    public Horse(String food, String location, String toRun) {
        super(food, location);
        this.toRun = toRun;
    }

    public String getToRun() {
        return toRun;
    }

    public void setToRun(String toRun) {
        this.toRun = toRun;
    }

    @Override
    public String makeNoise() {
        return "Ihh-go-go";
    }

    @Override
    public String toString() {
        return "Horse [to run = " + toRun + ", food = " + super.getFood() + ", location = " + super.getLocation() + "]";
    }
}
