/**
 * MiniBanco POO - Fase 1
 * Programa principal: crea dos objetos de la clase Cuenta y los usa.
 *
 * @author Erick Domínguez Del Prado
 */
public class MiniBanco
{
    public static void main(String[] args)
    {
        System.out.println("Hola Mundo, bienvenido a MiniBanco POO");

        // Dos objetos (instancias) creados a partir de la misma clase
        Cuenta c1 = new Cuenta();
        c1.titular = "Rick";
        c1.numero = 1;

        Cuenta c2 = new Cuenta();
        c2.titular = "Ana";
        c2.numero = 2;

        // Invocación de métodos con parámetros
        c1.depositar(1500.50);
        c2.depositar(300);

        // Métodos con valor de retorno
        System.out.println(c1.titular + " tiene $" + c1.consultarSaldo());
        System.out.println(c2.titular + " tiene $" + c2.consultarSaldo());
    }
}
