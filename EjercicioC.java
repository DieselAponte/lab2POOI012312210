/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication7;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class EjercicioC {
     public static void main(String[] args) {
        double currentSalary; // salario anual actual
        double rating; // Calificacion de desempeño (1=excelente, 2=bueno y 3=malo).
        double raise = 0; // monto en dólares del aumento
        
        Scanner scan = new Scanner(System.in);
        
        // Obtenga el salario actual y la calificacion de desempeño
        System.out.print("Ingrese el salario actual: ");
        currentSalary = scan.nextDouble();
        
        System.out.print("Ingrese la calificacion de desempeno (1=excelente, 2=bueno, 3=malo): ");
        rating = scan.nextDouble();
        
        // Calcula el aumento según la calificacion de desempeño
        if (rating == 1) {
            raise = currentSalary * 0.06; // Aumento del 6% para calificacion excelente
        } else if (rating == 2) {
            raise = currentSalary * 0.04; // Aumento del 4% para calificacion buena
        } else if (rating == 3) {
            raise = currentSalary * 0.015; // Aumento del 1.5% para calificacion mala
        } else {
            System.out.println("Calificación de desempeño inválida.");
            System.exit(0); // Sale del programa si la calificacion es inválida
        }
        
        // Calcula el nuevo salario
        double newSalary = currentSalary + raise;
        
        // Imprime resultado
        System.out.println("Monto del aumento: $" + raise);
        System.out.println("Su nuevo salario: $" + newSalary);
    }
}

