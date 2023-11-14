package com.adriec.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adriec.dslist.dto.GameMinDTO;
import com.adriec.dslist.entities.Game;
import com.adriec.dslist.repositories.GameRepository;

@Service	
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	public List<GameMinDTO> findAll(){
		 List<Game> result = gameRepository.findAll();
		 List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
		 
		 return dto;
		
	}
}
