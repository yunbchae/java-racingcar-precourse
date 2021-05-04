package domain;

import java.util.ArrayList;
import java.util.List;

public class RaceResult {

    private final List<CarName> carNames;

    public RaceResult(List<CarName> carNames) {
        this.carNames = carNames;
    }

    public String render() {
        List<String> carNmaes = new ArrayList<>();
        for (CarName carName : carNames) {
            carNmaes.add(carName.getName());
        }
        return String.join(", ", carNmaes) + "가 최종 우승했습니다.";
    }
}
