package Pokemons;

public class WaterPokemon extends SuperPokemon {

    private boolean hasWaterCanon;
    private int volumeOfWater;

    public WaterPokemon(String name, int healthPoints, String type, int experience, int level, boolean hasWaterCanon, int volumeOfWater) {
        super(name, healthPoints, type, experience, level);
        this.hasWaterCanon = hasWaterCanon;
        this.volumeOfWater = volumeOfWater;
    }

    public boolean isHasWaterCanon() {
        return hasWaterCanon;
    }

    public void setHasWaterCanon(boolean hasWaterCanon) {
        this.hasWaterCanon = hasWaterCanon;
    }

    public int getVolumeOfWater() {
        return volumeOfWater;
    }

    public void setVolumeOfWater(int volumeOfWater) {
        this.volumeOfWater = volumeOfWater;
    }

    @Override
    public void pound(){
        if (volumeOfWater <= 30){
            System.out.println(super.getName() + " doesn't know pound, but used surf");
            this.volumeOfWater = volumeOfWater - 20;
        } else {
            super.pound();
        }
    }

    public void rainDance(){
        System.out.println(super.getName() + " used raindance, and gained 20 water druplets");
        this.volumeOfWater = volumeOfWater + 20;
    }


}
