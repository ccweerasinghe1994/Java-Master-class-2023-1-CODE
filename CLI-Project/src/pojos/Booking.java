package pojos;

public class Booking {
    private String userId;

    private String carModel;

    public Booking() {
    }

    public Booking(String userId, String carModel) {
        this.userId = userId;
        this.carModel = carModel;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "userId='" + userId + '\'' +
                ", carModel='" + carModel + '\'' +
                '}';
    }
}
