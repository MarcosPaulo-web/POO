package org.example.atividadePoliformismo.cadastroVeiculo;

public class Moto extends Veiculo{
    int cilindradas;

    Moto(int ano,String marca,int cilindradas){
        super(ano, marca);
        this.cilindradas = cilindradas;
    }

    void exibirInformacoes(){
        System.out.printf("A moto da marca %s do ano %d tem %s cilindradas\n",this.marca,this.ano,this.cilindradas);
    }
}
