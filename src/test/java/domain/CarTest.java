package domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {

    @DisplayName("자동차에 이름을 부여 할 수 있다.")
    @Test
    public void createCarTest() {
        // given
        String carNameString = "car";

        // when
        Car car = Car.of(carNameString);

        // then
        assertThat(car)
                .extracting("name")
                .usingRecursiveComparison()
                .isEqualTo(new CarName(carNameString));
    }

    @ParameterizedTest(name = "전달받은 값이 4이상이면 전진한다.")
    @CsvSource(value = {"0:0", "3:0", "4:1", "9:1"}, delimiter = ':')
    public void goOrStopTest(int randomNumber, int expectedPosition) {
        Car car = Car.of("car");
        car.goOrStop(randomNumber);
        assertThat(car)
                .extracting("position")
                .usingRecursiveComparison()
                .isEqualTo(new Position(expectedPosition));
    }
}
