package entidades.ataque;

public class BolaDeFogo extends Ataque{
    Integer modificadorDeDano;

    public BolaDeFogo( Integer modificadorDeDano) {
        super("Bola de Fogo");
        this.modificadorDeDano = modificadorDeDano;
    }

    @Override
    public Integer executarAtaque() {
        System.out.println("Ataque Bola de Fogo!");
        return 3 + modificadorDeDano;
    }

}
