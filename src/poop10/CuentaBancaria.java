/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop10;

/**
 * Clase que contiene los atributos y metodos de una cuenta bancararia
 * @author Luis Hernández
 */
public class CuentaBancaria {
    private double saldo;

    /**
     * Constructor
     */
    public CuentaBancaria() {
        saldo=0;
    }
    
    /**
     * Metodo depositar
     * @param monto Monto a depositar
     */
    public void depositar(double monto){
        System.out.println("Depositando "+monto);
        saldo+= monto;
    }
    
    /**
     * Metodo retirar
     * @param monto Monto a retirar
     * @throws SaldoInsuficienteException Excepsion creada en caso de que el saldo sea menor que el monto a retirar
     */
    public void retirar(double monto) throws SaldoInsuficienteException{//throws aivsa que puede o no haber exception
        System.out.println("Retirando "+monto);
        if (saldo<monto) {
            throw new SaldoInsuficienteException();//aqui en concreto sabemos que no se puede retirar mas de lo que hay, por tanto se manda a llamar la excpsion creada para este caso
        }else{
            saldo -= monto;
        }
    }
    
    /**
     * Metodo get, devuelve el saldo de la cuenta
     * @return 
     */
    public double getSaldo(){
        return saldo;
    }
    
}
