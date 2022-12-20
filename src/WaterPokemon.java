public abstract class WaterPokemon extends SuperPokemon {

    private String defence;
    private String attack;
    String special;
    String accuracy;


    public WaterPokemon(String type, int height, int weight, String food, String sound, String special, String accuracy){
        super(type, height, weight, food, sound );

        this.special = special;
        this.accuracy = accuracy;

    }

    public String getDefence() {
        return defence;
    }

    public void setDefence(String defence) {
        this.defence = defence;
    }

    public String getAttack() {
        return attack;
    }

    public void setAttack(String attack) {
        this.attack = attack;
    }

}
