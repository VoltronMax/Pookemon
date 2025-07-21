package Class;

import Interface.IFuego;

public class Charmander extends Pokemon implements IFuego{

    public Charmander(){}

    @Override
    protected void atqPlacaje() {
        System.out.println("Charmander ha utilizado placaje");
    }

    @Override
    public void atqAraniazo() {
        System.out.println("Charmander ataca con arañazo");
    }

    @Override
    protected void atqMordisco() {
        System.out.println("Charmander da un fuerte mordisco");
    }

    @Override
    public void atqPunioFuego() {
        System.out.println("Charmander prepara su brazo y lanza un Puño fuego");
    }

    @Override
    public void atqLanzallamas() {
        System.out.println("Charmander uso Lanzallamas");
    }

    @Override
    public void atqAscuas() {
        System.out.println("Una rafaga de fuego se hace presente. Charmander uso Ascuas");
    }
    
}
