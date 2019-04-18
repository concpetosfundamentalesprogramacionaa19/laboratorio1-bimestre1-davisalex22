package problema1;
import java.util.Scanner;
public class Problema1 {
public static void main(String[] args) {
// Inicio
Scanner entrada = new Scanner (System.in);
// Declaración de Variables        
double horas = 0;
double costo = 0;
double sueldo = 0;
double descuento = 0;
double sueldoMensual = 0;
// Ingreso de datos por teclado
    System.out.printf("Ingrese el número de horas de trabajo: \n");
    horas = entrada.nextDouble();
    System.out.printf("Ingrese el costo por horas oficial de trabajo: \n");
    costo = entrada.nextDouble();
// Calculos respectivos     
    sueldo = horas * costo;
    descuento = (sueldo * 0.10) ;
    sueldoMensual= sueldo - descuento;
// Muestra de resultados por pantalla 
   System.out.printf("El valor mensual a pagar de un trabajador es:%s\n",
                       sueldoMensual);
// Fin        
    }    
}
