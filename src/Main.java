import entidades.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Raca anaoPedro = new Anao("Pedro o grande", 100, 50, 20, 15, 30);
        Raca tioPaulo = new Humano("Tio Paulo", 100,5, 50, 5, 50);

        Lutador vencedor = Arena.combate(new AdaptadorRacaPersonagem(anaoPedro), new AdaptadorRacaPersonagem(tioPaulo));
        System.out.println("O vencedor é " + vencedor);
    }
}
