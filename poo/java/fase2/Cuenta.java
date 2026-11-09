/**
 * MiniBanco POO - Fase 2: construcción y alteración de objetos
 * Los atributos son private: solo esta clase puede tocarlos.
 *
 * @author Erick Domínguez Del Prado
 * @version Fase 2 - noviembre 2026
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

    // Única forma de cambiar el saldo. Aún no valida (fase 3).
    public void depositar(double monto)
    {
        saldo = saldo + monto;
    }
}
