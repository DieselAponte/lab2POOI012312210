
package zodiacsign;

import java.util.Scanner;

public class ZodiacSign {

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.print("Ingrese un anho: ");
     int año = sc.nextInt();
     int residuo = año % 12;
     
     switch(residuo) {
         case 0:
                System.out.println(año + " es el anho del mono");
                break;
            case 1:
                System.out.println(año + " es el anho del gallo");
                break;
            case 2:
                System.out.println(año + " es el anho del perro");
                break;
            case 3:
                System.out.println(año + " es el anho del cerdo");
                break;
            case 4:
                System.out.println(año + " es el anho de la rata");
                break;
            case 5:
                System.out.println(año + " es el anho del buey");
                break;
            case 6:
                System.out.println(año + " es el anho del tigre");
                break;
            case 7:
                System.out.println(año + " es el anho del conejo");
                break;
            case 8:
                System.out.println(año + " es el anho del dragon");
                break;
            case 9:
                System.out.println(año + " es el anho de la serpiente");
                break;
            case 10:
                System.out.println(año + " es el anho del caballo");
                break;
            case 11:
                System.out.println(año + " es el anho de la oveja");
                break;
            default:
                System.out.println("Su año ingresado es negativo (Incorrecto) ");
     }
    }
    
}
