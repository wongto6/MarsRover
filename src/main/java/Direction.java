public enum Direction {
    N, E, S, W;

    public Direction turnLeft() {
        return Direction.values()[(this.ordinal() + 3) % 4];
    }

    public Direction turnRight() {
        return Direction.values()[(this.ordinal() + 1) % 4];
    }
}
