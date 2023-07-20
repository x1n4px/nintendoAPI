package com.nintendo.nintentoAPI.Service;

import com.nintendo.nintentoAPI.Repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;
}
