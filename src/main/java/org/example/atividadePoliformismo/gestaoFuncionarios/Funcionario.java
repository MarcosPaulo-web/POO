package org.example.atividadePoliformismo.gestaoFuncionarios;

public class Funcionario {

    private String nome;
    private String cargo;
    private double salario;

    Funcionario(String nome, String cargo, double salario) {
        if (salario >= 0) {
            this.salario = salario;
        } else {
            System.err.println("O salario está menor que 0");
            return;
        }
        this.nome = nome;
        this.cargo = cargo;
    }

    void aumentarSalario(double percentual) {

        this.salario *= (1 + (percentual / 100));
    }

    void exibirDados() {
        System.out.printf("\n\nNome = %s \ncargo = %s \n Salario = %.2f",this.nome,this.cargo,this.salario);
    }


}
