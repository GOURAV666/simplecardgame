import ca.sheridancollege.project.Card;
import ca.sheridancollege.project.Deck;
import ca.sheridancollege.project.Player;
import ca.sheridancollege.project.game;
import java.util.ArrayList;
import java.util.Scanner;

public class SimpleCardGame extends game {

    private Deck deck;

    public SimpleCardGame(String name) {
        super(name);
        deck = new Deck();
    }

    @Override
    public void play() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Player> players = super.getPlayers();

        // Prompt the user to enter the names of the players
        for (int i = 0; i < 2; i++) {
            System.out.print("Enter the name of Player " + (i + 1) + ": ");
            String playerName = scanner.nextLine();
            players.add(new Player(playerName));
        }

        deck.shuffle();

        for (Player player : players) {
            player.addCard(deck.drawCard());
        }

        declareWinner();
    }

    @Override
    public void declareWinner() {
        ArrayList<Player> players = super.getPlayers();
        if (players.size() != 2) {
            System.out.println("Error: SimpleCardGame requires exactly 2 players.");
            return;
        }

        Card card1 = players.get(0).getCard();
        Card card2 = players.get(1).getCard();

        System.out.println(players.get(0).getName() + " has: " + card1);
        System.out.println(players.get(1).getName() + " has: " + card2);

        int result = card1.compareTo(card2);
        if (result > 0) {
            System.out.println(players.get(0).getName() + " wins!");
        } else if (result < 0) {
            System.out.println(players.get(1).getName() + " wins!");
        } else {
            System.out.println("It's a tie!");
        }
    }

    public static void main(String[] args) {
        SimpleCardGame game = new SimpleCardGame("Simple Card Game");
        game.play();
    }
}
