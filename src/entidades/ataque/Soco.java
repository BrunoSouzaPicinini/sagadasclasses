package entidades.ataque;

public class Soco extends Ataque {    
    Integer modificadorDeDano;

    public Soco(Integer modificadorDeDano) {
        super("Soco");
        this.modificadorDeDano = modificadorDeDano;
    }

    @Override
    public Integer executarAtaque() {
        System.out.println("Soco!");
        return 2 + modificadorDeDano;
    }

}
