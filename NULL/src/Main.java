import java.util.Objects;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        String name = null;
        Optional<String> opt = Optional.ofNullable(name);
        System.out.println(opt.isEmpty());
        if (opt.isEmpty()){
            System.out.println("name is null");
        }   else {
            System.out.println(opt.get());
        }
        opt.ifPresentOrElse(
                s -> System.out.println(s.toUpperCase()),
                () -> System.out.println("name is null")
        );
        String aDefault = opt.orElse("default");
        System.out.println(aDefault);

      printUppercase(Optional.of("test"));

    }

    public static void printUppercase(Optional<String> s) {

        s.ifPresentOrElse(
                value -> System.out.println(value.toUpperCase()),
                () -> System.out.println("name is null"));
    }
}