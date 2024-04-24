

import java.util.Random;

import entidades.Lutador;
import entidades.Raca;

public class Personagem implements Lutador {

    Raca raca;
    public Personagem(Raca raca) {
        this.raca = raca;
    }
    
    @Override
    public Integer atacar() {
        var random = new Random();
        return raca.getAtaques()[random.nextInt(raca.getAtaques().length-1)].executarAtaque();
    }
    @Override
    public void receberDano(Integer dano) {
        raca.receberDano(dano);
    }

    @Override
    public Boolean estaVivo() {
       return raca.getVida() > 0;
    }

    @Override
    public String nome() {
        return raca.getNome();
    }

    @Override
    public String toString() {
        return "Personagem " + nome() + " " + raca;
    }

    
    
}
