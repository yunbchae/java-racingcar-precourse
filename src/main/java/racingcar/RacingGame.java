package racingcar;

import racingcar.domain.RacingCars;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class RacingGame {

    private final InputView inputView;
    private final OutputView outputView;

    public RacingGame(final InputView inputView, final OutputView outputView) {
        this.inputView = inputView;
        this.outputView = outputView;
    }

    public void run() {
        final RacingCars racingCars = inputRacingCars();
    }

    private RacingCars inputRacingCars() {
        outputView.printInputCarNamesMessage();
        return RacingCars.of(inputView.readRacingCarNames());
    }
}
