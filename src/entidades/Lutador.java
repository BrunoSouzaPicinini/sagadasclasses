package entidades;

public interface Lutador {    
    Integer atacar();
    void receberDano(Integer dano);
    Boolean estaVivo();
    String nome();
}
