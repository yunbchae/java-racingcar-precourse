package racingcar.domain;

import java.util.*;

public class RacingCars {

    private final List<RacingCar> racingCarList;

    public RacingCars(final List<String> carNameList) {
        validateNonEmpty(carNameList);
        validateUnique(carNameList);
        this.racingCarList = Collections.unmodifiableList(createRacingCarList(carNameList));
    }

    private void validateNonEmpty(final List<String> carNameList) {
        if (carNameList == null || carNameList.isEmpty()) {
            throw new IllegalArgumentException(String.format("입력 값이 비어있습니다. input: %s", carNameList));
        }
    }

    private void validateUnique(final List<String> carNameList) {
        final Set<String> carNameSet = new HashSet<>(carNameList);
        if (carNameList.size() != carNameSet.size()) {
            throw new IllegalArgumentException(String.format("중복된 이름이 존재합니다. input: %s", carNameList));
        }
    }

    private List<RacingCar> createRacingCarList(final List<String> carNameList) {
        final List<RacingCar> racingCarList = new ArrayList<>();
        for (String carName : carNameList) {
            racingCarList.add(new RacingCar(carName));
        }
        return racingCarList;
    }
}
