package com.senyk.demo.config;

import com.senyk.demo.modle.Player;
import com.senyk.demo.dao.PlayerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class PlayerConfig {
    @Bean
    CommandLineRunner commandLineRunner(PlayerRepository repository){
        return args ->  {
            Player p1= new Player(

                    "name 1",
                    LocalDate.of(2000,01,01),
                    LocalDate.of(2019,03,24),
                    "teamA"
            );
            Player p2= new Player(

                    "name 2",
                    LocalDate.of(2000,01,01),
                    LocalDate.of(2019,03,24),
                    "teamA"
            );
            Player p3= new Player(

                    "name 3",
                    LocalDate.of(2000,01,01),
                    LocalDate.of(2019,03,24),
                    "teamH"
            );
            Player p4= new Player(

                    "name 4",
                    LocalDate.of(2000,01,01),
                    LocalDate.of(2019,03,24),
                    "teamH"
            );
            Player p5= new Player(

                    "name 5",
                    LocalDate.of(2000,01,01),
                    LocalDate.of(2019,03,24),
                    "teamH"
            );
            Player p6= new Player(

                    "name 6",
                    LocalDate.of(2000,01,01),
                    LocalDate.of(2019,03,24),
                    "teamH"
            );
            Player p7= new Player(

                    "name 7",
                    LocalDate.of(2000,01,01),
                    LocalDate.of(2019,03,24),
                    "teamH"
            );
            Player p8= new Player(

                    "name 8",
                    LocalDate.of(2000,01,01),
                    LocalDate.of(2019,03,24),
                    "teamH"
            );
            Player p9= new Player(

                    "name 9",
                    LocalDate.of(2000,01,01),
                    LocalDate.of(2019,03,24),
                    "teamA"
            );
            Player p10= new Player(

                    "name 10",
                    LocalDate.of(2000,01,01),
                    LocalDate.of(2019,03,24),
                    "teamA"
            );
            Player p11= new Player(

                    "name 11",
                    LocalDate.of(2000,01,01),
                    LocalDate.of(2019,03,24),
                    "teamA"
            );
            Player p12= new Player(

                    "name 12",
                    LocalDate.of(2000,01,01),
                    LocalDate.of(2019,03,24),
                    "teamG"
            );
            Player p13= new Player(

                    "name 13",
                    LocalDate.of(2000,01,01),
                    LocalDate.of(2019,03,24),
                    "teamG"
            );
            Player p14= new Player(

                    "name 14",
                    LocalDate.of(2000,01,01),
                    LocalDate.of(2019,03,24),
                    "teamA"
            );
            Player p15= new Player(

                    "name 15",
                    LocalDate.of(2000,01,01),
                    LocalDate.of(2019,03,24),
                    "teamA"
            );
            Player p16= new Player(

                    "name 16",
                    LocalDate.of(2000,01,01),
                    LocalDate.of(2019,03,24),
                    "teamA"
            );
            Player p17= new Player(

                    "name 17",
                    LocalDate.of(2000,01,01),
                    LocalDate.of(2019,03,24),
                    "teamC"
            );
            Player p18= new Player(

                    "name 18",
                    LocalDate.of(2000,01,01),
                    LocalDate.of(2019,03,24),
                    "teamC"
            );
            Player p19= new Player(

                    "name 19",
                    LocalDate.of(2000,01,01),
                    LocalDate.of(2019,03,24),
                    "teamC"
            );
            Player p20= new Player(

                    "name 20",
                    LocalDate.of(2000,01,01),
                    LocalDate.of(2019,03,24),
                    "teamB"
            );
            Player p21= new Player(

                    "name 21",
                    LocalDate.of(2000,01,01),
                    LocalDate.of(2019,03,24),
                    "teamB"
            );
            repository.saveAll(
                    List.of(p1,p2,p3,p4,p5,p6,p7,p8,p9,
                            p10,p11,p12,p13,p14,p15,p16,p17,p18,p19,
                            p20,p21)
            );
        };
    }
}
