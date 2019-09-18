package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Player;

public interface PlayerService {
	
	public void savePlayer(Player p);
	public List<Player> getAllPlayers();
	public Player getPlayerById(int id);
	public Player updatePlayer(Player player);
	public void deletePlayer(int id);

}
