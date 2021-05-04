import controller.RacingGame;

public class Application {

    public static void main(String[] args) {
        try {
            final RacingGame racingGame = new RacingGame();
            racingGame.play();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
