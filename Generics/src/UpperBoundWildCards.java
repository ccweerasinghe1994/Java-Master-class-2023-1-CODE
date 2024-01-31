import java.util.Date;
import java.util.List;

public class UpperBoundWildCards {
    public static void main(String[] args) {
        // List<Object> list = List.of(1, 2, 3, 4, 5,"6",new Date());
        List<Integer> list2 = List.of(1, 2, 3, 4, 5);
        List<Double> list3 = List.of(1.0, 2.0, 3.0, 4.0, 5.0);
        // List<String> list4 = List.of("1", "2", "3", "4", "5");
        List<Number> list5 = List.of();

        // print(list);
        printNumbers(list2);
        printNumbers(list3);
        // print(list4);
        printNumbers(list5);
    }

    static void printNumbers(List<? extends Number> list){
        list.forEach(System.out::println);
    }
}
