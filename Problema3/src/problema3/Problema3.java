package problema3;
import java.util.Scanner;
public class Problema3 {
public static void main(String[] args) {
// Inicio
Scanner entrada = new Scanner (System.in);
// Declaración de Variables
String nota1 = "";
String nota2 = "";
String nota3 = "";
double promedio = 0;
// Ingreso de datos por teclado
    System.out.printf("Ingrese valor de la nota 1: \n");
    nota1 = entrada.nextLine();
    System.out.printf("Ingrese valor de la nota 2: \n");
    nota2 = entrada.nextLine();
    System.out.printf("Ingrese valor de la nota 3: \n");
    nota3 = entrada.nextLine();
// Conversion de datos String a Double  y Calculos respectivos    
    promedio = (Double.parseDouble(nota1) + Double.parseDouble(nota2) +
                Double.parseDouble(nota3)) / 3;
// uso de expresionLogica ? expresion_1 : expresion_2   
    String respuesta =  promedio>=14 ? "Usted a aprobado el curso" :
                          "Usted no a aprobado el curso";
// Muestra de resultados por pantalla         
    System.out.printf(" Su promedio es : %s /20 \n Resultado : %s\n", promedio,
                     respuesta);    
// Fin
    }
}
