package Card;

public abstract class Card<T extends CardInterface>
{
    private boolean isFaceUp = false;

    public Card(){
        super();
    }

    protected boolean getIsFaceUp(){
        return this.isFaceUp;
    }
    public void turn(){
        this.isFaceUp = !this.isFaceUp;
    }
}
