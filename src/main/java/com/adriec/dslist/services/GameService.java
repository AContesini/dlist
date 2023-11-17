package com.adriec.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.adriec.dslist.dto.GameDTO;
import com.adriec.dslist.dto.GameMinDTO;
import com.adriec.dslist.entities.Game;
import com.adriec.dslist.projections.GameMinProjection;
import com.adriec.dslist.repositories.GameRepository;

@Service	
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	@Transactional(readOnly = true)
	public GameDTO findById(Long id) {
		Game result = gameRepository.findById(id).get();
		return new GameDTO(result);
	}
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll(){
		 List<Game> result = gameRepository.findAll();
		 List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
		 
		 return dto;
		
	}
	@Transactional(readOnly = true)
	public List<GameMinDTO> findByList(Long listId){
		 List<GameMinProjection> result = gameRepository.searchByList(listId);
		 return result.stream().map(x -> new GameMinDTO(x)).toList();
		
	}
	

	
}
