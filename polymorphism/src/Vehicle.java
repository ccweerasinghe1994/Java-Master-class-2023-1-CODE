public interface Vehicle {
    //    constants
//    abstract methods
//    default methods
    double PURCHASE_RATE = 0.8;

    void move(int speed);

    void applyBrake(int speed);

    int getCurrentSpeed();

    default double milesToKm() {
        return getCurrentSpeed() * 1.60934;
    }
}
