package org.example.atividadePoliformismo.estoqueLoja;

public class Produtos {
    private String nome;
    private double preco;
    private int quantidade;

   public Produtos(String nome, double preco,int quantidade){
       this.nome = nome;
       this.preco = preco;
       this.quantidade = quantidade;
   }

    String getNome(){
        return this.nome;
    }

    double getPreco(){
        return this.preco;
    }

    int getQuantidade(){
        return this.quantidade;
    }

    void setPreco(double valor){
        this.preco = valor;
    }

    void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }

    double calcularValorTotal(){
        return this.preco*this.quantidade;
    }
}
