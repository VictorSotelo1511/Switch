import java.util.Scanner;

public class MenuCajero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int saldo = 1000;

        System.out.print("Ingrese una opcion: ");
        System.out.println("1. Verficar Saldo");
        System.out.println("2. Depositar Dinero");
        System.out.println("3. Retirar Dinero");
        System.out.println("4. Salir");
        int operacion = sc.nextInt();

        switch (operacion) {
            case 1:
                System.out.println("Saldo: " + saldo);
                break;
            case 2:
                System.out.print("Ingrese el monto a depositar: ");
                int montoDeposito = sc.nextInt();
                saldo += montoDeposito;
                System.out.println("Depósito realizado. Nuevo saldo: " + saldo);
                break;
            case 3:
                System.out.print("Ingrese el monto a retirar: ");
                int montoRetiro = sc.nextInt();
                if (montoRetiro <= saldo) {
                    saldo -= montoRetiro;
                    System.out.println("Retiro realizado. Nuevo saldo: " + saldo);
                } else {
                    System.out.println("Fondos insuficientes");
                }
                break;
            case 4:
                System.out.println("Saliendo del sistema...");
                break;
            default:
                System.out.println("Número no válido");
        }
    }
}
