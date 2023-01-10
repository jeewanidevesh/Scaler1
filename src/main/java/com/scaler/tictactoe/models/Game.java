package main.java.com.scaler.tictactoe.models;

import main.java.com.scaler.tictactoe.exceptions.InvalidGameConstructionParametersException;
import main.java.com.scaler.tictactoe.startegies.gamewinningstrategy.GameWinningStrategy;

import java.util.List;

public class Game {
    private Board board;
    private List<Player>players;
    private List<Move> moves;
    private GameStatus gameStatus;
    private int nextPlayerIndex;
    private GameWinningStrategy gameWinningStrategy;
    private Player winner;

    private Game(){

    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public GameStatus getGameStatus() {
        return gameStatus;
    }

    public void setGameStatus(GameStatus gameStatus) {
        this.gameStatus = gameStatus;
    }

    public int getNextPlayerIndex() {
        return nextPlayerIndex;
    }

    public void setNextPlayerIndex(int nextPlayerIndex) {
        this.nextPlayerIndex = nextPlayerIndex;
    }

    public GameWinningStrategy getGameWinningStrategy() {
        return gameWinningStrategy;
    }

    public void setGameWinningStrategy(GameWinningStrategy gameWinningStrategy) {
        this.gameWinningStrategy = gameWinningStrategy;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public class Builder{
        private int dimension;
        private List<Player>players;


        public Builder setDimension(int dimension) {
            this.dimension = dimension;
            return this;
        }


        public Builder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }

        private boolean valid() throws InvalidGameConstructionParametersException {
            if(this.dimension<3){
                throw new InvalidGameConstructionParametersException("Dimension of game can't be 1");
            }

            if(this.players.size()!=this.dimension-1){
                throw  new InvalidGameConstructionParametersException("Number of players must be Dimension - 1");
            }
            // validate no 2 people with same char

            //validate all 1 bot
            return true;
        }

        public Game build() throws InvalidGameConstructionParametersException {
            if(!valid()){
                throw new InvalidGameConstructionParametersException("Something is wrong");
            }
            return new Game();
        }
    }
}
