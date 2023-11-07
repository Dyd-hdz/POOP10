/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop10;

/**
 * Archivo principal
 * @author Luis Hernández
 */
public class POOP10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola Mundo");
        String mensajes[]={"Primero","Segundo","Tercero"};
        
        //tipo de excepsion indice fuera del arreglo
        try{//el enunciado try sirve para "intentar" hacer cierta parte del codigo, si no funciona se necesita de especificar el tipo de error que se puede producir
            for (int i = 0; i <=3; i++) {
                System.out.println(mensajes[i]);//aqui hay una excepsion debido a que el indice esta fuera del arreglo, osea que el indice toma 4 elementos cuando el arreglo solo contiene 3
            }
            System.out.println("Hola mundo 2");
        }catch(ArrayIndexOutOfBoundsException e){//el catch es para especificar el tipo de excepsion que se espera por no funcionar, si es asi el codigo puede mostrar un mensaje personalizado
            System.out.println("Error");
            System.out.println(e.getMessage());//e es como un objeto, esta inflado por lo que posee ciertos metodos, se instancio en la linea del catch
            //el metodo getMessage es para obtener el tipo de error en especifico
        }
        
        try{//excepcion aritmetico
            float x;
            x=0/0;//division entre un numero flotante y un numero entero, sin la f seria una division entera
            System.out.println(x);
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        
        try{//catch aninado
            float x;
            x=0/0;//division entre un numero flotante y un numero entero, sin la f seria una division entera
            System.out.println(x);
        }catch(ArrayIndexOutOfBoundsException e){//el catch del indice fuera deñ arreglo
            System.out.println(e.getMessage());
        }catch(ArithmeticException e){//catch aritmetico
            System.out.println(e.getMessage());
        }catch(Exception e){//es como el default de las excepciones
            System.out.println(e.getMessage());
        }
        
        try{//excepcion aritmetico
            float x;
            x=0/0;//division entre un numero flotante y un numero entero, sin la f seria una division entera
            System.out.println(x);
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
            e.printStackTrace();//para marcar en donde se origina el error
            //marca el error y asu vez permite seguir la compilacion del codigo
        }
        System.out.println("Hola mundo 3");
        
        try{
            double division= metodoDivision(4f, 6.0);
        }catch(UnsupportedOperationException e){
            System.out.println(e.getMessage());
        }  
        
        //el cajero, pondra a trabajar las clases cuenta bancaria y la excepsion creada
        CuentaBancaria cuenta= new CuentaBancaria();
        try{
            cuenta.depositar(2000);
            cuenta.retirar(1000);
            cuenta.getSaldo();
            cuenta.retirar(1000);
            cuenta.getSaldo();
            cuenta.retirar(1000);//primera excepsion debido a que el saldo es menor que el monto a retirar
            //lo marcar en donde lo llama y en la clase cuenta bancaria donde se expecifica el caso cuando el saldo es menor
            cuenta.getSaldo();
            cuenta.depositar(200);
            cuenta.retirar(100);
        }catch(SaldoInsuficienteException e){
            e.printStackTrace();
        }
    }

    private static double metodoDivision(float f, double d) {
        throw new UnsupportedOperationException("Operacion no soportada"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    //throw da la orden de lanzar la excepsion
    //throws avisa, puede o no haver una excepsion  
}
