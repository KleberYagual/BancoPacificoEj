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
public class Cuentajoven extends CuentaAhorros {
    
    private int edad;

    public Cuentajoven() {
    }

    public Cuentajoven(int medad, double deposito, double retiro, double saldo, String estado, int clienteid, String nombre, String apellido, String tipocuenta, double monto) {
        super(deposito, retiro, saldo, estado, clienteid, nombre, apellido, tipocuenta, monto);
        this.edad = medad;
    }


    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
   @Override
    public void mostrar() {
        super.mostrar();
        System.out.print(this.getNombre()+" " +this.getApellido());
        System.out.println(" Usted es menor de Edad y tiene " + this.getEdad() + " años");
    } 
    
}
