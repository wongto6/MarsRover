public enum Direction {
    N, E, S, W;

    public Direction turnLeft() {
        return Direction.values()[(this.ordinal() + (Direction.values().length - 1)) % Direction.values().length];
    }

    public Direction turnRight() {
        return Direction.values()[(this.ordinal() + 1) % Direction.values().length];
    }
}
