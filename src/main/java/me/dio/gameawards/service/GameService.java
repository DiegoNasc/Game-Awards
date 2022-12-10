package me.dio.gameawards.service;

import me.dio.gameawards.domain.model.Game;

import java.util.List;

public interface GameService {

    List<Game> findAll(); //Retorna uma lista de games
    Game findById(Long id); //Buscar por id, e retorna um jogo
    void insert(Game game); //Inserir um jogo
    void update(Long id, Game game); //Atualizar um jogo passando o id
    void delete(Long id); //Deletar um jogo passando o id
}
