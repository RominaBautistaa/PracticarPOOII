
package Restaurante;

//PRODUCTO CONCRETO
public class HamburConcret extends ComidaRapida{

    public HamburConcret() {
        this.setNombre("Hamburguesa");
        this.setIngredientes("carne,tomate,pan");
        this.setPrecio(23.5);
        this.setTiempoPreparacion(60);
    }

    @Override
    public void preparar() {
        System.out.println("Cocinando la hambruguesa...");
    }
    
}
