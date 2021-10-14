package game;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private String home;
    private String away;
    private int home_score = 0;
    private int away_score = 0;


// -------------------------------------------------------
    // observer observable
    private List<ScoreBoard> scoreBoards = new ArrayList<>();
    public void addObserver(ScoreBoard scoreBoard) {
        this.scoreBoards.add(scoreBoard);
    }

    public void removeObserver(ScoreBoard scoreBoard) {
        this.scoreBoards.remove(scoreBoard);
    }
// -------------------------------------------------------
    // String or Team as input
    public Game(String home_team, String away_team){
        home = home_team;
        away = away_team;
    }

    public Game getGame(){
        return this;
    }

    public String getHome_team(){
        //System.out.println(home);
        return home;
    }
    public String getAway_team(){
        //System.out.println(away);
        return away;
    }

    public int getHome_score(){
        //System.out.println(home_score);
        return home_score;
    }

    public int getAway_score(){
        //System.out.println(away_score);
        return away_score;
    }

    public void setScore(Team team){
        if(team.equals(home)){
            home_score++;
            notifyBoard();
        }
        else {
            away_score++;
            notifyBoard();
        }
    }

    public void notifyBoard(){
        for(ScoreBoard board : scoreBoards){
            board.update();
        }
    }

}
