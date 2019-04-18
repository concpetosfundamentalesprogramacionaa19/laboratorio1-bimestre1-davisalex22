package problema2;
import java.util.Scanner;
public class Problema2 {
public static void main(String[] args) {
// Inicio      
Scanner entrada = new Scanner (System.in);
// Declaración de Variables
String x = "";
String y = "";
String z = "";
double m = 0;
double part1 = 0;
double part2 = 0;
// Ingreso de datos por teclado
    System.out.printf("Ingrese valor de la variable x: \n");
    x = entrada.nextLine();
    System.out.printf("Ingrese valor de la variable y: \n");
    y = entrada.nextLine();
    System.out.printf("Ingrese valor de la variable z: \n");
    z = entrada.nextLine();
// Conversion de datos String a Double
    double varX = Double.parseDouble(x);
    double varY = Double.parseDouble(y);
    double varZ = Double.parseDouble(z);
// Calculos respectivos    
    part1 = varX+(varY/varZ);
    part2 = varX-(varY/varZ);
    m = part1 / part2;
// Muestra de resultados por pantalla   
    System.out.printf("x= %s\n y= %s\n  z= %s\nda como resultado:"
            +"\n    m= %s\n",varX,varY,varZ,m);
// Fin
    }    
}
