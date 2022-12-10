package me.dio.gameawards.domain.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepository extends JpaRepository<Game, Long> { //<Game(Entidade), Long(tipo do id dele)>

}
