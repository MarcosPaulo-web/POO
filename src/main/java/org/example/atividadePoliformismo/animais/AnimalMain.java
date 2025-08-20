package org.example.atividadePoliformismo.animais;

public class AnimalMain {
    public static void main(String[] args){
        Cachorro cahorro = new Cachorro();
        cahorro.nome = "Mutley";
        cahorro.idade = 10;

        Gato gato = new Gato();
        gato.nome = "Frajola";
        gato.idade = 14;

        cahorro.exibirIformacoes();
        gato.exibirIformacoes();
    }
}
