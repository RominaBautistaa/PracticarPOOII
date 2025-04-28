package Restaurante;

import Restaurante.ComidaRapida;


//PRODUCTO CONCRETO
public class chickenConcret extends ComidaRapida {
    
    public chickenConcret(){
        this.setNombre("Hamburguesa");
        this.setIngredientes("carne,tomate,pan");
        this.setPrecio(23.5);
        this.setTiempoPreparacion(60);
    }

    @Override
    public void preparar() {
        System.out.println("Cocinando el pollo a al brasa...");
}
}
