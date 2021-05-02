package domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CarTest {

    @DisplayName("자동차에 이름을 부여 할 수 있다.")
    @Test
    public void createCarTest() {
        // given
        String carNameString = "car";

        // when
        Car car = Car.of(carNameString);

        // then
        Assertions.assertThat(car)
                .extracting("name")
                .usingRecursiveComparison()
                .isEqualTo(new CarName(carNameString));
    }
}
