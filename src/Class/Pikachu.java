package Class;

public class Pikachu extends Pokemon{

    @Override
    protected void atqPlacaje() {
        System.out.println("Pikachu ataca de frente con placaje");
    }

    @Override
    protected void atqAraniazo() {
        System.out.println("Pikachu usa su cola provocando arañazo");
    }

    @Override
    protected void atqMordisco() {
        System.out.println("Pikachu te muerde electrizantemente");
    }
    
}
