package co.edu.sena;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
    
//Escribir un algoritmo para saber si el número ingresado por teclado es positivo o negativo.
     {
          Scanner escaner = new Scanner(System.in);
           
            System.out.println("Escribe un número:");

             double numero = escaner.nextDouble();

               if (numero == 0) {
                 System.out.println("El número es Cero");

                 } else if (numero < 0) {
                     System.out.println("El número es negativo");
                     
 }
  else {
     System.out.println("El número es positivo");
     }
    }
 }
    }

