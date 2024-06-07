package ca.sheridancollege.project;

public class Player {
    private final String name;
    private Card card;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Card getCard() {
        return card;
    }

    public void addCard(Card card) {
        this.card = card;
    }
}
