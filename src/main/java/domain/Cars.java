package domain;

import controller.RandomGenerator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cars {

    private final List<Car> cars;

    public Cars(List<Car> carList) {
        this.cars = Collections.unmodifiableList(carList);
    }

    public List<RaceReport> race(RandomGenerator randomGenerator) {
        List<RaceReport> raceReports = new ArrayList<>();
        for (Car car : cars) {
            car.goOrNot(randomGenerator.generateRandomNumber());
            raceReports.add(new RaceReport(car));
        }
        return raceReports;
    }

}
