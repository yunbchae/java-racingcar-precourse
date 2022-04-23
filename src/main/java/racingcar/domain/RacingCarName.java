package racingcar.domain;

public class RacingCarName {

    private static final int MINIMUM_LENGTH = 1;
    private static final int MAXIMUM_LENGTH = 5;

    private final String name;

    public RacingCarName(final String name) {
        validateNonNull(name);
        validateLength(name.trim());
        this.name = name.trim();
    }

    private void validateNonNull(final String name) {
        if (name == null) {
            throw new IllegalArgumentException("자동차의 이름은 필수 값입니다.");
        }
    }

    private void validateLength(final String name) {
        if (name.length() < MINIMUM_LENGTH || name.length() > MAXIMUM_LENGTH) {
            throw new IllegalArgumentException("자동차의 이름은 1자 이상 5자 이하이어야 합니다.");
        }
    }
}
