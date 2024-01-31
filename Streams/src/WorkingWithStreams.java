import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.lang.String;

public class WorkingWithStreams {

    @Test
    public void streams() {
        List<String> names = List.of("John", "Paul", "George", "Ringo");
        Stream<String> stringStream = names.stream();
//        same as above
        Stream<String> stringStream2 = Stream.of("John", "Paul", "George", "Ringo");

        List<Object> objects = stringStream.limit(2).sorted(null).dropWhile(null)
                .collect(Collectors.toList());

        String[] strings = {"John", "Paul", "George", "Ringo"};
//        How to use streams with arrays
        Arrays.stream(strings).forEach(System.out::println);

    }

}
