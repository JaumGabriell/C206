import java.util.Random;
import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Random rand = new Random();

        int numeroErrado;

        numeroErrado = rand.nextInt( 10) + 1;

        System.out.println(numeroErrado);

        int n; // entrada

        n = entrada.nextInt();

        if(n == numeroErrado)
        {
            System.out.println("Adivinhou");
        }else {
            System.out.println("errou");
        }


    }
}
