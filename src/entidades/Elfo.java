package entidades;

import entidades.ataque.AoEgo;
import entidades.ataque.Ataque;
import entidades.ataque.BolaDeFogo;
import entidades.ataque.Facada;
import entidades.ataque.Soco;

public class Elfo extends Raca{

    public Elfo(String nome, Integer vida, Integer forca, Integer magia, Integer agilidade, Integer inteligencia) {
        super(nome, vida, forca, magia, agilidade, inteligencia);
    }

    @Override
    protected Ataque[] definirMagias() {
        return new Ataque[]{
            new Flechada(),
            new Soco(getForca()),
            new BolaDeFogo(getMagia()),
            new Facada(getAgilidade()),
            new AoEgo(getInteligencia())
        };
    }

    public class Flechada extends Ataque{

        public Flechada() {
            super("Flechada");
        }

        @Override
        public Integer executarAtaque() {
            System.out.println("Ataque com arco e flecha!");
            return 5 + getAgilidade();
        }
    }

    @Override
    protected String nomeRaca() {
        return "Elfo";
    }

}
