public class Manager extends Employee{
    private int teamSize;
    public Manager(String name, String address, String experience, int age) {
        super(name, address, experience, age);
    }

    public void manage(){
        System.out.println("Managing...");
    }
}
