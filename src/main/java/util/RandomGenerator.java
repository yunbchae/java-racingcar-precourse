package util;

import java.util.Random;

public class RandomGenerator {

    private static final int RANDOM_NUMBER_BOUND = 10;

    private final Random random;

    public RandomGenerator(Random random) {
        this.random = random;
    }

    public int generateRandomNumber() {
        return random.nextInt(RANDOM_NUMBER_BOUND);
    }
}
