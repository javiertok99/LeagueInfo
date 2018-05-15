package com.example.a16022934.leagueinfo;
import android.content.res.TypedArray;

import java.io.Serializable;

public class Champions implements Serializable {
    private String name;
    private String secondName;
    private int championImage;
    private int[] skills;
    private String[] skillsDescription;
    private String role;
    private boolean isFav;

    public Champions(String name, String secondName, int championImage, int[] skills, String[] skillsDescription, String role, boolean isFav) {
        this.name = name;
        this.secondName = secondName;
        this.championImage = championImage;
        this.skills = skills;
        this.skillsDescription = skillsDescription;
        this.role = role;
        this.isFav = isFav;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getChampionImage() {
        return championImage;
    }

    public void setChampionImage(int championImage) {
        this.championImage = championImage;
    }

    public int[] getSkills() {
        return skills;
    }

    public void setSkills(int[] skills) {
        this.skills = skills;
    }

    public String[] getSkillsDescription() {
        return skillsDescription;
    }

    public void setSkillsDescription(String[] skillsDescription) {
        this.skillsDescription = skillsDescription;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public boolean isFav() { return isFav; }

    public void setFav(boolean fav) { isFav = fav; }
}
