package org.example.heranca.ex8_15;

public class AnimalMain {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        cachorro.nome = "cachossa";
        cachorro.emitirSom();

        Gato gato = new Gato();
        gato.nome = "Catstro";
        gato.emitirSom();
    }
}
