package com.devquixabeira.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devquixabeira.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
