package entidades;

import entidades.ataque.Ataque;

public abstract class Raca {
    String nome;
    Integer vida;
    Integer forca;
    Integer magia;
    Integer agilidade;
    Integer inteligencia;
    Integer level = 1;
    Ataque[] ataques;

    public Raca(String nome, Integer vida, Integer forca, Integer magia, Integer agilidade,
            Integer inteligencia) {
        this.nome = nome;
        this.vida = vida;
        this.forca = forca;
        this.magia = magia;
        this.agilidade = agilidade;
        this.inteligencia = inteligencia;
        this.ataques = definirMagias();
    }

    public String getAtributosDoPersonagem() {
        return "Força: %d, Magia: %d, Agilidade: %d, Inteligencia: %d".formatted(forca, magia, agilidade, inteligencia);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getVida() {
        return vida;
    }

    public void receberDano(Integer dano) {
        this.vida = vida-dano;
    }

    public void receberCura(Integer cura) {
        this.vida = vida+cura;
    }

    public Integer getForca() {
        return forca;
    }

    public void setForca(Integer forca) {
        this.forca = forca;
    }

    public Integer getMagia() {
        return magia;
    }

    public void setMagia(Integer magia) {
        this.magia = magia;
    }

    public Integer getAgilidade() {
        return agilidade;
    }

    public void setAgilidade(Integer agilidade) {
        this.agilidade = agilidade;
    }

    public Integer getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(Integer inteligencia) {
        this.inteligencia = inteligencia;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Ataque[] getAtaques() {
        return this.ataques;
    }

    protected abstract Ataque[] definirMagias();

    protected abstract String nomeRaca();

    @Override
    public String toString() {
        return "Raca " + nomeRaca();
    }

    

}
