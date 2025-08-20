package org.example.atividadePoliformismo.escola;

public class Aluno extends Pessoa {
    String matricula;
    double nota;

    public Aluno(String nome,int idade,String matricula, double nota) {
        super(nome,idade);
        this.matricula = matricula;
        this.nota = nota;
    }




    void exibirDados(){
             System.out.printf("\n\nNome : %s" +
                     "\nIdade : %d\n Matricula : %s " +
                     "\nNota : %.2f",this.nome,this.idade,this.matricula,this.nota);
         }
}
