package racingcar.domain;

public class RacingCar {

    private final RacingCarName name;
    private final RacingCarPosition position;

    public RacingCar(final String name) {
        this.name = new RacingCarName(name);
        this.position = RacingCarPosition.startingLine();
    }
}
