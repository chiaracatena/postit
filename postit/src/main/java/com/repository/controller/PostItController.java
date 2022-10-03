package com.repository.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.ResponseEntity.BodyBuilder;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.repository.PostItRepository;
import com.repository.UtenteRepository;
import com.repository.entities.PostIt;

@RestController
public class PostItController {

	@Autowired
	private UtenteRepository utenteRepository;
	
	@Autowired
	private PostItRepository postItRepository;
	
	@Transactional
	@PostMapping("/post-it")
	public BodyBuilder aggiungiPostIt(@RequestBody PostIt post) {

		final String authUsername = SecurityContextHolder.getContext().getAuthentication().getName();

		post = postItRepository.save(post);
		
		System.out.println(post.toString());
		return ResponseEntity.ok();
	}
}
