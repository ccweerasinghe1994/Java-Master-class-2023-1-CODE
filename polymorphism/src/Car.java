public class Car implements Vehicle {
    private int currentSpeed;

    public Car() {
    }

    public Car(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    @Override
    public void move(int speed) {
        System.out.println("Car is moving");
        System.out.println(Vehicle.PURCHASE_RATE);
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
