package racingcar.domain;

public class RacingCar {

    private final RacingCarName name;
    private final RacingCarPosition position;

    public RacingCar(final RacingCarName name, final RacingCarPosition position) {
        validateNonNull(name, position);
        this.name = name;
        this.position = position;
    }

    public RacingCar(final String name) {
        this(new RacingCarName(name), RacingCarPosition.startingLine());
    }

    private void validateNonNull(final RacingCarName name, final RacingCarPosition position) {
        if (name == null || position == null) {
            throw new IllegalArgumentException(String.format("입력 값이 비어있습니다. name: %s, position: %s", name, position));
        }
    }

    public void move(final MoveCondition moveCondition) {
        if (moveCondition.isSatisfied()) {
            position.move();
        }
    }
}
