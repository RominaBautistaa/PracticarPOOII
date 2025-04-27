
package Modelo;


public class Hijos extends Persona{
    private int edad;

    public Hijos(int edad, String nombre, String apellido, String lugarOrigen, String lugarDestino) {
        super(nombre, apellido, lugarOrigen, lugarDestino);
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
