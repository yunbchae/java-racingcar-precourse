package domain;

import controller.RandomGenerator;

import java.util.ArrayList;
import java.util.List;

public class Cars {

    private final List<Car> cars;

    public Cars(List<Car> carList) {
        this.cars = carList;
    }

    public List<RaceReport> race(RandomGenerator randomGenerator) {
        List<RaceReport> raceReports = new ArrayList<>();
        for (Car car : cars) {
            car.goOrNot(randomGenerator.generateRandomNumber());
            raceReports.add(new RaceReport(car));
        }
        return raceReports;
    }

    public RaceResult getResult() {
        cars.sort(Car::compareTo);
        int max = cars.get(0).getPosition().getPosition();
        List<CarName> carNameList = new ArrayList<>();
        for (Car car : cars) {
            addWinners(max, carNameList, car);
        }
        return new RaceResult(carNameList);
    }

    private void addWinners(int max, List<CarName> carNameList, Car car) {
        if (car.getPosition().getPosition() == max) {
            carNameList.add(car.getName());
        }
    }
}
