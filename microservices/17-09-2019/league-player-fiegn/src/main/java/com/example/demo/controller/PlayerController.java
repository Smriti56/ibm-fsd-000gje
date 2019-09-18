package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Player;
import com.example.demo.service.PlayerService;

import feign.Param;

@Controller

public class PlayerController {
	
	@Autowired
	PlayerService playerService;
	
	@RequestMapping("/fetchPlayers")
	public String players(Model theModel)
	{
		List<Player> players=playerService.getAllPlayers();
		theModel.addAttribute("players",players);
		return "main";
	}
	
	@RequestMapping("/delete/{id}")
	public String deleteplayers(@PathVariable int id)
	{
		Player player=playerService.delete(id);
		return "redirect:/fetchPlayers";
	}
	
	@RequestMapping("/update")
	public String updatePlayer(Model m,@RequestParam int id)
	{
		Player player=playerService.playerById(id);
		m.addAttribute("player", player);
		return "editform";
	}
	
	@RequestMapping("/save")
	public String save(@ModelAttribute("player") Player p)
	{
		playerService.save(p);
		return "redirect:/fetchPlayers";
	}
	
	
	@RequestMapping("/add")
	public String add(Model m)
	{
		Player player=new Player();
		m.addAttribute("player",player);
		return "addform";
	}
	
	@RequestMapping("/saveNew")
	public String saveNew(@ModelAttribute("player") Player p)
	{
		playerService.save(p);
		return "redirect:/fetchPlayers";
	}

}
