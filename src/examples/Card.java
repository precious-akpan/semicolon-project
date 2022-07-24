package examples;

public class Card {
    private final String face;
    private final String suit;

    public Card(String cardFace, String cardSuit) {
        this.face = cardFace;
        this.suit = cardSuit;
    }

    @Override
    public String toString() {
        return face + " of " + suit;
    }
}
