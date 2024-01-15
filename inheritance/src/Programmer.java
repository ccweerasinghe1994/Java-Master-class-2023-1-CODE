public class Programmer extends Employee{
    private String[] programmingLanguages;
    public Programmer(String name, String address, String experience, int age) {
        super(name, address, experience, age);
    }

    public void writingCode() {
        System.out.println("Writing code...");
    }
}
