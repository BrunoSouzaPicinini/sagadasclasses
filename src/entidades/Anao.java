package entidades;

import entidades.ataque.AoEgo;
import entidades.ataque.Ataque;
import entidades.ataque.BolaDeFogo;
import entidades.ataque.Facada;
import entidades.ataque.Soco;

public class Anao extends Raca {

    public Anao(String nome,
            Integer vida,
            Integer forca,
            Integer magia,
            Integer agilidade,
            Integer inteligencia) {
        super(nome, vida, forca, magia, agilidade, inteligencia);
    }

    @Override
    protected Ataque[] definirMagias() {
        return new Ataque[] {
            new ChuteNaCanela(),
            new Soco(getForca()),
            new BolaDeFogo(getMagia()),
            new Facada(getAgilidade()),
            new AoEgo(getInteligencia())
        };
    }

    public class ChuteNaCanela extends Ataque{

        public ChuteNaCanela() {
            super("Chute na canela");
        }

        @Override
        public Integer executarAtaque() {
            System.out.println("Ataque chute na canela!");
            return 5 + getForca();
        }
    }

    @Override
    protected String nomeRaca() {
        return "Anão";
    }

    

}
