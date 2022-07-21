 
package cuentabancaria;



import java.util.Scanner;

public class ClaseCuentaBancaria {
    Scanner read = new Scanner(System.in);
   private int numeroCuenta;
    private int dni;
    private double saldoActual;
    private int interes;
    public String nombre;
   private String atr1;

    public ClaseCuentaBancaria(int numeroCuenta, int dni, double saldoActual, int interes) {
        this.numeroCuenta = numeroCuenta;
         this.numeroCuenta= (int)(Math.random() * 2000);
        this.dni = dni;
        this.saldoActual = saldoActual;
    }

    public int getInteres() {
        return interes;
    }

    public void setInteres(int interes) {
        this.interes = interes;
    }

    public ClaseCuentaBancaria() {
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }
    public void crearCuenta(){
        System.out.println("Ingrese su nombre");
        this.nombre = read.next() + read.next();
        System.out.println("Ingrese su dni");
        this.dni = read.nextInt();
        System.out.println("Su numero de cuenta es " +  Math.random()*10000);
    }
    public void ingresar(){
        System.out.println("Cuanto es su ingreso?");
       double ingreso = read.nextDouble();
      this.saldoActual = ingreso + this.saldoActual;
        System.out.println("Su saldo total es de " + this.saldoActual );
    }
    public void retirar(){
        double retiro = 0 ;
        if (retiro>this.saldoActual){
        System.out.println("Ingrese el dinero a retirar");
     retiro = read.nextDouble();
        double total = this.saldoActual - retiro;
        System.out.println("El total de dinero en su cuenta  es " + total);
      }else{
            System.out.println("Fondos insuficientes");
        }
    }
    public void extraccionRapida(){
      double  porcentaje = (this.saldoActual*20)/100;
        System.out.println("Usted ha sacado " + porcentaje + " pesos");
    }
    public void consultarSaldo(){
        System.out.println("Su saldo es "+ this.saldoActual);
    }
    
}
