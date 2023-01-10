import Pokemons.FirePokemon;
import Pokemons.SuperPokemon;
import Pokemons.WaterPokemon;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        FirePokemon charmander = new FirePokemon("Charmander",15, "Fire", 30, 6, 40, "Wood");
        SuperPokemon pikachu = new SuperPokemon("Pikachu",20, "electric", 20, 5);
        WaterPokemon squirtle = new WaterPokemon("squirtle", 30, "water", 40, 5, true, 30);


        charmander.pound();
        pikachu.pound();
        charmander.eat();

        squirtle.pound();
        squirtle.pound();
        squirtle.rainDance();
        squirtle.pound();


//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print(" what is your name: ");
//        String input = scanner.nextLine();
//
//        System.out.println(input);


    }

}