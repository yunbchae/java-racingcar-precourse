package domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CarTest {

    @DisplayName("자동차에 이름을 부여 할 수 있다.")
    @Test
    public void createCarTest() {
        CarName carName = new CarName("car");
        Car car = new Car(carName);
        Assertions.assertThat(car).extracting("name").isEqualTo(carName);
    }
}
