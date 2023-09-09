
package javaapplication2;


import java.util.Scanner;

public class EjercicioB {
    private static final Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        System.out.println("Ingrese el numero: ");
        int N = scanner.nextInt();
        
        
        if (N % 2 != 0) {
            // Si n es impar
            System.out.println("Luna");
        } else {
            if (N >= 2 && N <= 5) {
                // Si n es par y está dentro del rango de 2 a 5
                System.out.println("Sol");
            } else if (N >= 6 && N <= 20) {
                // Si n es par y está dentro del rango de 6 a 20
                System.out.println("Tierra");
            } else {
                // Si n es par y mayor que 20
                System.out.println("Galaxia");
            }
        }
        scanner.close();
    }
}

