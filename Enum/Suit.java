package Enum;

public enum Suit {
    HEART,SPADE,CLUB,DIAMOND;

    public String toString() {
        return switch (this) {
            case HEART -> "heart";
            case SPADE -> "spade";
            case CLUB -> "club";
            case DIAMOND -> "diamond";
            default -> throw new RuntimeException("Type not found");
        };
    }
}
