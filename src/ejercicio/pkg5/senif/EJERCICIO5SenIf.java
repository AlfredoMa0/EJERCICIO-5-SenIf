/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg5.senif;

import java.util.Scanner;

/**
 *
 * @author Campe
 */
public class EJERCICIO5SenIf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int Num;
        Scanner Valor = new Scanner(System.in);
        System.out.println("INGRESE UN NUMERO: ");
        Num = Valor.nextInt();
        
        
        if (Num >= 0) {
            System.out.println("ES POSITIVO");
        }else if (Num<=0 ) {
            System.out.println("ES NEGATIVO");
        }
    }
    
}
