package org.example.atividadePoliformismo.cadastroVeiculo;

public class Carro extends Veiculo{
    int portas;




    void exibirInformacoes(){
        System.out.printf("O carro da marca %s do ano %d tem %s portas",this.marca,this.ano,this.portas);
    }
}
