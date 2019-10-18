package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Player;
import com.example.demo.service.PlayerService;

@RestController
public class PlayerController {
	
	@Autowired
	PlayerService playerService;
	
	@GetMapping("/players")
	public List<Player> getPlayers()
	{
		List<Player> allPlayers=playerService.getAllPlayers();
		return allPlayers;
	}
	
	@GetMapping("/player/{id}")
	public Player playerById(@PathVariable int id)
	{
		Player p=playerService.getPlayerById(id);
		return p;
	}
	
	@PostMapping("/save")
	public Player save(@RequestBody Player p)
	{
		playerService.savePlayer(p);
		return p;
	}
	
	@RequestMapping(value="/delete/{id}" ,method=RequestMethod.GET)
	public Player delete(@PathVariable int id)
	{
		Player p=playerService.getPlayerById(id);
		playerService.deletePlayer(id);
		return p;
	}
	
	@RequestMapping(value="/update" ,method=RequestMethod.GET)
	public Player update(Player p)
	{
		Player pl=playerService.getPlayerById(p.getId());
		playerService.updatePlayer(p);
		return p;
	}
	
	
	
	
	

}
