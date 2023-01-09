package main.java.com.scaler.tictactoe.models;

import main.java.com.scaler.tictactoe.factories.BotPlayingStrategyFactory;
import main.java.com.scaler.tictactoe.startegies.botplayingstrategy.BotPlayingStrategy;

public class Bot extends Player{

    private BotDifficultyLevel botDifficultyLevel;
    private BotPlayingStrategy botPlayingStrategy;
    public Bot(String name, char aSymbol, BotDifficultyLevel difficultyLevel) {
        super(name, aSymbol, PlayerType.BOT);
        this.botDifficultyLevel=difficultyLevel;
        this.botPlayingStrategy= BotPlayingStrategyFactory.getStrategyForDifficultyLevel(difficultyLevel);
    }

    public BotDifficultyLevel getBotDifficultyLevel() {
        return botDifficultyLevel;
    }

    public void setBotDifficultyLevel(BotDifficultyLevel botDifficultyLevel) {
        this.botDifficultyLevel = botDifficultyLevel;
    }

    public Move decideMove(Board board){
        return botPlayingStrategy.decideMove(this,board);
    }
}
