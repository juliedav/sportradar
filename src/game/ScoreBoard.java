package game;

import java.util.ArrayList;
import java.util.Collection;

public class ScoreBoard {

    private String name;

    private ArrayList<Game> finished_games = new ArrayList<>();
    private Collection<Game> active_games = new ArrayList<>();;

    public ScoreBoard(String name) {
        this.name = name;
    }

    public void startGame(Game game){
        active_games.add(game);
        display();
    }

    public void stopGame(Game game){
        finished_games.add(game);
        active_games.remove(game);
        game.setInPlay();
        display();
    }

    public void update(){
        display();
    }

    public void display(){
        System.out.println("Active games:");
        for(Game g : active_games){
            String home = g.getHome_team();
            String away = g.getAway_team();
            int hScore = g.getHome_score();
            int aScore = g.getAway_score();
            System.out.println(home +" - "+ away +": "+ hScore +" - "+ aScore);
        }
        System.out.println("-----------------------------------------");
    }

    public void displaySummary(){
        System.out.println("\nFinished games:");
        // reversed for-loop gets the games ordered by most recently added
        for (int i = finished_games.size() - 1; i >= 0; i--) {
            Game g = finished_games.get(i);
            String home = g.getHome_team();
            String away = g.getAway_team();
            int hScore = g.getHome_score();
            int aScore = g.getAway_score();
            System.out.println(home +" "+ hScore +" - "+ away +" "+ aScore);
        }
        System.out.println("-----------------------------------------");
    }


}
