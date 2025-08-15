package org.example.heranca.pizza;

public class PizzaDoce extends Pizza {
    void preparar(){
        System.out.printf("Preparando pizza, %s ...com cobertura extra\n",this.sabor);
    }
}
