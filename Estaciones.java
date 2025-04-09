import java.util.Scanner;

public class Estaciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresar el número del mes (1-12): ");
        int mes = sc.nextInt();

        switch (mes) {
            case 12, 1, 2:
                System.out.println("La estación de estos meses es Invierno");
                break;
            case 3, 4, 5:
                System.out.println("La estación de estos meses es Primavera");
                break;
            case 6, 7, 8:
                System.out.println("La estación de estos meses es Verano");
                break;
            case 9, 10, 11:
                System.out.println("La estación de estos meses es Otoño");
                break;
            default:
                System.out.println("Mes no válido");
        }

        sc.close();
    }
}