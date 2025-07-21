package Class;

import Interface.IElectrico;

public class Pikachu extends Pokemon implements IElectrico{

    public Pikachu(){}

    @Override
    protected void atqPlacaje() {
        System.out.println("Pikachu ataca de frente con placaje");
    }

    @Override
    public void atqAraniazo() {
        System.out.println("Pikachu usa su cola provocando arañazo");
    }

    @Override
    protected void atqMordisco() {
        System.out.println("Pikachu te muerde electrizantemente");
    }

    @Override
    public void atqImpactrueno() {
        System.out.println("Pikachu agita su cola y lanza un Impactrueno");
    }

    @Override
    public void atqPunioTrueno() {
        System.out.println("Pikachu se lanza y prepara un Puño trueno");
    }
    
}
