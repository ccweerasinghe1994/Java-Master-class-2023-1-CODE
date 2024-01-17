import java.util.Arrays;

public class TheArrays {
    public static void main(String[] args) {
        String[] names = new String[5];
        names[0] = "John";
        names[1] = "Jack";
        System.out.println(names[0]);
        System.out.println(Arrays.toString(names));
        System.out.println(names.length);
//        System.out.println(names[-2]);

//        if you know the values of the array
        int[] numbers = {11, 2, 3, 4, 5};

//        for loop
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
//        enhanced  for loop
        for (int number : numbers) {
            System.out.println(number);
        }

//        Stream API
        System.out.println("Stream API");
        Arrays.stream(numbers).forEach(System.out::println);

//        Arrays is a utility class
        System.out.println("Arrays is a utility class");
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(names));
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

    }

}
