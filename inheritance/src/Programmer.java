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
        super.hi();
        System.out.println(this.name + "Writing code...");
    }

    @Override
    public void hi() {
        String msg = """
                Hi my name is %s
                I am a programmer
                """.formatted(this.name);
        System.out.println(msg);
    }
}
