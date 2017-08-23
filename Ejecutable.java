
/**
 * Write a description of class Ejecutable here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import  java.lang.Math;
import java.util.Scanner;
public class Ejecutable
{
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        System.out.print("\f");
        System.out.println("Introduzca el valor del tamaño de la Sucesión de Fibonacci: ");
        int n = lector.nextInt();
        
        Fibonacci f1 = new Fibonacci("Serie de Fibonacci", n); 
        f1.mostrarSerie();
                
    }
}

