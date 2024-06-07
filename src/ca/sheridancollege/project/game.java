package ca.sheridancollege.project;

import java.util.ArrayList;

public abstract class game {

    private final String name;
    private ArrayList<Player> players;

    public game(String name) {
        this.name = name;
        players = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    public abstract void play();

    public abstract void declareWinner();
}
