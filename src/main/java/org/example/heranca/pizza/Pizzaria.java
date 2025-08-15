package org.example.heranca.pizza;

public class Pizzaria {
    public static void main(String[] args) {
        PizzaSalgada frangoCaupiry = new PizzaSalgada();
        frangoCaupiry.sabor = "Frango catupiy";
        frangoCaupiry.preco = 100;
        frangoCaupiry.preparar();

        PizzaDoce chocolate = new PizzaDoce();
        chocolate.sabor = "Chocolate";
        chocolate.preco = 10;
        chocolate.preparar();

        double combo = frangoCaupiry.preco + chocolate.preco;
        System.out.printf("O total do combo pe %.2f\n",combo);

    }
}
