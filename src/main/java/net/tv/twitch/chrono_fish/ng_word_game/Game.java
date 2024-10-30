package net.tv.twitch.chrono_fish.ng_word_game;

import org.bukkit.entity.Player;

import java.util.ArrayList;

public class Game {

    private final ArrayList<CustomPlayer> players;
    private boolean isRunning;

    public Game(){
        this.players = new ArrayList<>();
        this.isRunning = false;
    }

    public ArrayList<CustomPlayer> getPlayers() {return players;}

    public boolean isRunning() {return isRunning;}
    public void setRunning(boolean running) {isRunning = running;}

    public CustomPlayer getCustomPlayer(Player player){
        for(CustomPlayer customPlayer : players){
            if(customPlayer.getPlayer().equals(player)) return customPlayer;
        }
        return null;
    }

    public void startGame(){
        if(isRunning) return;
    }

    public void endGame(){
        if(!isRunning) return;
    }
}
