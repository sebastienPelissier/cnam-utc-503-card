package CardPack;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome");

        Card32 card = CardPack32.getInstance().getSingleCard(2);
        System.out.println(card.toString());
        card.turn();
        System.out.println(card.toString());

        Card52 card52 = CardPack52.getInstance().getSingleCard(6);
        card52.turn();
        System.out.println(card52.toString());

    }
}