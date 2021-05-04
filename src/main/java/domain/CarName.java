package domain;

public class CarName {

    private static final int MAX_NAME_LENGTH = 5;

    private final String name;

    CarName(String name) {
        validateEmptyName(name);
        validateCarNameLength(name);
        this.name = name;
    }

    private void validateEmptyName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("자동차 이름이 비어있습니다.");
        }
    }

    private void validateCarNameLength(String name) {
        if (name.length() > MAX_NAME_LENGTH) {
            throw new IllegalArgumentException(String.format("자동차 이름은 %d자 이하만 가능합니다.", MAX_NAME_LENGTH));
        }
    }

    public String getName() {
        return name;
    }
}
