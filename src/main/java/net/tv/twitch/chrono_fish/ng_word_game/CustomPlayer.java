package net.tv.twitch.chrono_fish.ng_word_game;

import org.bukkit.entity.Player;

public class CustomPlayer {

    private final Player player;
    private String ngWord;
    private boolean isAlive;

    public CustomPlayer(Player player){
        this.player = player;
        this.ngWord = "";
        this.isAlive = true;
    }

    public Player getPlayer() {return player;}

    public String getNGWord() {return ngWord;}
    public void setNGWord(String ngWord) {this.ngWord = ngWord;}

    public boolean isAlive() {return isAlive;}
    public void setAlive(boolean alive) {isAlive = alive;}
}
