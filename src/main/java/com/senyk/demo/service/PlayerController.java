package com.senyk.demo.service;

import com.senyk.demo.modle.Player;
import com.senyk.demo.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/player")
public class PlayerController {
    private final PlayerService playerService;

    @Autowired
    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @GetMapping
    public List<Player> getPlayers(){
        return playerService.getPlayers();
    }

    @PostMapping
    public void registerNewPlayer(@RequestBody Player player){
        playerService.addNewPlayer(player);
    }

    @DeleteMapping(path = "{playerID}")
    public void deletePlayer(@PathVariable("playerID")Long playerID){
        playerService.deletePlayer(playerID);
    }
    @PutMapping(path = "{playerID}")
    public void updatePlayer(
        @PathVariable("playerID") Long playerID,
        @RequestParam(required = false) String name,
        @RequestParam(required = false) String team
    ){
        playerService.updatePlayer(playerID,name,team);
    }
}
