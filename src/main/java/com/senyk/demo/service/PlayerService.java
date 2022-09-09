package com.senyk.demo.service;

import com.senyk.demo.modle.Player;
import com.senyk.demo.dao.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class PlayerService {
    private final PlayerRepository playerRepository;
    @Autowired
    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public List<Player> getPlayers(){
        return playerRepository.findAll();
    }

    public void addNewPlayer(Player player) {
        Optional<Player>optionalPlayer= playerRepository.findPlayerByName(player.getName());
        if (optionalPlayer.isPresent()){
            throw new IllegalStateException("name taken");
        }
        playerRepository.save(player);
    }

    public void deletePlayer(Long playerID) {
        boolean exists= playerRepository.existsById(playerID);
        if (!exists){
            throw new IllegalStateException("player with id "+playerID+" does not exists");
        }
        playerRepository.deleteById(playerID);
    }
    @Transactional
    public void updatePlayer(Long playerID,String name, String newTeam) {
        Player player=playerRepository.findById(playerID).orElseThrow(
                ()->new IllegalStateException("player with id "+playerID+" does not exists"));
        if(newTeam!=null &&newTeam.length()>0&&!Objects.equals(player.getTeam(),newTeam)){
            Optional<Player> optionalPlayer=playerRepository.findPlayerByName(name);
            player.setTeam(newTeam);
            Double transit=transit(player.getExperience(),player.getAge());
            Double commission=commission(transit,player.getCommission());
            Double sum=sum(transit,commission);

            System.out.println("transit="+transit);
            System.out.println("commission="+commission);
            System.out.println("sum="+sum);
        }else throw new IllegalStateException("team "+newTeam+" does not exists");


    }
    public Double transit(Integer experience,Integer age){
        return experience*100000.0/age;
    }
    public Double commission(Double transit,Double commission){
        return transit*commission/100.0;
    }
    public Double sum(Double transit,Double commission){
        return transit+commission;
    }
}
