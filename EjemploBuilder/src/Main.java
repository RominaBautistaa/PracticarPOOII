/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USUARIO
 */
public class Main {
    public static void main(String[] args) {
        Computadora gamer = new ComputadoraBuilder()
                            .setMarca("ASUS")
                            .setProcesador("i9")
                            .setAlmacenamiento(1024)
                            .setTipoAlmacenamiento("SSD")
                            .setTarjetaGrafica("nvidia")
                            .setTieneWifi(true)
                            .build();
        
        Computadora oficina= new ComputadoraBuilder()
                            .setMarca("Lenovo")
                            .setModelo("Elite desk")
                            .setProcesador("i5")
                            .setSistemaOperativo("Windows")
                            .build();
        
        Computadora basica = new ComputadoraBuilder()
        .setMarca("Lenovo")
        .setModelo("Ideapad 3")
        .build();
        
        System.out.println("Computadora Gamer: ");
        gamer.mostrarInfo();
        
        System.out.println("Computadora Oficina: ");
        oficina.mostrarInfo();
        
        System.out.println("Computadora Basica: ");
        basica.mostrarInfo();
    }
    
}
