package com.senyk.demo.modle;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;

@Entity
@Table
public class Player {
    @Id
    @SequenceGenerator(
            name = "player_sequence",
            sequenceName = "player_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "player_sequence"
    )
    private Long id;
    private String name;
    private LocalDate dob;
    private LocalDate dos;
    @Transient
    private Integer age;
    @Transient
    private Integer experience;
    private String team;
    private Double commission;
    public Player() {
    }

    public Player(Long id,
                  String name,
                  LocalDate dob,
                  LocalDate dos,
                  String team) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.dos = dos;
        this.team=team;
        this.commission= Team.valueOf(team).getCommission();
    }

    public Player(String name,
                  LocalDate dob,
                  LocalDate dos,
                  String team) {
        this.name = name;
        this.dob = dob;
        this.dos = dos;
        this.team=team;
        this.commission=Team.valueOf(team).getCommission();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public LocalDate getDos() {
        return dos;
    }

    public void setDos(LocalDate dos) {
        this.dos = dos;
    }

    public Integer getAge() {
        return Period.between(this.dob,LocalDate.now()).getYears();
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getExperience() {
        return Period.between(this.dos,LocalDate.now()).getMonths();
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
        this.commission=Team.valueOf(team).getCommission();

    }

    public Double getCommission() {
        return commission;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dob=" + dob +
                ", dos=" + dos +
                ", age=" + age +
                ", experience=" + experience +
                ", team='" + team + '\'' +
                '}';
    }
}
