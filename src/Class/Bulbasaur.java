package Class;

import Interface.IPlanta;

public class Bulbasaur extends Pokemon implements IPlanta{

    @Override
    protected void atqPlacaje() {
        System.out.println("Bulbasaur ha usado placaje");

    }

    @Override
    protected void atqAraniazo() {
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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'atqParalizar'");
    }
    
}
