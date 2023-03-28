package CardPack;

import java.util.ArrayList;
import java.util.List;


/**
 * # 3/ Créer une classe Paquet dont le constructeur simple génère un ArrayList de 32 cartes.
 */

public class CardPack32 {
    private List<Card32> list = new ArrayList<>(32);


    public CardPack32(){
        super();
        for ( Suit type : Suit.values()) {
            for (Value value : Value.values()){

                if (value.getType() != 32){
                    continue;
                }
                 Card32 card = new Card32(value, type);
                 list.add(card);
            }
        }
    }

    public void getCardPackList(){
        System.out.println(list);
    }

    public Card32 getSingleCard(int index){
        return this.list.get(index);
    }




}
