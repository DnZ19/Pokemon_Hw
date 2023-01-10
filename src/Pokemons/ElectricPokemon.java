package Pokemons;

public class ElectricPokemon extends SuperPokemon {

    private boolean hasTail;
    private boolean hasEars;

    public ElectricPokemon(String name, int healthPoints, String type, int experience, int level, boolean hasTail, boolean hasEars) {
        super(name, healthPoints, type, experience, level);
        this.hasTail = hasTail;
        this.hasEars = hasEars;
    }

    public boolean isHasTail() {
        return hasTail;
    }

    public void setHasTail(boolean hasTail) {
        this.hasTail = hasTail;
    }

    public boolean isHasEars() {
        return hasEars;
    }

    public void setHasEars(boolean hasEars) {
        this.hasEars = hasEars;
    }

    @Override
    public void pound(){
        if (hasTail){
            System.out.println(super.getName() + " has a tail, tailwhip has been used instead.");
        } else {
            super.pound();
        }
    }

    public void voltTackle(){
        System.out.println(super.getName() + " used volttackle!");
    }





}
