package com.games.gamefeature.service;

import com.games.gamefeature.entity.Game;
import com.games.gamefeature.repository.GameRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    private final GameRepository gameRepository;

    public GameService(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    public List<Game> getAllGames() {
        return gameRepository.findAll();
    }

    public Game getGameById(Long id) {
        return gameRepository.findById(id).orElse(null);
    }

    public Game createGame(Game game) {
        return gameRepository.save(game);
    }

    public Game updateGame(Long id, Game updatedGame) {

        Game game = gameRepository.findById(id).orElse(null);

        if (game == null) {
            return null;
        }

        game.setName(updatedGame.getName());
        game.setTheme(updatedGame.getTheme());
        game.setVersion(updatedGame.getVersion());
        game.setRtp(updatedGame.getRtp());
        game.setGridWidth(updatedGame.getGridWidth());
        game.setGridHeight(updatedGame.getGridHeight());
        game.setStatus(updatedGame.getStatus());

        return gameRepository.save(game);
    }

    public void deleteGame(Long id) {
        gameRepository.deleteById(id);
    }

}