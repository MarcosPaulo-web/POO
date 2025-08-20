package org.example.atividadePoliformismo.cadastroVeiculo;

public class VeiculoMain {
    public static void main(String[] args) {

        Carro car = new Carro();
                car.marca = "Toyota";
                car.ano = 1994;
                car.portas = 2;

                Moto bike = new Moto();
                bike.marca = "Kawazaki";
                bike.ano = 2015;
                bike.cilindradas = 750;

                car.exibirInformacoes();
                bike.exibirInformacoes();

    }
}
