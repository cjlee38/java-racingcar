package racingcar.domain.car;

import java.util.Objects;
import racingcar.exception.CarNameBlankException;
import racingcar.exception.CarNameLengthException;

public class Name {

    private final String name;

    public Name(String name) {
        if (name.isEmpty() || name.isBlank()) {
            throw new CarNameBlankException("자동차 이름은 공백이 될 수 없습니다.");
        }
        if (name.length() > 5) {
            throw new CarNameLengthException("자동차 이름은 5글자 이하여야 합니다.");
        }
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Name name1 = (Name) o;
        return Objects.equals(name, name1.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
