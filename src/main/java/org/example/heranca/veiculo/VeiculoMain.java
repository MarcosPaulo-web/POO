package org.example.heranca.veiculo;

public class VeiculoMain {

    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.marca = "Toyota";
        carro.modelo= "Supra";
        carro.ano = 1994;
        carro.portas = 2;

        carro.acelerar();

        carro.abrirPortaMala();

        Moto moto = new Moto();

        moto.marca = "Kawazaki";
        moto.modelo = "Ninja";
        moto.ano = 2015;

        moto.empinar();

    }
}
