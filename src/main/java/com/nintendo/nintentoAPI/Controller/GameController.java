package com.nintendo.nintentoAPI.Controller;

import com.nintendo.nintentoAPI.Entities.game;
import com.nintendo.nintentoAPI.Repository.GameRepository;
import com.nintendo.nintentoAPI.Service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

 import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping("/games")
public class GameController {
    @Autowired
    private GameService gameService;
    @Autowired
    private GameRepository gameRepository;


    @GetMapping
    public List<game> getAllGames() {
        return gameRepository.findAll();
    }


   @GetMapping("/{id}")
   public Optional<game> getAGame(@PathVariable Integer id) {
        return gameRepository.findById(id);
   }

    @PostMapping
    public game addNewGame(@RequestBody game newGame) {
       return gameRepository.save(newGame);
    }
}
