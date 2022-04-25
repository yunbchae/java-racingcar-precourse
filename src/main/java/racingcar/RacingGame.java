package racingcar;

import camp.nextstep.edu.missionutils.Randoms;
import racingcar.domain.MoveCondition;
import racingcar.domain.MoveCounter;
import racingcar.domain.NumberComparingMoveCondition;
import racingcar.domain.RacingCars;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class RacingGame {

    private static final int MINIMUM_RANDOM_NUMBER = 0;
    private static final int MAXIMUM_RANDOM_NUMBER = 9;

    private final InputView inputView;
    private final OutputView outputView;

    public RacingGame(final InputView inputView, final OutputView outputView) {
        this.inputView = inputView;
        this.outputView = outputView;
    }

    public void run() {
        final RacingCars racingCars = inputRacingCars();
        final MoveCounter moveCounter = new MoveCounter(inputMoveCount());
        moveCounter.forEach(() -> racingCars.race(this::generateMoveCondition));
    }

    private MoveCondition generateMoveCondition() {
        final int randomNumber = Randoms.pickNumberInRange(MINIMUM_RANDOM_NUMBER, MAXIMUM_RANDOM_NUMBER);
        return new NumberComparingMoveCondition(randomNumber);
    }

    private RacingCars inputRacingCars() {
        outputView.printInputCarNamesMessage();
        return RacingCars.of(inputView.readRacingCarNames());
    }

    private int inputMoveCount() {
        outputView.printInputMoveCountMessage();
        return inputView.readMoveCount();
    }
}
