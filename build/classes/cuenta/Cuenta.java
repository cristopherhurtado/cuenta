
package cuenta;

import java.util.Scanner;


public class Cuenta {
    private static Object cuenta;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        
        String titularCuenta;
        int deposito = 0;
        
        System.out.print("Ingrese Titular de Cuenta = ");
        titularCuenta = leer.next();
        System.out.println("\n--El saldo actual del titular es $100000--");
        System.out.print("\nIngrese valor a depositar = ");
        deposito = leer.nextInt();
        
        NewClass cuenta = new NewClass(titularCuenta,100000);
        cuenta.ingresarCantidad(deposito);
        System.out.println("\n"+cuenta);
       
    }
    
}
