
package Modelo;

import java.util.List;
import java.util.ArrayList;


public class Pasajero extends Persona{
    private boolean tieneMaletas;
    private boolean tieneMascota;
    private boolean alguilaHotel;
    private double precioVuelos;
    private boolean idaYvuelta;
    private List<Hijos> hijos;

    public Pasajero(String nombre, String apellidos, String lugarOrigen, String lugarDestino,
                    boolean tieneMaletas, boolean alquilaHotel, boolean traeMascota, boolean idaYVuelta) {
        super(nombre, apellidos, lugarOrigen, lugarDestino);
        this.tieneMaletas = tieneMaletas;
        this.alguilaHotel = alquilaHotel;
        this.tieneMascota = traeMascota;
        this.idaYvuelta = idaYVuelta;
        this.hijos = new ArrayList<>(); // Inicializas la lista de hijos vacía
    }

    public boolean isTieneMaletas() {
        return tieneMaletas;
    }

    public void setTieneMaletas(boolean tieneMaletas) {
        this.tieneMaletas = tieneMaletas;
    }

    public boolean isTieneMascota() {
        return tieneMascota;
    }

    public void setTieneMascota(boolean tieneMascota) {
        this.tieneMascota = tieneMascota;
    }

    public boolean isAlguilaHotel() {
        return alguilaHotel;
    }

    public void setAlguilaHotel(boolean alguilaHotel) {
        this.alguilaHotel = alguilaHotel;
    }

    public double getPrecioVuelos() {
        return precioVuelos;
    }

    public void setPrecioVuelos(double precioVuelos) {
        this.precioVuelos = precioVuelos;
    }

    public boolean isIdaYvuelta() {
        return idaYvuelta;
    }

    public void setIdaYvuelta(boolean idaYvuelta) {
        this.idaYvuelta = idaYvuelta;
    }
    
    public void agregarHijos(Hijos hijo){
        hijos.add(hijo);
    }
    
    public int getNumeroHijos(Hijos hijo){
        return hijos.size();
    }
}
