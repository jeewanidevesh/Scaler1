package main.java.com.scaler.tictactoe.strategies.botplayingstrategy;

import main.java.com.scaler.tictactoe.models.Board;
import main.java.com.scaler.tictactoe.models.Move;
import main.java.com.scaler.tictactoe.models.Player;

public interface BotPlayingStrategy {
    Move decideMove(Player player, Board board);
}
