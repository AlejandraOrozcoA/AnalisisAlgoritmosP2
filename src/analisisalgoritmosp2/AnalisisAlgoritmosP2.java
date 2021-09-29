package analisisalgoritmosp2;

import java.util.Random;
import java.util.Scanner;

public class AnalisisAlgoritmosP2 {

    public static void main(String[] args) {
        int tam;
        System.out.println("Elija el Algorimo");
        System.out.println("1. Fibonacci Iterativa");
        System.out.println("2. Fibonacci Recursiva");
        System.out.println("3. Perfecto");
        System.out.println("4. Mostrar Perfecto");
        Scanner sc = new Scanner(System.in);
        String op = sc.nextLine();
        switch (op) {
            case "1":
                System.out.println("¿Cuantos numeros de la serie desea?");
                Scanner s = new Scanner(System.in);
                tam = s.nextInt();
                Fibonacci fibo = new Fibonacci();
                fibo.fibonacciI(tam);
                break;
            case "2":
                System.out.println("¿Cuantos numeros de la serie desea?");
                Scanner sca = new Scanner(System.in);
                tam = sca.nextInt();
                Fibonacci fibo2 = new Fibonacci();
                String ar2[][] = new String[tam][2];
                for (int i = 1; i <= tam; i++) {
                    ar2[i - 1][0] = String.valueOf(fibo2.fibonacciR(i));
                    ar2[i - 1][1] = String.valueOf(fibo2.getCont2());
                }
                DocExcel ex = new DocExcel(ar2, "FiboRecursivo");
                fibo2.setCont2(0);
                break;
            case "3":
                System.out.println("¿Cuantos puntos desea? 1-100");
                Scanner scan = new Scanner(System.in);
                tam = scan.nextInt();
                Random random = new Random();
                String ar[][] = new String[tam][2];
                for (int i = 0; i < tam; i++) {
                    int value = random.nextInt(100 + 1) + 1;
                    Perfectos per = new Perfectos();
                    if (per.Perfecto(value) == 1) {
                        System.out.println("Es perfecto");
                        ar[i][0] = String.valueOf(value);
                        ar[i][1] = String.valueOf(per.getCont1());
                    } else {
                        System.out.println("No es perfecto");
                        ar[i][0] = String.valueOf(value);
                        ar[i][1] = String.valueOf(per.getCont1());
                    }
                }
                DocExcel ex2 = new DocExcel(ar, "Perfecto");
                break;
            case "4":
                System.out.println("¿Cuantos numeros perfectos desea? 1-4");
                Scanner scann = new Scanner(System.in);
                tam = scann.nextInt();
                Perfectos per2 = new Perfectos();
                per2.MostrarPerfectos(tam);
                break;
            default:
                System.out.println("No eligio una opcion valida");
        }
    }

}
