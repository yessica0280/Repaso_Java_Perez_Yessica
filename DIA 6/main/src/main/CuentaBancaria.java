package main;

/**
 *
 * @author Uniminuto Tibu
 */
public class CuentaBancaria {
    private String numeroCuenta;
    private double saldo;
    
    public CuentaBancaria(){}
    
    public CuentaBancaria(String numeroCuenta, double saldo){
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public void depositar(double cantidad){
        if (cantidad > 0){
            saldo = saldo + cantidad;
            System.out.println("El deposito fue realizado.");
        } 
        else {
            System.out.println("La cantidad a depositar debe ser positiva.");
        }
    }
    
    // Método para retirar platica con validación.
    
    public void retirar(double cantidad){
        if (cantidad > 0 && cantidad <= saldo){
            saldo = saldo - cantidad;
            System.out.println("Su retiro fue realizado.");
        }
        else if (cantidad > saldo){
            System.out.println("No tienes fondos suficientes.");
        }
        else {
            System.out.println("Por favor debes ingresar una cantidad positiva.");
        }
    }
}
