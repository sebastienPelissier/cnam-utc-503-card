package DeskOfCard;

public abstract class Card implements CardInterface
{
    private boolean isFaceUp = false;

    public Card(){
        super();
    }

    protected boolean getIsFaceUp(){
        return this.isFaceUp;
    }

    @Override
    public void turn(){
        this.isFaceUp = !this.isFaceUp;
    }
}
