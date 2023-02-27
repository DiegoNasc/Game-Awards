package me.dio.gameawards.service.impl;

import me.dio.gameawards.domain.model.Game;
import me.dio.gameawards.domain.model.GameRepository;
import me.dio.gameawards.service.GameService;
import me.dio.gameawards.service.exception.BusinessException;
import me.dio.gameawards.service.exception.NoContentException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class GameServiceImpl implements GameService {

    @Autowired
    private GameRepository repository;

    @Override
    public List<Game> findAll() {
        List<Game> games = repository.findAll(); // repository.findAll() retorna uma lista de jogos
        return games;
    }

    @Override
    public Game findById(Long id) {
        Optional<Game> game = repository.findById(id); //Optional "talvez retorne um jogo"
        return game.orElseThrow(NoContentException::new);

        /*if (game.isPresent()) {
            return game.get();
        } else {
            throw new NoContentException();
        }*/
    }

    @Override
    public void insert(Game game) {
        if (Objects.nonNull(game.getId())) {
            throw new BusinessException("O ID do jogo ja existe no banco");
        }
        repository.save(game);
    }

    @Override
    public void update(Long id, Game game) {
        Game gameDb = findById(id);
        if (gameDb.getId().equals(game.getId())) {
            repository.save(game);
        } else {
            throw new BusinessException("Os IDs para alteração são divergentes");
        }
    }

    @Override
    public void delete(Long id) {
        Game gameDb = findById(id);
        repository.delete(gameDb);
    }
}
