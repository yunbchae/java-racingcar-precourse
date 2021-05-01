package domain;

public class CarName {

    public static final int MIN_NAME_LENGTH = 1;
    public static final int MAX_NAME_LENGTH = 5;

    private final String name;

    public CarName(String name) {
        validateCarNameLength(name);
        this.name = name;
    }

    private void validateCarNameLength(String name) {
        if (name == null || name.length() < MIN_NAME_LENGTH || name.length() > MAX_NAME_LENGTH) {
            throw new IllegalArgumentException("자동차 이름은 5자 이하만 가능합니다.");
        }
    }
}
