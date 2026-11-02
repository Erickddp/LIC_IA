/**
 * MiniBanco POO - Fase 1 (Unidades 1 y 2)
 * Clase Cuenta: el "molde" a partir del cual se crean las cuentas.
 *
 * @author Erick Domínguez Del Prado
 * @version Fase 1 - noviembre 2026
 */
public class Cuenta
{
    // Atributos: guardan el estado de cada objeto
    String titular;
    int numero;
    double saldo;

    /**
     * Suma un monto al saldo. Recibe un parámetro y no regresa nada (void).
     * Nota: en la fase 3 se agregará un if para no aceptar montos negativos.
     */
    public void depositar(double monto)
    {
        saldo = saldo + monto;
    }

    /**
     * Regresa el saldo actual (método con valor de retorno).
     */
    public double consultarSaldo()
    {
        return saldo;
    }
}
