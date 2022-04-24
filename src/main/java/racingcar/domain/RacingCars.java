package racingcar.domain;

import racingcar.util.Assert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RacingCars {

    private final List<RacingCar> racingCarList;

    public RacingCars(final List<RacingCar> racingCarList) {
        Assert.notEmpty(racingCarList, String.format("입력 값이 비어있습니다. input: %s", racingCarList));
        this.racingCarList = Collections.unmodifiableList(racingCarList);
    }

    public static RacingCars of(final List<String> carNameList) {
        Assert.notEmpty(carNameList, String.format("입력 값이 비어있습니다. input: %s", carNameList));
        Assert.notDuplicated(carNameList, String.format("중복된 이름이 존재합니다. input: %s", carNameList));

        final List<RacingCar> racingCarList = new ArrayList<>();
        for (String carName : carNameList) {
            racingCarList.add(new RacingCar(carName));
        }
        return new RacingCars(racingCarList);
    }

    public List<RacingCar> getWinners() {
        final RacingCar winner = Collections.max(racingCarList);
        final List<RacingCar> winners = new ArrayList<>();
        for (RacingCar racingCar : racingCarList) {
            judgeWinner(winner, winners, racingCar);
        }
        return Collections.unmodifiableList(winners);
    }

    private void judgeWinner(final RacingCar winner, final List<RacingCar> winners, final RacingCar candidate) {
        if (candidate.isAtSamePosition(winner)) {
            winners.add(candidate);
        }
    }
}
