package racingcar.view;

import java.util.Scanner;

public class InputView {

    private static final String CAR_NAME_PROMPT = "경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).";
    private static final String ROUND_NUMBER_PROMPT = "시도할 회수는 몇회인가요?";

    private final Scanner scanner;

    public InputView(Scanner scanner) {
        this.scanner = scanner;
    }

    public String inputCarNames() {
        System.out.println(CAR_NAME_PROMPT);
        return scanner.nextLine();
    }

    public String inputRoundNumber() {
        System.out.println(ROUND_NUMBER_PROMPT);
        return scanner.nextLine();
    }
}
