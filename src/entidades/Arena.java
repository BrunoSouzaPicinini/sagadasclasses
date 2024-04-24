package entidades;

import java.util.Random;

public class Arena {

    public static Lutador combate(Lutador lutadorA, Lutador lutadorB) {
        var random = new Random();
        Lutador lutadorComPrimeiroAtaque;
        Lutador lutadorComSegundoAtaque;
        if (random.nextInt() % 2 == 0) {
            lutadorComPrimeiroAtaque = lutadorA;
            lutadorComSegundoAtaque = lutadorB;
        } else {
            lutadorComPrimeiroAtaque = lutadorB;
            lutadorComSegundoAtaque = lutadorA;
        }

        while (lutadorA.estaVivo() && lutadorB.estaVivo()) {
            System.out.println("Lutador %s ataca %s!".formatted(lutadorComPrimeiroAtaque.nome(), lutadorComSegundoAtaque.nome()));
            lutadorComSegundoAtaque.receberDano(lutadorComPrimeiroAtaque.atacar());
            System.out.println("Lutador %s ataca %s!".formatted(lutadorComSegundoAtaque.nome(), lutadorComPrimeiroAtaque.nome()));
            lutadorComPrimeiroAtaque.receberDano(lutadorComSegundoAtaque.atacar());
        }

        return quemVenceu(lutadorA, lutadorB);
    }

    private static Lutador quemVenceu(Lutador lutadorA, Lutador lutadorB) {
        return lutadorA.estaVivo() ? lutadorA : lutadorB;
    }
}
