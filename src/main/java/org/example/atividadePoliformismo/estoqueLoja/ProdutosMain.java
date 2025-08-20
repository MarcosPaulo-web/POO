package org.example.atividadePoliformismo.estoqueLoja;

public class ProdutosMain {
    public static void main(String[] args) {
        Produtos prod1 = new Produtos("Caneta",5.00,100);
        Produtos prod2 = new Produtos("Borracha",3.00,200);
        Produtos prod3 = new Produtos("Caderno Batman",25.00,50);

        prod1.setQuantidade(150);
        prod1.setPreco(4.50);

        System.out.printf("Valor total do(a) %s %.2f R$\n",prod1.getNome(),prod1.calcularValorTotal());
        System.out.printf("Valor total do(a) %s %.2f R$\n",prod2.getNome(),prod2.calcularValorTotal());
        System.out.printf("Valor total do(a) %s %.2f R$\n",prod3.getNome(),prod3.calcularValorTotal());
    }
}
