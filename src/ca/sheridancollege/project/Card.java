package ca.sheridancollege.project;

public class Card implements Comparable<Card> {
    private final Rank rank;
    private final suit suit;

    public Card(Rank rank, suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    @Override
    public String toString() {
        return rank + " of " + suit;
    }

    @Override
    public int compareTo(Card other) {
        return this.rank.ordinal() - other.rank.ordinal();
    }
}
