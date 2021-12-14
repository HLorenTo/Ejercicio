package ejercicio_en_clase;
import java.util.Scanner;
public class Ejercicio_en_Clase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el número: ");
        int s = sc.nextInt();
        Paroimpar e1 = new Paroimpar(s);
        System.out.println(e1.Parimpar());
        System.out.println(e1.negpos());
        System.out.println(e1.primo());
    }
    
}
