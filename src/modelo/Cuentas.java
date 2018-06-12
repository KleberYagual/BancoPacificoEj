/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author I7
 */
public abstract class Cuentas {
   private String nombanco;
   private int clienteid;
   private String nombre;
   private String apellido;
   private int numcuenta;
   private String tipocuenta;
   private double monto;

    public Cuentas() {
    }

    public Cuentas(int clienteid, String nombre, String apellido, String tipocuenta, double monto) {
        this.clienteid = clienteid;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipocuenta = tipocuenta;
        this.monto = monto;
    }

    public String getNombanco() {
        return nombanco;
    }

    public void setNombanco(String nombanco) {
        this.nombanco = nombanco;
    }

    public int getClienteid() {
        return clienteid;
    }

    public void setClienteid(int clienteid) {
        this.clienteid = clienteid;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getNumcuenta() {
        return numcuenta;
    }

    public void setNumcuenta(int numcuenta) {
        this.numcuenta = numcuenta;
    }

    public String getTipocuenta() {
        return tipocuenta;
    }

    public void setTipocuenta(String tipocuenta) {
        this.tipocuenta = tipocuenta;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }


  

   public void mostrar(){
        
        System.out.println(String.format("El cliente es %s, %s", nombre, apellido + " su tipo de cuenta es : " + tipocuenta ));
    }
   
    
}
