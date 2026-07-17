package com.games.gamefeature.config;

import com.games.gamefeature.entity.Game;
import com.games.gamefeature.entity.GameStatus;
import com.games.gamefeature.repository.GameRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataSeeder implements CommandLineRunner {

    private final GameRepository gameRepository;

    public DataSeeder(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    @Override
    public void run(String... args) {

        if (gameRepository.count() == 0) {

            Game game1 = new Game();
            game1.setName("Book of Egypt");
            game1.setTheme("Ancient Egypt");
            game1.setVersion("1.0");
            game1.setRtp(96.30);
            game1.setGridWidth(5);
            game1.setGridHeight(3);
            game1.setStatus(GameStatus.DEVELOPMENT);

            Game game2 = new Game();
            game2.setName("Lucky Fruits");
            game2.setTheme("Classic");
            game2.setVersion("1.2");
            game2.setRtp(95.80);
            game2.setGridWidth(5);
            game2.setGridHeight(3);
            game2.setStatus(GameStatus.TESTING);

            Game game3 = new Game();
            game3.setName("Pirate Gold");
            game3.setTheme("Pirates");
            game3.setVersion("2.0");
            game3.setRtp(96.50);
            game3.setGridWidth(6);
            game3.setGridHeight(5);
            game3.setStatus(GameStatus.PRODUCTION);

            gameRepository.save(game1);
            gameRepository.save(game2);
            gameRepository.save(game3);

            System.out.println("Sample games inserted.");
        }
    }
}