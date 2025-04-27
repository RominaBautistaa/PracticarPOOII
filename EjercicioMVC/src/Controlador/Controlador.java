
import Vista.Vista;
import Modelo.Pasajero;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador {
    private Vista vista;
    private Pasajero pasajero;

    public Controlador(Vista vista) {
        this.vista = vista;

        // Agregar ActionListener al botón "Volar"
        vista.getVolar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = vista.getGetTxtNombre().getText();
                String apellidos = vista.getGetTxtApellidos().getText();
                String lugarOrigen = vista.getGetTxtLugarOrigen().getText();
                String lugarDestino = vista.getGetTxtLugarDestino().getText();

                boolean tieneMaletas = vista.getMaletas().isSelected();
                boolean alquilaHotel = vista.getEquipaje().isSelected();
                boolean traeMascota = vista.getMascotas().isSelected();
                boolean idaYvuelta = vista.getIda().isSelected();

                // Crear un nuevo objeto Pasajero con los datos ingresados
                pasajero = new Pasajero(nombre, apellidos, lugarOrigen, lugarDestino,
                        tieneMaletas, alquilaHotel, traeMascota, idaYvuelta);

                // Llamar al método para calcular el precio y mostrarlo
                calcularPrecioYMostrar(pasajero);
            }
        });
    }

    private void calcularPrecioYMostrar(Pasajero pasajero) {
        // Aquí, podrías agregar la lógica para calcular el precio del vuelo, IVA, etc.
        double precioBase = 1000.0; // Solo como ejemplo
        double iva = precioBase * 0.21;
        double precioTotal = precioBase + iva;

        // Mostrar en la vista
        vista.mostrarPrecio(precioTotal, iva);
    }
    
    private void resetearCampos() {
        // Llamamos al método de la Vista para resetear los campos
        vista.resetearFormulario();
    }
}
