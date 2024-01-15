import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] languages = {"Java", "C++", "Python"};
        Programmer programmer = new Programmer("John", "123 Main St", "Senior", 30, languages);
        programmer.hi();
//        System.out.println(programmer.getName());
//        System.out.println(programmer.getAddress());
//        System.out.println(programmer.getExperience());
//        System.out.println(programmer.getAge());
//        System.out.println(Arrays.toString(programmer.getProgrammingLanguages()));
//        programmer.writingCode();
//        System.out.println(programmer);
//        System.out.println(programmer.hashCode());
    }
}
