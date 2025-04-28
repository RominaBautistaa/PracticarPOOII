/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USUARIO
 */

//Clase computadoraBuilder que sera la responsable de construir paso a paso una Computadora
public class ComputadoraBuilder {
    
    //mismo atributos de la clase computadora
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
    
    //setters: permiten confifurar cada atributo individualmente.

    public ComputadoraBuilder setMarca(String marca) {
        this.marca = marca;
        return this;
    }

    public ComputadoraBuilder setModelo(String modelo) {
        this.modelo = modelo;
        return this;
    }

    public ComputadoraBuilder setProcesador(String procesador) {
        this.procesador = procesador;
        return this;
    }

    public ComputadoraBuilder setTarjetaGrafica(String tarjetaGrafica) {
        this.tarjetaGrafica = tarjetaGrafica;
        return this;
    }

    public ComputadoraBuilder setMemoriaRAM(int memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
        return this;
    }

    public ComputadoraBuilder setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
        return this;
    }

    public ComputadoraBuilder setTipoAlmacenamiento(String tipoAlmacenamiento) {
        this.tipoAlmacenamiento = tipoAlmacenamiento;
        return this;
    }

    public ComputadoraBuilder setTieneBluetooth(boolean tieneBluetooth) {
        this.tieneBluetooth = tieneBluetooth;
        return this;
    }

    public ComputadoraBuilder setTieneWebcam(boolean tieneWebcam) {
        this.tieneWebcam = tieneWebcam;
        return this;
        
    }

    public ComputadoraBuilder setTieneWifi(boolean tieneWifi) {
        this.tieneWifi = tieneWifi;
        return this;
    }

    public ComputadoraBuilder setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
        return this;
    }

    //Getters
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getProcesador() {
        return procesador;
    }

    public String getTarjetaGrafica() {
        return tarjetaGrafica;
    }

    public int getMemoriaRAM() {
        return memoriaRAM;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public String getTipoAlmacenamiento() {
        return tipoAlmacenamiento;
    }

    public boolean isTieneBluetooth() {
        return tieneBluetooth;
    }

    public boolean isTieneWebcam() {
        return tieneWebcam;
    }

    public boolean isTieneWifi() {
        return tieneWifi;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }
    
    public Computadora build(){
        return Computadora.crearDesdeBuilder(this);
    }
}
