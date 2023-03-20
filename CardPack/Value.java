package CardPack;

public enum Value {
    seven,eight,nine,ten,jack,queen,king,ace;

    public String toString() {
        return switch (this) {
            case seven -> "7";
            case eight -> "8";
            case nine -> "9";
            case ten -> "10";
            case jack -> "jack";
            case queen -> "queen";
            case king -> "king";
            case ace -> "ace";
            default -> throw new RuntimeException("Value not found");
        };
    }
}
