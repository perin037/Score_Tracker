package rs.ac.ni.pmf.scoretracker.repository;

import java.util.ArrayList;
import java.util.List;

import rs.ac.ni.pmf.scoretracker.model.Game;

public class GamesRepositoty {

    public static GamesRepositoty INSTANCE = new GamesRepositoty();

    private List<Game> games = new ArrayList<>();

    private GamesRepositoty(){
        games.add(new Game(1, "Real", "Barca"));
        games.add(new Game(2, "Denver", "GSW"));
        games.add(new Game(3, "Real", "Barca"));
        games.add(new Game(4, "Real", "Barca"));
        games.add(new Game(5, "Real", "Barca"));
        games.add(new Game(6, "Real", "Barca"));
        games.add(new Game(7, "Real", "Barca"));
        games.add(new Game(8, "Real", "Barca"));
    }

    public List<Game> getGames(){
        return games;
    }
}
