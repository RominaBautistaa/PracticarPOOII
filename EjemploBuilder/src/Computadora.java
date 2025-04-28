/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USUARIO
 */
public class Computadora {
    private String marca;
    private String modelo;
    private String procesador;
    private String tarjetaGrafica;
    private int memoriaRAM; //en GB
    private int almacenamiento; //en GB
    private String tipoAlmacenamiento; //SSD / HDD / M2
    private boolean tieneBluetooth;
    private boolean tieneWebcam;
    private boolean tieneWifi;
    private String sistemaOperativo;
    
    //Contructor provado que solo puede ser invocado desde la clase builder
    //ello fuerza a que todos los objetos se construyan de manera controlada, o sea a traves de ComputadoraBuilder
    
    private Computadora(ComputadoraBuilder builder){
        this.marca=builder.getMarca();
        this.modelo=builder.getModelo();
        this.almacenamiento=builder.getAlmacenamiento();
        this.memoriaRAM=builder.getMemoriaRAM();
        this.procesador=builder.getProcesador();
        this.sistemaOperativo=builder.getSistemaOperativo();
        this.tarjetaGrafica=builder.getTarjetaGrafica();
        this.tieneBluetooth=builder.isTieneBluetooth();
        this.tieneWebcam=builder.isTieneWebcam();
        this.tieneWifi=builder.isTieneWifi();
        this.tipoAlmacenamiento=builder.getTipoAlmacenamiento();
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getTarjetaGrafica() {
        return tarjetaGrafica;
    }

    public void setTarjetaGrafica(String tarjetaGrafica) {
        this.tarjetaGrafica = tarjetaGrafica;
    }

    public int getMemoriaRAM() {
        return memoriaRAM;
    }

    public void setMemoriaRAM(int memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public String getTipoAlmacenamiento() {
        return tipoAlmacenamiento;
    }

    public void setTipoAlmacenamiento(String tipoAlmacenamiento) {
        this.tipoAlmacenamiento = tipoAlmacenamiento;
    }

    public boolean isTieneBluetooth() {
        return tieneBluetooth;
    }

    public void setTieneBluetooth(boolean tieneBluetooth) {
        this.tieneBluetooth = tieneBluetooth;
    }

    public boolean isTieneWebcam() {
        return tieneWebcam;
    }

    public void setTieneWebcam(boolean tieneWebcam) {
        this.tieneWebcam = tieneWebcam;
    }

    public boolean isTieneWifi() {
        return tieneWifi;
    }

    public void setTieneWifi(boolean tieneWifi) {
        this.tieneWifi = tieneWifi;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }
    
    public void mostrarInfo(){
        System.out.println("Marca: "+(marca !=null? marca : "No especificado"));
        System.out.println("Modelo: "+(modelo !=null? modelo : "No especificado"));
        System.out.println("Procesador: "+(procesador !=null? procesador : "No especificado"));
        System.out.println("TarjetaGrafica: "+(tarjetaGrafica !=null? tarjetaGrafica+ "GB" : "No especificado"));
        System.out.println("RAM: "+(memoriaRAM !=0? memoriaRAM + "GB": "No especificado"));
        System.out.println("Almacenamiento: "+(almacenamiento !=0? almacenamiento : "No especificado"));
        System.out.println("TipoAlmacenamiento: "+(tipoAlmacenamiento !=null? tipoAlmacenamiento : "No especificado"));
        System.out.println("Tiene bluetooth: " + (tieneBluetooth ? "Sí" : "No"));
        System.out.println("Tiene webcam: " + (tieneWebcam ? "Sí" : "No"));
        System.out.println("Tiene wi-fi: " + (tieneWifi ? "Sí" : "No"));
        System.out.println("Sistema operativo: " + (sistemaOperativo != null ? sistemaOperativo : "No especificado"));
    }
    
    //Metodo estatico para crear un objeto de la clase Computadora desde ComputadoraBUilder
    public static Computadora crearDesdeBuilder(ComputadoraBuilder builder){
        return new Computadora(builder);
    }
}
