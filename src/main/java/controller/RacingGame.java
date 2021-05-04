package controller;

import domain.Cars;
import domain.RaceReport;
import view.InputView;
import view.OutputView;

import java.util.List;
import java.util.Random;

public class RacingGame {

    public void play() {
        final RandomGenerator randomGenerator = new RandomGenerator(new Random());
        final Cars cars = InputView.registerCars();
        final int runCount = InputView.getRunCount();
        System.out.println("실행 결과");
        for (int i = 0; i < runCount; ++i) {
            final List<RaceReport> raceReport = cars.race(randomGenerator);
            OutputView.print(raceReport);
        }
    }

}
