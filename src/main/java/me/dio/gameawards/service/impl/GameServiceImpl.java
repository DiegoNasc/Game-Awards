package me.dio.gameawards.service.impl;

import me.dio.gameawards.domain.model.Game;
import me.dio.gameawards.domain.model.GameRepository;
import me.dio.gameawards.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameServiceImpl implements GameService {

    @Autowired
    private GameRepository repository;

    @Override
    public List<Game> findAll() {
        List<Game> games = repository.findAll();
        return games;
    }

    @Override
    public Game findById(Long id) {
        return null;
    }

    @Override
    public void insert(Game game) {

    }

    @Override
    public void update(Long id, Game game) {

    }

    @Override
    public void delete(Long id) {

    }
}
