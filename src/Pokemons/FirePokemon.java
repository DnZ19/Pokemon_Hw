package Pokemons;

public class FirePokemon extends SuperPokemon {

    private double temperature;
    private String food;

    public FirePokemon(){};

    public FirePokemon(String name, int healthPoints, String type, int experience, int level, double temperature, String food) {
        super(name, healthPoints, type, experience, level);
        this.temperature = temperature;
        this.food = food;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    @Override
    public void pound(){
        System.out.println(super.getName() + " doesn't know pound. Try flamethrower!");
    }

    public void flameThrower(){
        System.out.println(super.getName() + " does flamethrower!");
    }

    @Override
    public void eat(){
        System.out.println(super.getName() + " eats " + food);
    }



}
