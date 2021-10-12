/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testoperaciones;

/**
 *
 * @author Santiago
 */
public class TestOperaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        var rest = Operaciones.sumar(5,3);
        System.out.println("rest = " +rest);
        
        var rest2 = Operaciones.sumar(5.8,3.5);
        System.out.println("rest2 = "+rest2);
        //¿Que metodo estara usando de los 2 definidos?
        var rest3 = Operaciones.sumar(3, 8L);
        System.out.println("rest3 = "+rest3);
    }
    
}
