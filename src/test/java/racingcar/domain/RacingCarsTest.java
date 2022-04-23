package racingcar.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;
import static org.assertj.core.api.Assertions.assertThatNoException;

class RacingCarsTest {

    @DisplayName("RacingCars 생성 테스트")
    @Nested
    class CreateTest {

        @DisplayName("자동차 이름 리스트로 RacingCars를 생성할 수 있다.")
        @Test
        void createSuccessTest() {
            assertThatNoException()
                    .isThrownBy(() -> new RacingCars(Arrays.asList("aaa", "bbb", "ccc")));
        }

        @DisplayName("중복된 이름으로 RacingCars 생성 시, IllegalArgumentException 예외가 발생한다.")
        @Test
        void duplicateNameTest() {
            assertThatIllegalArgumentException()
                    .isThrownBy(() -> new RacingCars(Arrays.asList("aaa", "aaa")))
                    .withMessageContaining("aaa");
        }

        @ParameterizedTest(name = "null 또는 빈 리스트로 RacingCars 생성 시, IllegalArgumentException 예외가 발생한다. [{index}]")
        @NullAndEmptySource
        void nullAndEmptyListTest(final List<String> carNameList) {
            assertThatIllegalArgumentException()
                    .isThrownBy(() -> new RacingCars(carNameList))
                    .withMessageContaining(String.valueOf(carNameList));
        }
    }

}