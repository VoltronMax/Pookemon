package Class;

import Interface.IAgua;

public class Squirtle extends Pokemon implements IAgua{

    public Squirtle(){}

    @Override
    protected void atqPlacaje() {
        System.out.println("Squirtle ha usado placaje con su caparazon");
    }

    @Override
    public void atqAraniazo() {
        System.out.println("Squirtle se abalanza con un arañazo");
    }

    @Override
    protected void atqMordisco() {
        System.out.println("Squirtle muerde con la fuerza de una prensa hidraulica");
    }

    @Override
    public void atqHidrobomba() {
        System.out.println("Squirtle lanza Hidrobomba");
    }

    @Override
    public void atqBurbuja() {
        System.out.println("Squirtle usa Ataque burbuja");
    }

    @Override
    public void atqPistolaAgua() {
        System.out.println("Squirtle apunta y usa Pistola agua");
    }
    
}
