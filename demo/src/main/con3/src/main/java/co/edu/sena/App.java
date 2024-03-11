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

        System.out.print("Ingrese el tercer número: ");
        int num_3 = scanner.nextInt();

        int mayor = num_1;
        int menor = num_1;

        if (num_2 > mayor) {
            mayor = num_2;
        }
        if (num_2 < menor) {
            menor = num_2;
        }

        if (num_3 > mayor) {
            mayor = num_3;
        }
        if (num_3 < menor) {
            menor = num_3;
        }

        System.out.println("El mayor número es: " + mayor);
        System.out.println("El menor número es: " + menor);

    }
}
    
