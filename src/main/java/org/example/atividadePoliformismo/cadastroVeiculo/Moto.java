package org.example.atividadePoliformismo.cadastroVeiculo;

public class Moto extends Veiculo{
    int cilindradas;

    void exibirInformacoes(){
        System.out.printf("A moto da marca %s do ano %d tem %s cilindradas",this.marca,this.ano,this.cilindradas);
    }
}
