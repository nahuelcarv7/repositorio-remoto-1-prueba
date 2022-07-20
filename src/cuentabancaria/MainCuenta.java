
package cuentabancaria;

import java.util.Scanner;


public class MainCuenta {


    public static void main(String[] args) {
     Scanner read = new Scanner(System.in);
     ClaseCuentaBancaria cuenta1 = new ClaseCuentaBancaria();
     
       
     cuenta1.crearCuenta();
     cuenta1.ingresar();
     cuenta1.retirar();
     cuenta1.extraccionRapida();
     cuenta1.consultarSaldo();
 
    }
    
}
