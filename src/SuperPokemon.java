public abstract class SuperPokemon {

    private String name;
    private String level;
    private int healthPoints;
    private int experiencePoints;
    int height;
    int weight;
    String food;
    String sound;
    String type;

    //constructor
    public SuperPokemon(String type, int height, int weight, String food, String sound){

        this.type = type;
        this.height = height;
        this.weight = weight;
        this.food = food;
        this.sound = sound;
    }

    //getters & setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getExperiencePoints() {
        return experiencePoints;
    }

    public void setExperiencePoints(int experiencePoints) {
        this.experiencePoints = experiencePoints;
    }

    //abstract methods
    public abstract void eats();
    public abstract void speaks();


}
