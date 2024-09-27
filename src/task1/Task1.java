package task1;

public class Task1 {
    public static void main(String[] args) {

        Cat cat = new Cat("mouses", "village");
        Dog dog = new Dog("meet", "village");
        Horse horse = new Horse("hay", "village");

        Veterinarian vet = new Veterinarian();

        Animal[] animals = new Animal[]{cat, dog, horse};

        for (Animal animal : animals) {
            vet.treadAnimal(animal);
            animal.Abilities();
        }
    }
}