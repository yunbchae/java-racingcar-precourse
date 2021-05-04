package controller;

import domain.Car;

import java.util.ArrayList;
import java.util.List;

public class RacingReceptionist {

    static final String CAR_NAMES_INPUT_DELIMITER = ",";

    public static List<Car> receive(String carNamesInput) {
        final String[] carNames = carNamesInput.split(CAR_NAMES_INPUT_DELIMITER);
        final List<Car> cars = new ArrayList<>();
        for (String carName : carNames) {
            cars.add(Car.of(carName));
        }
        return cars;
    }
}
