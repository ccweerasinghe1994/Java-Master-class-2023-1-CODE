public class Programmer extends Employee{
    private String[] programmingLanguages;
    public Programmer(String name, String address, String experience, int age) {
        super(name, address, experience, age);
    }

    public Programmer(String name, String address, String experience, int age, String[] programmingLanguages) {
        super(name, address, experience, age);
        this.programmingLanguages = programmingLanguages;
    }

    public String[] getProgrammingLanguages() {
        return programmingLanguages;
    }

    public void setProgrammingLanguages(String[] programmingLanguages) {
        this.programmingLanguages = programmingLanguages;
    }

    public void writingCode() {
        System.out.println("Writing code...");
    }
}
