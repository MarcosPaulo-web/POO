package org.example.heranca.ex8_15;

public class Cachorro extends Animal{

    @Override
    void emitirSom() {
        System.out.printf("%s falou au\n",this.nome);
    }
}
