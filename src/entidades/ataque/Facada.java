package entidades.ataque;

public class Facada extends Ataque{
    Integer modificadorDeDano;

    public Facada( Integer modificadorDeDano) {
        super("Facada");
        this.modificadorDeDano = modificadorDeDano;
    }

    @Override
    public Integer executarAtaque() {
        System.out.println("Facada!");
        return 4 + modificadorDeDano;
    }

}
