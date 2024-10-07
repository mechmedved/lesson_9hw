package task1;

public class Veterinarian {
    public void treatAnimal(Animal animal){
        System.out.println(animal.toString());
        System.out.println(animal.makeNoise());
        System.out.println("food: " + animal.getFood());
        System.out.println("location: " + animal.getLocation());
    }
}
