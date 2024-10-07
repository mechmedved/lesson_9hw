package task1;

public class Task1 {
    public static void main(String[] args) {

        Cat cat = new Cat("mouses", "village", "mouses");
        Dog dog = new Dog("meet", "village", "man");
        Horse horse = new Horse("hay", "village", "gallop");

        Veterinarian vet = new Veterinarian();

        Animal[] animals = new Animal[]{cat, dog, horse};

        for (Animal animal : animals) {
            vet.treatAnimal(animal);
        }
    }
}