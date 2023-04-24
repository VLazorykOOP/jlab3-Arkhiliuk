package First;

public class Person {
    String PersonName;
    Person() {
        PersonName = "none";
    }
    Person(String name_) {
        PersonName = name_;
    }
    public void show() {
        System.out.printf("Name: %s\n", PersonName);
    }
}

