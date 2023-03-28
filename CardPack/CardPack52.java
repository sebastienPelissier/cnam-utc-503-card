package CardPack;

import java.util.ArrayList;
import java.util.List;

public final class CardPack52 {
    private final List<Card52> list = new ArrayList<>(52);
    private static CardPack52 instance = null;

    private CardPack52(){
        super();
        for ( Suit type : Suit.values()) {
            for (Value value : Value.values()){
                Card52 card = new Card52(value, type);
                list.add(card);
            }
        }
    }

    public final static CardPack52 getInstance(){
        if (CardPack52.instance == null){
            synchronized (CardPack52.class){
                if (CardPack52.instance == null){
                    CardPack52.instance = new CardPack52();
                }
            }
        }
        return CardPack52.instance;
    }

    public void getCardPackList(){
        System.out.println(list);
    }

    public Card52 getSingleCard(int index){
        return this.list.get(index);
    }
}
