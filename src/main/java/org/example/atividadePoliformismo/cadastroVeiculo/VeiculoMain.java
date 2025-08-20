package org.example.atividadePoliformismo.cadastroVeiculo;

public class VeiculoMain {
    public static void main(String[] args) {

        Carro car = new Carro(1994, "Toyota", 2);
        Moto bike = new Moto(2015, "Kawazaki", 750);

        car.exibirInformacoes();
        bike.exibirInformacoes();

    }
}
