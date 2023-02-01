import java.util.Scanner;

public class EjercicioStringNetodos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite el nombre del primer integrante");
        String nombre1 = scanner.nextLine();
        System.out.println("Digite el nombre del segundo integrante");
        String nombre2 = scanner.nextLine();
        System.out.println("Digite el nombre del tercer integrante");
        String nombre3 = scanner.nextLine();

        //nombre 1
        String caracter1 = nombre1.substring(1, 2);
        String mayus1 = caracter1.toUpperCase();
        String imprimir1 = mayus1 + "." + nombre1.substring(nombre1.length() - 2);

        //nombre 2
        String caracter2 = nombre2.substring(1, 2);
        String mayus2 = caracter2.toUpperCase();
        String imprimir2 = mayus2 + "." + nombre2.substring(nombre2.length() - 2);

        //nombre 3
        String caracter3 = nombre3.substring(1, 2);
        String mayus3 = caracter3.toUpperCase();
        String imprimir3 = mayus3 + "." + nombre3.substring(nombre3.length() - 2);

        //imprimir
        System.out.println(imprimir1 + "_" + imprimir2 + "_" + imprimir3);
    }
}
