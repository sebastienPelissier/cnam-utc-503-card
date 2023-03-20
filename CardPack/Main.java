package CardPack;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome");
        CardPack32 cardPack32 = new CardPack32();

        Card32 card = cardPack32.getSingleCard(2);
        System.out.println(card.toString());
        card.turn();
        System.out.println(card.toString());
    }
}