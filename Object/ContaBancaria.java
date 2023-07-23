package Object;

public class ContaBancaria
{
    private int conta;
    private String nomeTitular;
    private double depositoInicial;
    private double saldo;

    private final double taxa = 5.0;


    ContaBancaria(int conta, String nomeTitular)
    {
        this.conta = conta;
        this.nomeTitular = nomeTitular;
        this.saldo = 0.0;
    }

    ContaBancaria(int conta, String nomeTitular, double depositoInicial)
    {
        this.conta = conta;
        this.nomeTitular = nomeTitular;
        this.depositoInicial = depositoInicial;
        this.saldo = this.depositoInicial;
    }

    public void depositar(double deposito)
    {
        if (deposito > 0) {
            this.saldo += deposito;
        } else {
            System.out.println("Valor de depósito inválido");
        }

    }

    public void sacar(double saque)
    {
        if (saque <= this.saldo) {
            this.saldo -= Math.abs( saque + this.taxa );
        } else {
            System.out.println("Saldo insuficiente");
        }
    }


    public String toString()
    {
        return "Account " + this.conta
                          + ", Holder " + this.nomeTitular
                          + ", Balance: $ " + String.format("%.2f", this.saldo);
    }



}
