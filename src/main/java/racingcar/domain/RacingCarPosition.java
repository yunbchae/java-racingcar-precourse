package racingcar.domain;

import java.util.Objects;

public class RacingCarPosition {

    private static final int STARTING_LINE_POSITION = 0;
    private static final int MINIMUM_POSITION = 0;

    private int position;

    public RacingCarPosition(final Integer position) {
        validateNonNull(position);
        validateMinimum(position);
        this.position = position;
    }

    public static RacingCarPosition startingLine() {
        return new RacingCarPosition(STARTING_LINE_POSITION);
    }

    private void validateNonNull(final Integer position) {
        if (position == null) {
            throw new IllegalArgumentException(String.format("자동차의 위치는 필수 값입니다. input: %d", position));
        }
    }

    private void validateMinimum(final Integer position) {
        if (position < MINIMUM_POSITION) {
            throw new IllegalArgumentException(String.format("자동차의 위치는 0 이상이어야 합니다. input: %d", position));
        }
    }

    public void move() {
        this.position++;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof RacingCarPosition)) return false;
        final RacingCarPosition that = (RacingCarPosition) o;
        return position == that.position;
    }

    @Override
    public int hashCode() {
        return Objects.hash(position);
    }
}
