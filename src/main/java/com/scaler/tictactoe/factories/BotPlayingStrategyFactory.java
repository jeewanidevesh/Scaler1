package main.java.com.scaler.tictactoe.factories;

import main.java.com.scaler.tictactoe.models.Board;
import main.java.com.scaler.tictactoe.models.BotDifficultyLevel;
import main.java.com.scaler.tictactoe.models.Move;
import main.java.com.scaler.tictactoe.models.Player;
import main.java.com.scaler.tictactoe.startegies.botplayingstrategy.BotPlayingStrategy;
import main.java.com.scaler.tictactoe.startegies.botplayingstrategy.RandomBotPlayingStrategy;

public class BotPlayingStrategyFactory {

    public static BotPlayingStrategy getStrategyForDifficultyLevel(BotDifficultyLevel difficultyLevel){
        return new RandomBotPlayingStrategy();
    }
}
