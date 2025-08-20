package org.example.atividadePoliformismo.cadastroVeiculo;

public class Carro extends Veiculo{
    int portas;

    Carro(int ano,String marca,int porta){
        super(ano,marca);
        this.portas = porta;

    }
    void exibirInformacoes(){
        System.out.printf("O carro da marca %s do ano %d tem %s portas\n",this.marca,this.ano,this.portas);
    }
}
