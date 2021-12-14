package crossroads;

public class Car {
    private Brand brand;

    public Car(Brand brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Car "
                + brand;
    }
}
