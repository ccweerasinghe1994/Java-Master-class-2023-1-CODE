import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class GettingStarted {

    @Test
    public void imperativeApproach() throws IOException {
        List<Person> people = List.of(
                new Person("chamra", "weerasinghe", "Abc", 30, Gender.MALE),
                new Person("John", "Doe", "john@example.com", 25, Gender.MALE),
                new Person("Jane", "Doe", "jane@example.com", 28, Gender.FEMALE),
                new Person("Alice", "Smith", "alice@example.com", 30, Gender.FEMALE),
                new Person("Bob", "Johnson", "bob@example.com", 35, Gender.MALE),
                new Person("Charlie", "Brown", "charlie@example.com", 40, Gender.MALE)
        );


        List<Person> youngPeople = new ArrayList<>();
        int limit = 10;
        int counter = 0;

        for (Person person : people) {
            if (person.getAge() < 30) {
                if (counter == limit) {
                    break;
                }
                youngPeople.add(person);
                counter++;
            }
        }

        System.out.println(youngPeople);
    }

    @Test
    public void declarativeApproach() throws IOException {
        List<Person> people = List.of(
                new Person("chamra", "weerasinghe", "Abc", 30, Gender.MALE),
                new Person("John", "Doe", "john@example.com", 25, Gender.MALE),
                new Person("Jane", "Doe", "jane@example.com", 28, Gender.FEMALE),
                new Person("Alice", "Smith", "alice@example.com", 30, Gender.FEMALE),
                new Person("Bob", "Johnson", "bob@example.com", 35, Gender.MALE),
                new Person("Charlie", "Brown", "charlie@example.com", 40, Gender.MALE)
        );


        List<Person> youngPeople = people.stream().filter(person -> person.getAge() < 30).limit(10).collect(Collectors.toList());
        System.out.println(youngPeople);
    }


    public static void printNames1(String name1, String... names) {
        System.out.println("sssssssssss     " + name1);
        for (String name : names) {
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        ArrayList<String> sampleDara = new ArrayList<>();
        sampleDara.add("aaaa");
        sampleDara.add("bbbb");
        sampleDara.add("cccc");
        printNames1("dddd", sampleDara.toArray(new String[0]));
    }
}
