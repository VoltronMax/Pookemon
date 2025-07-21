package Logic;

import Class.Bulbasaur;
import Class.Charmander;
import Class.Pikachu;
import Class.Squirtle;

public class App {
    public static void main(String[] args){
        
        Squirtle squirtle = new Squirtle();
        Charmander charmander = new Charmander();
        Bulbasaur bulba = new Bulbasaur();
        Pikachu pikapika = new Pikachu();

        squirtle.atqAraniazo();
        squirtle.atqHidrobomba();

        charmander.atqAraniazo();
        charmander.atqLanzallamas();

        bulba.atqAraniazo();
        bulba.atqDrenaje();

        pikapika.atqAraniazo();
        pikapika.atqImpactrueno();
    }
}
