import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class WorkingWithMaps {
    public static void main(String[] args) {
Map<Person, Diamond> map = new HashMap<>();
map.put(new Person("John", 20), new Diamond("blue"));
System.out.println(new Person("John", 20).hashCode());
System.out.println(new Person("John", 20).hashCode());
//        System.out.println(map.get(new Person("John", 20)).hashCode());
    }

    private static void map() {
        Map<Integer, Person> map = new HashMap<>();
        map.put(1, new Person("John", 20));
        map.put(2, new Person("Mary", 30));
        map.put(3, new Person("Mike", 40));

        System.out.println(map.get(2));
        System.out.println(map.entrySet());
        System.out.println(map.size());
        System.out.println(map.containsKey(12));
        System.out.println(map.keySet());

        map.forEach((key, value) -> System.out.println(key + " " + value));

        map.remove(2);

        System.out.println(map);

        System.out.println(map.values());
    }

    static class Person {
        String name;
        int age;

        public Person() {
        }

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return age == person.age && Objects.equals(name, person.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age);
        }
    }

    record Diamond(String name) {
    }


}
