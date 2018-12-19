package com.example.Joke.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.Joke.service.JokeService;

@Controller
public class JokeController {

	private JokeService jokeService;

	public JokeController(JokeService jokeService) {
		super();
		this.jokeService = jokeService;
	}
	
	@RequestMapping({"/",""}) //This will map context root for us
	public String showJoke(Model model ) {
		model.addAttribute("joke",jokeService.getJoke());
		return "chuckNorris";
	}
	
}
