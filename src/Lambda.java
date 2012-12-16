import java.util.ArrayList;
import java.util.Collection;

public class Lambda {

    class Person {
        String name;
        int age;
    }

    public static void main(String... args) {
        new Lambda().go();
    }

    void go() {
        System.out.println("Hallo Welt");

        Collection<Person> people = new ArrayList<Person>();

        Person p1 = new Person();
        p1.name = "Hans";
        p1.age = 11;

        Person p2 = new Person();
        p2.name = "Dieter";
        p2.age = 81;

        people.add(p1);
        people.add(p2);

        Comparable c = (Person a, Person b) -> {
            a.name.compareTo(b.name);
        };

        System.out.println("m");
    }
}
