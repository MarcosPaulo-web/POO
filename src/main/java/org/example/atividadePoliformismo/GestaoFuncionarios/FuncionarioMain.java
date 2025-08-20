package org.example.atividadePoliformismo.GestaoFuncionarios;

public class FuncionarioMain {
    public static void main(String[] args){
        Funcionario funcionario = new Funcionario("Judai","Administrador",1000.00);
        Funcionario funcionario2 = new Funcionario("Anakim","Policial",3000.00);

        funcionario.exibirDados();
        funcionario2.exibirDados();

        funcionario.aumentarSalario(10);
        funcionario2.aumentarSalario(10);

        funcionario.exibirDados();
        funcionario2.exibirDados();
    }
}
