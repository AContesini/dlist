package com.adriec.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adriec.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game ,Long> {

	
}
