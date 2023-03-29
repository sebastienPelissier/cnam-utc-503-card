package DeskOfCard;

import Card.Card32;
import Enum.Suit;
import Enum.Value;

import java.util.ArrayList;
import java.util.List;

public final class DeskCards32 {
    private final List<Card32> list = new ArrayList<>(32);

    private static DeskCards32 instance = null;

    private DeskCards32(){
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

    public final static DeskCards32 getInstance(){
        if (DeskCards32.instance == null){
            synchronized (DeskCards32.class){
                if (DeskCards32.instance == null){
                    DeskCards32.instance = new DeskCards32();
                }
            }
        }
        return DeskCards32.instance;
    }

    public void getCardPackList(){
        System.out.println(list);
    }

    public Card32 getSingleCard(int index){
        return this.list.get(index);
    }




}
