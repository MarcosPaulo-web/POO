package org.example.atividadePoliformismo.escola;

public class Professor extends Pessoa {
    String disciplina;
    double salario;


    public Professor(String nome, int idade, String disciplina, double salario) {
        super(nome, idade);
        this.disciplina = disciplina;
        this.salario = salario;
    }

    void exibirDados(){
        System.out.printf("\n\nnome : %s" +
                "\nIdade : %d\n Disciplina : %s " +
                "\nSalario : %.2f",this.nome,this.idade,this.disciplina,this.salario);
    }
}
