
public class AdaptadorPayPal implements Pago {
    private PagoPayPal PagoPayPal;

    public AdaptadorPayPal(PagoPayPal PagoPayPal) {
        this.PagoPayPal = PagoPayPal;
    }

    @Override
    public void realizarPago(float monto) {
        PagoPayPal.enviarPago(monto);
    }
    
    
}