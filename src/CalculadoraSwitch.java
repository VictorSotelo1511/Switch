import java.util.Scanner;

public class CalculadoraSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        double numero1 = sc.nextDouble();
        sc.nextLine();

        System.out.print("Ingrese el segundo número: ");
        double numero2 = sc.nextDouble();
        sc.nextLine();

        System.out.println("Ingrese la operacion que desea realizar: ");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");
        int operacion = sc.nextInt();

        switch (operacion) {
            case 1:
                System.out.println("Resultado: " + (numero1 + numero2));
                break;
            case 2:
                System.out.println("Resultado: " + (numero1 - numero2));
                break;
            case 3:
                System.out.println("Resultado: " + (numero1 * numero2));
                break;
            case 4:
                if (numero2 == 0) {
                    System.out.println("No se puede dividir por cero");
                } else {
                    System.out.println("Resultado: " + (numero1 / numero2));
                }
                break;

            default:
                System.out.println("Número no válido");
        }
    }
}
