package entidades;

import entidades.ataque.AoEgo;
import entidades.ataque.Ataque;
import entidades.ataque.BolaDeFogo;
import entidades.ataque.Facada;
import entidades.ataque.Soco;

public class Humano extends Raca {

    public Humano(String nome, Integer vida, Integer forca, Integer magia, Integer agilidade, Integer inteligencia) {
        super(nome, vida, forca, magia, agilidade, inteligencia);
    }

    @Override
    protected Ataque[] definirMagias() {
        return new Ataque[] {
            new Malicia(),
            new Soco(getForca()),
            new BolaDeFogo(getMagia()),
            new Facada(getAgilidade()),
            new AoEgo(getInteligencia())
        };
    }

    public class Malicia extends Ataque{

        public Malicia() {
            super("Malícia");
        }

        @Override
        public Integer executarAtaque() {
            System.out.println("Ataque Malícia!");
            return 5 + getInteligencia();
        }
    }

    @Override
    protected String nomeRaca() {
        return "Humano";
    }

}
