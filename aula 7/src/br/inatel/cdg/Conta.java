package br.inatel.cdg;

public class Conta {
    private int numero;
    private float saldo;
    private float limite;

    Cliente[] clientes = new Cliente[10];

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    public Conta(int numero, float saldo, float limite) {
        this.numero = numero;
        this.saldo = saldo;
        this.limite = limite;
        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i] == null){
                clientes[i] = new Cliente();
            }
        }
    }

    public void sacar(float quantia){
        if (this.saldo > quantia)
        {
            this.saldo -= quantia;
            System.out.println("saldo realizado com sucesso");
        }else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void deposita(float quantia){
        if (quantia > 0){
            this.saldo += quantia;
            System.out.println("Deposito realizado com sucesso");
        }else {
            System.out.println("Quantia invalida");
        }

    }
}
