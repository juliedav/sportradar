package game;

public class Controller {
    public static void main(String[] args) {
        Game game = new Game("Mexico", "Canada");
        Game game1 = new Game("Spain", "Brazil");
        Game game2 = new Game("Germany", "France");
        Game game3 = new Game("Uruguay", "Italy");
        Game game4 = new Game("Argentina", "Australia");

        ScoreBoard board = new ScoreBoard("board");
        game.addObserver(board);
        board.startGame(game);
        board.startGame(game1);
        board.startGame(game2);
        board.startGame(game3);
        board.startGame(game4);
        board.stopGame(game);
        board.display();


    }
}
