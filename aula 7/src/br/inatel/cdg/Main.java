package br.inatel.cdg;

public class Main {
    public static void main(String[] args) {
        Conta conta1 = new Conta(1,500,700);
        conta1.clientes[0].setNome("Juju do gaga");
        conta1.clientes[0].setCpf(111111111);

        conta1.deposita(100);

        //conta1.sacar(700);

        System.out.println(conta1.getSaldo());
    }
}