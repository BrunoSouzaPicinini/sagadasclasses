package entidades.ataque;

public abstract class Ataque {
    String nome;

    public Ataque(String nome) {
        this.nome = nome;
    }

    public abstract Integer executarAtaque();
}
