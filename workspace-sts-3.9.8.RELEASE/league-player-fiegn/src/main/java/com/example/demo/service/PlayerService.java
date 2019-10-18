package com.example.demo.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.entity.Player;


@FeignClient(name="player-service",url="http://localhost:8762/player-service")
public interface PlayerService {
	
	@GetMapping("/players")
	public List<Player> getAllPlayers();
	
	@GetMapping("/player/{id}")
	public Player playerById(@PathVariable int id);
	
	@GetMapping("/delete/{id}" )
	public Player delete(@PathVariable int id);
	

	@RequestMapping(value="/update" ,method=RequestMethod.GET)
	public Player update(Player p);
	
	@PostMapping("/save")
	public Player save(@RequestBody Player p);
}
