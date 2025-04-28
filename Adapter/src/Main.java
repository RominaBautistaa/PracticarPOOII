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
        
        //pago normal realizado con tarjeta
        Pago pagoTarjeta= new PagoTarjeta();
        pagoTarjeta.realizarPago(150);
        
        //Pago adaptado realizado con paypal
        PagoPayPal cuentaPaypal= new PagoPayPal();
        Pago pagoPaypal= new AdaptadorPayPal(cuentaPaypal);
        pagoPaypal.realizarPago(234);
    }
    
}
