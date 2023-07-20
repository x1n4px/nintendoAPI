package com.nintendo.nintentoAPI.Repository;

import com.nintendo.nintentoAPI.Entities.game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepository extends JpaRepository<game, Integer> {

}
