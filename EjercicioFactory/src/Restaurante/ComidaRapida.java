
package Restaurante;

// PRODUCTO ABSTRACTO
public abstract class ComidaRapida {
    protected String nombre;
    protected double precio;
    protected String ingredientes;
    protected int tiempoPreparacion;
    
    public abstract void preparar();
    
    public void servir(){
        System.out.println("Sirviendo: "+nombre+ "con los ingredientes ");
    }
    
    public double calcularPrecio(){
        return precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public int getTiempoPreparacion() {
        return tiempoPreparacion;
    }

    public void setTiempoPreparacion(int tiempoPreparacion) {
        this.tiempoPreparacion = tiempoPreparacion;
    }
    
    
}
