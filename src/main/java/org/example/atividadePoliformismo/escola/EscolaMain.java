package org.example.atividadePoliformismo.escola;

public class EscolaMain {
    public static void main(String[] args){



        Aluno al1 = new Aluno("Marcos",20,"123123",10.0);
        Aluno al2 = new Aluno("Teste",30,"143212",8.0);
        Professor prof = new Professor("Matheus",28,"ADS",3000);

        al1.exibirDados();
        al2.exibirDados();
        prof.exibirDados();
    }
}
