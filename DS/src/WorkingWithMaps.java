import java.util.HashMap;
import java.util.Map;

public class WorkingWithMaps {
    public static void main(String[] args) {
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

    static record Person(String name, int age) {
    }
}
