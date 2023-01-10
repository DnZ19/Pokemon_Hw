package Pokemons;

public class GrassPokemon extends SuperPokemon {

    private int amountOfLeaves;
    private int amountOfLegs;

    public GrassPokemon(String name, int healthPoints, String type, int experience, int level, int amountOfLeaves, int amountOfLegs) {
        super(name, healthPoints, type, experience, level);
        this.amountOfLeaves = amountOfLeaves;
        this.amountOfLegs = amountOfLegs;
    }

    public int getAmountOfLeaves() {
        return amountOfLeaves;
    }

    public void setAmountOfLeaves(int amountOfLeaves) {
        this.amountOfLeaves = amountOfLeaves;
    }

    public int getAmountOfLegs() {
        return amountOfLegs;
    }

    public void setAmountOfLegs(int amountOfLegs) {
        this.amountOfLegs = amountOfLegs;
    }

    @Override
    public void pound(){
        System.out.println(super.getName() + " doesn't know pound, try waterbeam!");
    }

    public void waterbeam(){
        System.out.println(super.getName() + " used waterbeam!");
    }


}
