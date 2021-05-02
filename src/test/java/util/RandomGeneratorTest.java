package util;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Random;

import static org.assertj.core.api.Assertions.assertThat;

public class RandomGeneratorTest {

    class MockRandom extends Random {

        private final int fixedInteger;

        MockRandom(int fixedInteger) {
            this.fixedInteger = fixedInteger;
        }

        @Override
        public int nextInt(int bound) {
            return fixedInteger;
        }
    }

    @ParameterizedTest(name = "주어진 랜덤 객체에 의해 랜덤 값을 반환한다.")
    @ValueSource(ints = {0, 5, 9})
    public void randomGeneratorBoundTest(int mockRandomNumber) {
        // given
        MockRandom mockRandom = new MockRandom(mockRandomNumber);

        // when
        RandomGenerator randomGenerator = new RandomGenerator(mockRandom);
        int randomNumber = randomGenerator.generateRandomNumber();

        // then
        assertThat(randomNumber).isEqualTo(mockRandomNumber);
    }

}
