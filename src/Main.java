//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el valor de A:");
        int A = scanner.nextInt();

        System.out.println("Ingrese el valor de B:");
        int B = scanner.nextInt();

        System.out.println("Ingrese el valor de C:");
        int C = scanner.nextInt();

        if (A==B || A==C || B==C) {
            System.out.println("Por favor ingresar valores diferentes.");
        }else{
            if (A>B && A>C){
                System.out.println("A es el número mayor");
            }else if (B>A && B>C){
                System.out.println("B es el número mayor");
            }else{
                System.out.println("C es el número mayor");
            }


        if (A < B && A < C) {
            System.out.println("A es el número menor");
        } else if (B < A && B < C) {
            System.out.println("B es el número menor");
        } else {
            System.out.println("C es el número menor");
        }
        }
        scanner.close();
    }
}