package domain;

public class Car {

    public static final int START_POSITION = 0;
    public static final int GO_NUMBER_THRESHOLD = 4;

    private final CarName name;
    private final Position position;

    private Car(CarName name) {
        this.name = name;
        this.position = new Position(START_POSITION);
    }

    public static Car of(String carName) {
        return new Car(new CarName(carName));
    }

    public void goOrStop(int randomNumber) {
        if (randomNumber >= GO_NUMBER_THRESHOLD) {
            position.plus();
        }
    }
}
