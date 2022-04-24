package racingcar.domain;

import racingcar.util.Assert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RacingCars {

    private final List<RacingCar> racingCarList;

    public RacingCars(final List<String> carNameList) {
        Assert.notEmpty(carNameList, String.format("입력 값이 비어있습니다. input: %s", carNameList));
        Assert.notDuplicated(carNameList, String.format("중복된 이름이 존재합니다. input: %s", carNameList));

        this.racingCarList = Collections.unmodifiableList(createRacingCarList(carNameList));
    }

    private List<RacingCar> createRacingCarList(final List<String> carNameList) {
        final List<RacingCar> racingCarList = new ArrayList<>();
        for (String carName : carNameList) {
            racingCarList.add(new RacingCar(carName));
        }
        return racingCarList;
    }
}
