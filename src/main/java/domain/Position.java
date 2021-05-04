package domain;

public class Position {

    private final int position;

    public Position(int startPosition) {
        this.position = startPosition;
    }

    public Position plus() {
        return new Position(position + 1);
    }

    public int getPosition() {
        return position;
    }
}
