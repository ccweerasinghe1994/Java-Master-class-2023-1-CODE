public class ElectricScooter implements Vehicle {
    private int currentSpeed;

    public ElectricScooter() {
    }

    public ElectricScooter(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    @Override
    public void move(int speed) {
        System.out.println("ElectricScooter is moving");
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
