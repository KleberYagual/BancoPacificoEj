/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancopacificoejemplo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import modelo.CuentaAhorros;
import modelo.Cuentas;
import modelo.CuentaCorriente;
import modelo.Cuentajoven;

/**
 *
 * @author I7
 */
public class BancoPacificoEjemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        CuentaAhorros cah1= new CuentaAhorros();
        cah1.setNombre("Diego");
        cah1.setApellido("Vera");
        cah1.setClienteid(06175321);
        cah1.setTipocuenta("Cuenta de ahorros");
        cah1.setEstado("Activo");
        
        CuentaCorriente cco1= new CuentaCorriente();
        cco1.setNombre("Luis");
        cco1.setApellido("Yagual");
        cco1.setClienteid(02022477);
        cco1.setTipocuenta("Cuenta corriente");
        cco1.setSaldo(2500.80);
         
        Cuentajoven cjo1= new Cuentajoven();
        cjo1.setNombre("Cindy");
        cjo1.setApellido("Cruz");
        cjo1.setEdad(15);
        cjo1.setClienteid(0250);
        cjo1.setTipocuenta("Cuenta de ahorros joven");
        cjo1.setEstado("Activo");
        
       List<Cuentas> cuentabancarias = new ArrayList<Cuentas>();
       cuentabancarias.add(cah1);
       cuentabancarias.add(cco1);
       cuentabancarias.add(cjo1);
        
       cuentabancarias.forEach((persona) -> {
            persona.mostrar();
        }
       );
        
        Scanner s = new Scanner(System.in);
        s.nextLine();
       
    }  
}