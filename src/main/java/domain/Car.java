package domain;

public class Car {

    private final CarName name;

    private Car(CarName name) {
        this.name = name;
    }

    public static Car of(String carName) {
        return new Car(new CarName(carName));
    }
}
