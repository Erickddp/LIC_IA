import java.util.Locale;
import java.util.Scanner;

/**
 * MiniBanco POO - Fase 3
 * Menú en consola: Scanner, do-while, switch y while para revalidar la entrada.
 *
 * @author Erick Domínguez Del Prado
 */
public class MiniBanco
{
    public static void main(String[] args)
    {
        // Locale.US: los decimales se escriben con punto (1500.5) en cualquier PC
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        Cuenta cuenta = null;
        int siguienteNumero = 1;
        int opcion;

        System.out.println("MiniBanco POO - Fase 3");
        do
        {
            System.out.println();
            System.out.println("1 Crear | 2 Depositar | 3 Retirar | 4 Consultar | 5 Salir");
            System.out.print("Opción: ");
            while (!sc.hasNextInt())
            {
                System.out.println("Eso no es un número entero: " + sc.next());
                System.out.print("Opción: ");
            }
            opcion = sc.nextInt();

            switch (opcion)
            {
                case 1:
                    System.out.print("Titular (una palabra): ");
                    String titular = sc.next();
                    cuenta = new Cuenta(titular, siguienteNumero);
                    siguienteNumero++;
                    System.out.println("Cuenta #" + cuenta.getNumero() + " creada para " + cuenta.getTitular());
                    break;
                case 2:
                    if (cuenta == null)
                    {
                        System.out.println("Primero crea una cuenta (opción 1).");
                    }
                    else
                    {
                        double monto = leerMonto(sc);
                        if (cuenta.depositar(monto))
                        {
                            System.out.println("Depósito aplicado. Saldo: $" + cuenta.getSaldo());
                        }
                    }
                    break;
                case 3:
                    if (cuenta == null)
                    {
                        System.out.println("Primero crea una cuenta (opción 1).");
                    }
                    else
                    {
                        double monto = leerMonto(sc);
                        if (cuenta.retirar(monto))
                        {
                            System.out.println("Retiro aplicado. Saldo: $" + cuenta.getSaldo());
                        }
                    }
                    break;
                case 4:
                    if (cuenta == null)
                    {
                        System.out.println("Primero crea una cuenta (opción 1).");
                    }
                    else
                    {
                        System.out.println(cuenta.getTitular() + " tiene $" + cuenta.getSaldo());
                        System.out.println("Proyección a 3 meses con 1% mensual:");
                        cuenta.proyectarSaldo(3, 0.01);
                    }
                    break;
                case 5:
                    System.out.println("Gracias por usar MiniBanco. ¡Hasta pronto!");
                    break;
                default:
                    System.out.println("Opción no válida: " + opcion);
            }
        } while (opcion != 5);
    }

    // Pide un double y repite mientras lo tecleado no sea un número
    private static double leerMonto(Scanner sc)
    {
        System.out.print("Monto: ");
        while (!sc.hasNextDouble())
        {
            System.out.println("Eso no es un número: " + sc.next());
            System.out.print("Monto: ");
        }
        return sc.nextDouble();
    }
}
