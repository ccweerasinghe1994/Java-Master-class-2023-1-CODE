public class Bicycle implements Vehicle {
    private int currentSpeed;

    public Bicycle() {
    }

    public Bicycle(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    @Override
    public void move(int speed) {
        System.out.println("Bicycle is moving");
        this.currentSpeed = speed;
    }

    @Override
    public void applyBrake(int speed) {
        this.currentSpeed -= speed;
    }

    @Override
    public int getCurrentSpeed() {
        return currentSpeed;
    }

}
