package com.senyk.demo.modle;

public enum Team {
    teamA(10.0),
    teamB(2.0),
    teamC(1.0),
    teamD(5.3),
    teamE(9.1),
    teamF(1.2),
    teamG(7.0),
    teamH(6.3),
    teamI(0.0),
    teamJ(3.5);

    private Double commission;

    Team(Double commission) {
        this.commission = commission;
    }

    public Double getCommission() {
        return commission;
    }

    public void setCommission(Double commission) {
        this.commission = commission;
    }

}
