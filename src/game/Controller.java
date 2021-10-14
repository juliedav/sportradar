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
        game1.addObserver(board);
        game2.addObserver(board);
        game3.addObserver(board);
        game4.addObserver(board);

        board.startGame(game);
        board.startGame(game1);
        board.startGame(game2);
        board.startGame(game3);
        board.startGame(game4);

        game.setScore("Canada");game.setScore("Canada");game.setScore("Canada");
        game.setScore("Canada");game.setScore("Canada");
        game1.setScore("Brazil");game1.setScore("Brazil");

        board.stopGame(game);
        board.stopGame(game1);
        // can add goals after a game is finished. not good.
        game1.setScore("Brazil");

        board.displaySummary();




    }
}
