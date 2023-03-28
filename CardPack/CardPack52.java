package CardPack;

import java.util.ArrayList;
import java.util.List;


/**
 * # 3/ Créer une classe Paquet dont le constructeur simple génère un ArrayList de 32 cartes.
 */

public class CardPack52 {
    private final List<Card52> list = new ArrayList<>(52);


    public CardPack52(){
        super();
        for ( Suit type : Suit.values()) {
            for (Value value : Value.values()){
                Card52 card = new Card52(value, type);
                list.add(card);
            }
        }
    }

    public void getCardPackList(){
        System.out.println(list);
    }

    public Card52 getSingleCard(int index){
        return this.list.get(index);
    }
}
