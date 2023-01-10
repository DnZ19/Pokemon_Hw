package Pokemons;

import java.util.Scanner;

public class SuperPokemon {

   private int healthPoints;
   private String type;
   private int experience;
   private int level;

   private String name;

   public SuperPokemon(){};


    public SuperPokemon(String name, int healthPoints, String type, int experience, int level) {
        this.healthPoints = healthPoints;
        this.type = type;
        this.experience = experience;
        this.level = level;
        this.name = name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void pound(){
        System.out.println("Pokemon does pound!");
    }

    public void scratch(){
        System.out.println("Pokemon does scratch!");
    }

    public void eat() {
    }
}
