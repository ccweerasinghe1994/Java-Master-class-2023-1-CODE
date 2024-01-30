public class GenericsWithMethods {
    public static void main(String[] args) {
        String[] array = {"Hello", "World"};
        Integer[] array2 = {1, 2, 3, 4, 5};
        Character[] array3 = {'a', 'b', 'c', 'd', 'e'};
        print(array2);
        print(array);
        print(array3);
    }

    static <T> void print(T[] array) {
        for (T s : array) {
            System.out.println(s.getClass().getName() + ": " + s);
        }
    }
}
