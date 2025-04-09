import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresar primer número: ");
        double num1 = sc.nextDouble();

        System.out.print("Ingresar segundo número: ");
        double num2 = sc.nextDouble();

        System.out.print("Ingresar operación (+, -, *, /): ");
        String operacion = sc.next();

        switch (operacion) {
            case "+":
                System.out.println("Resultado: " + (num1 + num2));
                break;
            case "-":
                System.out.println("Resultado: " + (num1 - num2));
                break;
            case "*":
                System.out.println("Resultado: " + (num1 * num2));
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("No válido, división entre cero");
                } else {
                    System.out.println("Resultado: " + (num1 / num2));
                }
                break;
            default:
                System.out.println("Operación no válida");
        }

        sc.close();
    }
}