package racingcar.view;

import java.util.function.Consumer;

public class OutputView {

    private final Consumer<String> outputConsumer;

    public OutputView(final Consumer<String> outputConsumer) {
        this.outputConsumer = outputConsumer;
    }

    public void printInputCarNamesMessage() {
        outputConsumer.accept("경주할 자동차 이름을 입력하세요. (이름은 쉼표(,) 기준으로 구분) ");
    }
}
