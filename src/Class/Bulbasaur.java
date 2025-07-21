package Class;

import Interface.IPlanta;

public class Bulbasaur extends Pokemon implements IPlanta{

    public Bulbasaur(){}

    @Override
    protected void atqPlacaje() {
        System.out.println("Bulbasaur ha usado placaje");

    }

    @Override
    public void atqAraniazo() {
        System.out.println("Bulbasaur ha utilizado arañazo");

    }

    @Override
    protected void atqMordisco() {
        System.out.println("Bulbasaur ha pegado un mordisco");

    }

    @Override
    public void atqDrenaje() {
        System.out.println("Bulbasaur usa sus lianas y aplica Drenaje");
    }

    @Override
    public void atqParalizar() {
        System.out.println("Bulbasaur te paraliza con sus plantas");
    }
    
}
