package org.example.atividadePoliformismo.cadastroVeiculo;

public class Veiculo {
    String marca;
    int ano;

    public Veiculo(int ano, String marca) {
        this.ano = ano;
        this.marca = marca;
    }

    void exibirInformacoes(){
        System.out.printf("o veiculo da marca %s do ano %d ",this.marca,this.ano);
    }
}
