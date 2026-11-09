/**
 * MiniBanco POO - Fase 2
 * Crea cuentas con los dos constructores y las altera solo mediante métodos.
 *
 * @author Erick Domínguez Del Prado
 */
public class MiniBanco
{
    public static void main(String[] args)
    {
        System.out.println("MiniBanco POO - Fase 2");

        // Constructor de 2 parámetros: saldo inicial 0
        Cuenta c1 = new Cuenta("Rick", 1);
        // Constructor de 3 parámetros: encadena con this(titular, numero)
        Cuenta c2 = new Cuenta("Ana", 2, 300.0);

        // Formas de alterar un objeto ya creado: setter y métodos
        c1.depositar(1500.5);
        c2.setTitular("Ana Sofía");

        // c3 NO es un objeto nuevo: apunta al mismo objeto que c1
        Cuenta c3 = c1;
        c3.depositar(100.0);

        // Los getters leen el estado (los atributos son private)
        System.out.println(c1.getTitular() + " tiene $" + c1.getSaldo());
        System.out.println(c2.getTitular() + " tiene $" + c2.getSaldo());
        System.out.println("c1 == c3: " + (c1 == c3));

        // Estas líneas NO compilan (quita las // para ver el error):
        // c1.saldo = 1000000;      // error: saldo has private access in Cuenta
        // Cuenta c4 = new Cuenta(); // error: no suitable constructor found for Cuenta(no arguments)
    }
}
