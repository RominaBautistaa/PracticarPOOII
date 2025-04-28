/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Restaurante;

//CLASE CREADOR=> QUE VA A USAR EL PATRON FACTORY
public abstract class Restaurante {
    
    public abstract ComidaRapida crearComida(); //FACTORY METHOD:Define que todo restaurante debe poder crear una comida rápida
    
    public void servirComida(){
        ComidaRapida comida= crearComida();
        comida.preparar();
        comida.servir();
        System.out.println("Tiempo de preparación: " + comida.getTiempoPreparacion() + " minutos.");
        System.out.println("El precio es: " + comida.calcularPrecio());
    }
}
