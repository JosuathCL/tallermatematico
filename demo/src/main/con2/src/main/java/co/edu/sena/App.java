package co.edu.sena;

import java.util.Scanner;

/**
 * Hello world!
 *
 */  
public class App 

        {
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
            
        System.out.print("Ingrese el primer número: ");
        int num_1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int num_2 = scanner.nextInt();

        if (num_1 > num_2) {
            System.out.println("El número " + num_1 + " es mayor que el número " + num_2 + "");

        } else if (num_1 < num_2) {
            System.out.println("El número " + num_2 " es mayor que el número " + num_1 + "");
            
        } else {
            System.out.println("Ambos números son iguales " + num_1 + "");
        }

        scanner.close();
    }
}