package com.senyk.demo.dao;

import com.senyk.demo.modle.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PlayerRepository
        extends JpaRepository<Player,Long> {
    @Query("SELECT s FROM Player s WHERE s.name=?1")
    Optional<Player> findPlayerByName(String name);

}
