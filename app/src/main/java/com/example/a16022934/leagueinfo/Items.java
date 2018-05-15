package com.example.a16022934.leagueinfo;

import java.io.Serializable;

public class Items implements Serializable{
    private String name;
    private int cost;
    private String[] stats;
    private String[] passiveAndActives;
    private int res;

    public Items(String name, int cost, String[] stats, String[] passiveAndActives, int res) {
        this.name = name;
        this.cost = cost;
        this.stats = stats;
        this.passiveAndActives = passiveAndActives;
        this.res = res;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String[] getStats() {
        return stats;
    }

    public void setStats(String[] stats) {
        this.stats = stats;
    }

    public String[] getPassiveAndActives() {
        return passiveAndActives;
    }

    public void setPassiveAndActives(String[] passiveAndActives) {
        this.passiveAndActives = passiveAndActives;
    }

    public int getRes() {
        return res;
    }

    public void setRes(int res) {
        this.res = res;
    }
}
