package com.adriec.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adriec.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList ,Long> {

	
}
