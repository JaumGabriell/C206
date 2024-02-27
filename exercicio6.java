import java.util.Random;
import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int n;

        n = entrada.nextInt();

        Random rand = new Random();

        int numeroErrado;

        numeroErrado = rand.nextInt(10) + 1;

        if(n > numeroErrado)
        {
            System.out.println("numero maior que o gerado");
        }else {
            System.out.println("numero menor que o gerado");
        }

    }
}
