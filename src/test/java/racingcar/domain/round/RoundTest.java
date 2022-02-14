package racingcar.domain.round;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import racingcar.exception.NotIntegerException;
import racingcar.exception.NumberTooSmallException;

public class RoundTest {

    @Test
    void roundWithPositiveNumber() {
        Round round = new Round("3");
        Assertions.assertThat(round.isEnd()).isFalse();
    }

    @Test
    void roundWithNegativeNumber() {
        String input = "-1";
        Assertions.assertThatExceptionOfType(NumberTooSmallException.class)
            .isThrownBy(() -> new Round(input))
            .withMessageContaining("1 이상의 양수");
    }

    @Test
    void roundWithZero() {
        String input = "0";
        Assertions.assertThatExceptionOfType(NumberTooSmallException.class)
            .isThrownBy(() -> new Round(input))
            .withMessageContaining("1 이상의 양수");
    }

    @Test
    void roundWithNotNumericValue() {
        String input = "hello";
        Assertions.assertThatExceptionOfType(NotIntegerException.class)
            .isThrownBy(() -> new Round(input))
            .withMessageContaining("1 이상의 양수");
    }
}
