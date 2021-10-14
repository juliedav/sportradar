package game;

import java.util.Collection;

public class ScoreBoard {

    private Collection<Game> finished_games;
    private Collection<Game> active_games;

    public void startGame(Game game){
        active_games.add(game);

    }

    public void stopGame(Game game){
        finished_games.add(game);
    }



}
