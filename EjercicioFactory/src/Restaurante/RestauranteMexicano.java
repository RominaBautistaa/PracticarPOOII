
package Restaurante;


//CREADOR CONCRETO
public class RestauranteMexicano extends Restaurante{

    @Override
    public ComidaRapida crearComida() {
        return new chickenConcret();
    }
    
}
