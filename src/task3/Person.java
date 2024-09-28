package task3;

public class Person {
    private String fullName = "Незнакомый человек";
    private int age;

    public Person() {}

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String move(Person person) {
        return person.getFullName() + " идет";
    }

    public String talk(Person person) {
        return person.getFullName() + " говорит";
    }
}