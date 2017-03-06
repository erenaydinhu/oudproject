public class CarBuilder {
    private int speed;
    private String name;

    public CarBuilder setSpeed(int speed) {
        this.speed = speed;
        return this;
    }

    public CarBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public Car createCar() {
        return new Car(speed, name);
    }
}