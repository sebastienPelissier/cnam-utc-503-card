package CardPack;

public class Card52 extends Card{

    private final Value value;
    private final Suit suit;
    public Card52(Value value, Suit suit){
        super();
        this.value = value;
        this.suit = suit;
    }

    public String toString(){
        String name = this.suit + " " + this.value.getLabel();
        return getIsFaceUp() ? name : "#####" ;
    }
    @Override
    public boolean isBetterThanOrEqual(CardInterface opponentCard) {
        return false;
    }
}
