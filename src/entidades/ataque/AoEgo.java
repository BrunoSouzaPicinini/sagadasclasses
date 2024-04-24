package entidades.ataque;

public class AoEgo extends Ataque{
    Integer modificadorDeDano;

    public AoEgo( Integer modificadorDeDano) {
        super("Ao ego");
        this.modificadorDeDano = modificadorDeDano;
    }

    @Override
    public Integer executarAtaque() {
        System.out.println("Ataque ao ego!");
        return 3 + modificadorDeDano;
    }

}
