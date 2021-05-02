package util;

import domain.Car;
import domain.CarName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class RacingReceptionistTest {

    @ParameterizedTest(name = "쉼표로 구분 된 자동차 이름 목록으로 자동차 목록을 생성한다.")
    @ValueSource(strings = {"a", "a,b,c"})
    public void carReceptionTest(String inputString) {
        // when
        List<Car> carList = RacingReceptionist.receive(inputString);

        // then
        assertThat(carList)
                .extracting("name")
                .usingFieldByFieldElementComparator()
                .isEqualTo(mockCarNameList(inputString));
    }

    private List<CarName> mockCarNameList(String inputString) {
        List<CarName> carNameList = new ArrayList<>();
        String[] carNames = inputString.split(RacingReceptionist.CAR_NAMES_INPUT_DELIMITER);
        for (String carName : carNames) {
            carNameList.add(new CarName(carName));
        }
        return carNameList;
    }

}
