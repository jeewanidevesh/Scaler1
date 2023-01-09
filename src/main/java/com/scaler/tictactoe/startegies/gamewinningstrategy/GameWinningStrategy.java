package main.java.com.scaler.tictactoe.startegies.gamewinningstrategy;

import main.java.com.scaler.tictactoe.models.Board;
import main.java.com.scaler.tictactoe.models.Cell;
import main.java.com.scaler.tictactoe.models.Player;

public interface GameWinningStrategy {
    boolean checkWinner(Board board, Player lastMovepLayer, Cell moveCell);
}
