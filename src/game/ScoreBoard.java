package game;

import java.util.ArrayList;
import java.util.Collection;

public class ScoreBoard {

    private String name;
    private Collection<Game> finished_games = new ArrayList<>();
    private Collection<Game> active_games = new ArrayList<>();;

    public ScoreBoard(String name) {
        this.name = name;
    }

    public void startGame(Game game){
        active_games.add(game);
    }

    public void stopGame(Game game){
        active_games.remove(game);
        finished_games.add(game);
    }

    public void update(){

    }

    public void display(){
        System.out.println("Active games");
        for(Game g : active_games){
            String home = g.getHome_team();
            String away = g.getAway_team();
            int hScore = g.getHome_score();
            int aScore = g.getAway_score();
            System.out.println(home +" "+ hScore +" "+ away +" "+ aScore);
        }
        System.out.println("\nFinished games");
        for(Game g : finished_games){
            String home = g.getHome_team();
            String away = g.getAway_team();
            int hScore = g.getHome_score();
            int aScore = g.getAway_score();
            System.out.println(home +" "+ hScore +" "+ away +" "+ aScore);
        }

    }


}
