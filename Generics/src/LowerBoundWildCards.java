import java.util.List;

public class LowerBoundWildCards {
    public static void main(String[] args) {
        // List<Object> list = List.of(1, 2, 3, 4, 5,"6",new Date());
        List<Integer> list2 = List.of(1, 2, 3, 4, 5);
        List<Double> list3 = List.of(1.0, 2.0, 3.0, 4.0, 5.0);
        // List<String> list4 = List.of("1", "2", "3", "4", "5");
        List<Number> list5 = List.of();

        // print(list);
        printNumbers(list2);
        // printNumbers(list3);
        // print(list4);
        printNumbers(list5);
    }
    //The ? super Integer is a lower bounded wildcard.
    // It restricts the unknown type to be a specific type or a superclass of that type.
    // Here, it means the list can be of Integer or any superclass of Integer.
    static void printNumbers(List<? super Integer> list){
        list.forEach(System.out::println);
    }
}
