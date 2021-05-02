package domain;

public class Position {

    private int position;

    public Position(int startPosition) {
        this.position = startPosition;
    }

    public void plus() {
        this.position++;
    }
}
