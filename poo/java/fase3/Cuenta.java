/**
 * MiniBanco POO - Fase 3: control de flujo
 * depositar y retirar validan con if / else y regresan boolean.
 *
 * @author Erick Domínguez Del Prado
 * @version Fase 3 - noviembre 2026
 */
public class Cuenta
{
    // Atributos privados: el estado de cada objeto
    private String titular;
    private int numero;
    private double saldo;

    // Constructor de 2 parámetros: la cuenta nace con saldo 0
    public Cuenta(String titular, int numero)
    {
        this.titular = titular;
        this.numero = numero;
        this.saldo = 0;
    }

    // Constructor de 3 parámetros: reutiliza el de 2 con this(...)
    public Cuenta(String titular, int numero, double saldoInicial)
    {
        this(titular, numero);
        this.saldo = saldoInicial;
    }

    // Getters: leer el estado sin poder cambiarlo
    public String getTitular()
    {
        return titular;
    }

    public int getNumero()
    {
        return numero;
    }

    public double getSaldo()
    {
        return saldo;
    }

    // Setter solo del titular: numero y saldo no tienen setter
    public void setTitular(String titular)
    {
        this.titular = titular;
    }

    // Solo acepta montos positivos. Regresa true si se aplicó.
    public boolean depositar(double monto)
    {
        if (monto > 0)
        {
            saldo = saldo + monto;
            return true;
        }
        else
        {
            System.out.println("Monto inválido: el depósito debe ser mayor que 0.");
            return false;
        }
    }

    // Tres caminos: monto inválido, fondos insuficientes o retiro aplicado.
    public boolean retirar(double monto)
    {
        if (monto <= 0)
        {
            System.out.println("Monto inválido: el retiro debe ser mayor que 0.");
            return false;
        }
        else if (monto > saldo)
        {
            System.out.println("Fondos insuficientes. Tu saldo es $" + saldo);
            return false;
        }
        else
        {
            saldo = saldo - monto;
            return true;
        }
    }

    // Calcula mes por mes cuánto tendrías con interés compuesto.
    public double proyectarSaldo(int meses, double tasaMensual)
    {
        double proyectado = saldo;
        for (int mes = 1; mes <= meses; mes++)
        {
            proyectado = proyectado + proyectado * tasaMensual;
            System.out.println("  Mes " + mes + ": $" + proyectado);
        }
        return proyectado;
    }
}
