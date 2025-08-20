package org.example.atividadePoliformismo.banco;

public class ContaBancariaMain {
    public static void main(String[] args){
        ContaBancaria contaBancaria = new ContaBancaria();

        contaBancaria.depositar(1000);
        contaBancaria.sacar(1500);
        contaBancaria.sacar(200);
        System.out.println("Saldo atual : "+contaBancaria.getSaldo());
    }
}
