package racingcar.domain;

import racingcar.util.Assert;

public class RacingCar {

    private final RacingCarName name;
    private final RacingCarPosition position;

    public RacingCar(final RacingCarName name, final RacingCarPosition position) {
        Assert.notNull(name, "name은 필수 값입니다.");
        Assert.notNull(position, "position은 필수 값입니다.");

        this.name = name;
        this.position = position;
    }

    public RacingCar(final String name) {
        this(new RacingCarName(name), RacingCarPosition.startingLine());
    }

    public void move(final MoveCondition moveCondition) {
        Assert.notNull(moveCondition, "moveCondition은 필수 값입니다.");

        if (moveCondition.isSatisfied()) {
            position.move();
        }
    }
}
