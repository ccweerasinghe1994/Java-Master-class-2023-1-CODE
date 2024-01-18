import java.util.ArrayList;
import java.util.List;

public class WorkingWithLists {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        System.out.println(colors);
//        list is ordered
        System.out.println();
        System.out.println();
        System.out.println(colors.getFirst());
        System.out.println(colors.get(0));
        System.out.println(colors.contains("Red"));

//        loop through the list
        System.out.println();
        System.out.println();
        System.out.println("for loop");
        for (String color : colors) {
            System.out.println(color);
        }
//        forEach
        System.out.println();
        System.out.println();
        System.out.println("forEach");
        colors.forEach(System.out::println);

        List<String> unModifiableList = List.of("Red", "Green");
//        this will throw an exception
        //        unModifiableList.add("Blue");
    }
}
