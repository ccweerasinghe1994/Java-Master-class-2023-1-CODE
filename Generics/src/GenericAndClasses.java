public class GenericAndClasses {
    public static void main(String[] args) {
        Box<Phone> box = new Box<>();
        Phone phone = new Phone("Samsung");
        box.setT(phone);
        System.out.println(box.getT());

        Letter letter = new Letter("Hello");
        Box<Letter> box2 = new Box<>();
        box2.setT(letter);
        System.out.println(box2.getT());
    }
}
