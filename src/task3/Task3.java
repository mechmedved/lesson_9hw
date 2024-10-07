package task3;

public class Task3 {
    public static void main(String[] args) {
        Person person = new Person();
        Person person1 = new Person("Дональд Эрвин Кнут",86);

        System.out.println(person.talk());
        System.out.println(person.move());
        System.out.println(person1.talk());
        System.out.println(person1.move());
    }
}
