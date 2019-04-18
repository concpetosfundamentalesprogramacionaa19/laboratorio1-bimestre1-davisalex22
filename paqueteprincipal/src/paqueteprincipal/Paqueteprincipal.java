/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteprincipal;
import paquete1.Miclase1;
import paquete2.Miclase2;
import paquete3.Miclase3;

/**
 *
 * @author Usuario iTC
 */
public class Paqueteprincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.printf("Nombres:   \n\t%s\nApellidos:   \n\t%s\nEdad:   "
                + "\n\t%s\n",Miclase2.nombre,Miclase3.apellido,Miclase1.edad);
    }
    
}
