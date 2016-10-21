/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema.pkg09;
import java.util.*;
/**
 *
 * @author Samsung
 */
public class Problema09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // SEPARADOR DE UN NUMERO DE CUATRO DIGITOS
        int numero;
        numero = solicitarNumero();
        calculoResultado(numero);
    }
    
    //ESCANEO DEL NUMERO INGRESADO POR EL USUARIO
    public static int solicitarNumero(){
        int numero;
        System.out.println("Ingresa el numero que deseas separar:");
        Scanner entradaNumero = new Scanner(System.in);
        numero = entradaNumero.nextInt();
        return numero;
    }
    
    /*SEPARACION DE MILES, CENTENAS, DESCENAS Y UNIDADES E IMPRESION
    DEL NUMERO DADO
    */
    public static void calculoResultado(int numero){
        int m, c, d, u, rm, rc;
        m = (numero/1000);
        rm = (m*1000);
        c = (numero%1000);
        rc = ((c/100)*(100));
        d = (((c%100)/(10))*(10));
        u = (numero%10);
        System.out.println("Separacion: " + rm + " + " + rc + " + " + d + " + " + u);
    }
    
}
