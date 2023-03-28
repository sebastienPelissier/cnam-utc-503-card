package DeskOfCard;

public enum Suit {
    heart,spade,club,diamond;

    public String toString() {
        return switch (this) {
            case heart -> "heart";
            case spade -> "spade";
            case club -> "club";
            case diamond -> "diamond";
            default -> throw new RuntimeException("Type not found");
        };
    }
}
