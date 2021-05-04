package view;

import controller.RacingReceptionist;
import domain.Cars;

import java.util.Scanner;

public class InputView {

    private static final Scanner scanner = new Scanner(System.in);

    public static Cars registerCars() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        return new Cars(RacingReceptionist.receive(scanner.nextLine()));
    }

    public static int getRunCount() {
        System.out.println("시도할 회수는 몇회인가요?");
        return scanner.nextInt();
    }
}
