package com.devquixabeira.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devquixabeira.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
