package domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;
import static org.assertj.core.api.Assertions.assertThatNoException;

public class CarNameTest {

    @DisplayName("자동차 이름은 5자 이하이다.")
    @Test
    public void createCarNameTest() {
        assertThatNoException().isThrownBy(() -> new CarName("a"));
        assertThatNoException().isThrownBy(() -> new CarName("abcde"));
        assertThatIllegalArgumentException().isThrownBy(() -> new CarName(""));
        assertThatIllegalArgumentException().isThrownBy(() -> new CarName("abcdef"));
    }

}
