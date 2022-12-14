package main.java.com.scaler.tictactoe.models;

public class Player {
    private char symbol;
    private String name;
    private PlayerType type;

    public Player(String name,char aChar,PlayerType type){
        this.name=name;
        this.symbol=aChar;
        this.type=type;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PlayerType getType() {
        return type;
    }

    public void setType(PlayerType type) {
        this.type = type;
    }
}
