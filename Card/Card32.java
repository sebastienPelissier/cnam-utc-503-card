package Card;

import Enum.Suit;
import Enum.Value;

public class Card32 extends Card
{
    private final Value value;
    private final Suit suit;
    public Card32(Value value, Suit suit){
        super();
        this.value = value;
        this.suit = suit;
    }

    public String toString(){
        String name = this.suit + " " + this.value.getLabel();
        return getIsFaceUp() ? name : "#####" ;
    }

    public boolean isBetterThanOrEqual(CardInterface opponentCard)
    {
        Card32 card = (Card32) opponentCard;
        return this.value.getPower() >= card.value.getPower();
    }
}