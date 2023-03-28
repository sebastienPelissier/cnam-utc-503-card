package DeskOfCard;

import java.util.ArrayList;
import java.util.List;

public final class DeskCards52 {
    private final List<Card52> list = new ArrayList<>(52);
    private static DeskCards52 instance = null;

    private DeskCards52(){
        super();
        for ( Suit type : Suit.values()) {
            for (Value value : Value.values()){
                Card52 card = new Card52(value, type);
                list.add(card);
            }
        }
    }

    public final static DeskCards52 getInstance(){
        if (DeskCards52.instance == null){
            synchronized (DeskCards52.class){
                if (DeskCards52.instance == null){
                    DeskCards52.instance = new DeskCards52();
                }
            }
        }
        return DeskCards52.instance;
    }

    public void getCardPackList(){
        System.out.println(list);
    }

    public Card52 getSingleCard(int index){
        return this.list.get(index);
    }
}
