package CardPack;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome");
        CardPack32 cardPack32 = new CardPack32();

        Card32 card = cardPack32.getSingleCard(2);
        System.out.println(card.toString());
        card.turn();
        System.out.println(card.toString());



        CardPack52 cardPack52 = new CardPack52();
        Card52 card52 = cardPack52.getSingleCard(6);
        card52.turn();
        System.out.println(card52.toString());

    }
}