package org.example.atividadePoliformismo.banco;

public class ContaBancaria {
    private String numeroConta;
    private double saldo;


    void depositar(double valor) {
        if (valor >= 0) {
            this.saldo += valor;
        } else {
            System.out.printf("O valor %.2f R$ é invalido\n", valor);
        }
    }

    void sacar(double valor) {
        if (this.saldo > valor) {
            this.saldo -= valor;
        } else {
            System.out.printf("O valor %.2f R$ é invalido, o saque não foi concluido\n",valor);
        }
    }

    double getSaldo() {
        return this.saldo;
    }

}
