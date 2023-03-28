package CardPack;

import java.util.ArrayList;
import java.util.List;

public final class CardPack32 {
    private final List<Card32> list = new ArrayList<>(32);

    private static CardPack32 instance = null;

    private CardPack32(){
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

    public final static CardPack32 getInstance(){
        if (CardPack32.instance == null){
            synchronized (CardPack32.class){
                if (CardPack32.instance == null){
                    CardPack32.instance = new CardPack32();
                }
            }
        }
        return CardPack32.instance;
    }

    public void getCardPackList(){
        System.out.println(list);
    }

    public Card32 getSingleCard(int index){
        return this.list.get(index);
    }




}
