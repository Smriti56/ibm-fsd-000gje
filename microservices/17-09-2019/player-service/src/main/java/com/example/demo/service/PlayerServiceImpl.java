package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Player;
import com.example.demo.repository.PlayerRepository;

@Service
public class PlayerServiceImpl implements PlayerService{

	@Autowired
	private PlayerRepository playerRepository;
	
	@Override
	public List<Player> getAllPlayers() {
		List<Player> players=playerRepository.findAll();
		return players;
	}

	@Override
	public Player getPlayerById(int id) {
		Player player =playerRepository.findById(id).get();
		return player;
	}

	@Override
	public Player updatePlayer(Player player) {
		Player updatedPlayer=playerRepository.save(player);
		return updatedPlayer;
	}

	@Override
	public void deletePlayer(int id) {
		Player p=playerRepository.findById(id).get();
		playerRepository.delete(p);
		
	}

	@Override
	public void savePlayer(Player player) {
		playerRepository.save(player);
		
	}

}
