package com.codingdojo.controllers;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class GoldController  {

    private int gold = 0;
    private List<String> events = new ArrayList<>();

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("gold", gold);
        model.addAttribute("events", events);
        return "index.jsp";
    }

    public int getGold() {
		return gold;
	}

	public void setGold(int gold) {
		this.gold = gold;
	}

	public List<String> getEvents() {
		return events;
	}

	public void setEvents(List<String> events) {
		this.events = events;
	}

	@PostMapping("/farm")
    public String farm(Model model) {
        int earnedGold = generateRandomNumber(10, 20);
        updateGold(earnedGold, "Farm");
        addEvent("Farm", earnedGold);
        model.addAttribute("gold", gold);
        model.addAttribute("events", events);
        return "redirect:/";
    }

    @PostMapping("/cave")
    public String cave(Model model) {
        int earnedGold = generateRandomNumber(5, 10);
        updateGold(earnedGold, "Cave");
        addEvent("Cave", earnedGold);
        model.addAttribute("gold", gold);
        model.addAttribute("events", events);
        return "/";
    }

    @PostMapping("/house")
    public String house(Model model) {
        int earnedGold = generateRandomNumber(2, 5);
        updateGold(earnedGold, "House");
        addEvent("House", earnedGold);
        model.addAttribute("gold", gold);
        model.addAttribute("events", events);
        return "redirect:/";
    }

    @PostMapping("/casino")
    public String casino(Model model) {
        int earnedGold = generateRandomNumber(-50, 50);
        updateGold(earnedGold, "Casino");
        addEvent("Casino", earnedGold);
        model.addAttribute("gold", gold);
        model.addAttribute("events", events);
        return "redirect:/";
    }

    private int generateRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }

    private void updateGold(int earnedGold, String location) {
        gold += earnedGold;
    }

    private void addEvent(String location, int earnedGold) {
        String event = "Usted entró a " + location + " y ";
        if (earnedGold >= 0) {
            event += "ganó: " + earnedGold + " gold";
        } else {
            event += "perdió: " + Math.abs(earnedGold) + " gold";
        }
        event += " (" + new Date(earnedGold) + ")";
        events.add(event);
    }
}