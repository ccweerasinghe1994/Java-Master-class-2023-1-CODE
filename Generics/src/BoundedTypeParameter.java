public class BoundedTypeParameter {
    public static void main(String[] args) {
        System.out.println(countGreaterThan(new Integer[]{1, 2, 3, 4, 5}, 3) );
        System.out.println(countGreaterThan(new Double[]{1.1, 2.2, 3.3, 4.4, 5.5}, 3.3) );
        System.out.println(countGreaterThan(new String[]{"a", "b", "c", "d", "e"}, "c") );


    }
    interface A {}
    interface B {}
    static <T extends Number & Comparable<T> & A & B> int countGreaterThan(T[] anArray, T elem) {
        int count = 0;
        for (T e : anArray) {
            if (e.compareTo(elem) > 0) {
                ++count;
            }
        }
        return count;
    }
}
