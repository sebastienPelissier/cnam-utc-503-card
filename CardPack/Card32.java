package CardPack;

    /**
     * # 2/ Créer la classe Carte32 qui décrit le comportement d'une carte d'un jeu de 32 cartes.
     * # Ces cartes possèdent, en plus des attributs valeurs et atout, un motif sur leur dos.
     * # Par ailleurs, un dernier attribut booléen indique si la carte est posée face visible ou non.
     */

public class Card32 extends Card
{
    private final Value value;
    private final Trump trump;
    public Card32(Value value, Trump trump){
        super();
        this.value = value;
        this.trump = trump;
    }

    public String toString(){
        String name = this.trump + " " + this.value;
        return getIsFaceUp() ? name : "#####" ;
    }

    @Override
    public boolean isBetterThanOrEqual(CardInterface opponentCard) {

        return false;
    }
}