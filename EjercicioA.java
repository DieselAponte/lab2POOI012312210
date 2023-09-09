
package javaapplication2;

  import java.util.Scanner;
public class EjercicioA {
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese un número a evaluar: ");
        try {
            long x = scanner.nextLong();
            
            System.out.println(x + " puede ser almacenado en:");
            
            if (x >= Byte.MIN_VALUE && x <= Byte.MAX_VALUE) {
                System.out.println("* byte");
            }
            
            if (x >= Short.MIN_VALUE && x <= Short.MAX_VALUE) {
                System.out.println("* short");
            }
            
            if (x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE) {
                System.out.println("* int");
            }
            
            if (x >= Long.MIN_VALUE && x <= Long.MAX_VALUE) {
                System.out.println("* long");
            }
        } catch (Exception e) {
            System.out.println(scanner.next() + " no puede ser almacenado en ningún tipo de dato primitivo.");
        }
        
        scanner.close();
    }
}


