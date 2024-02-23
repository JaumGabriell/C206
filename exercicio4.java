import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int n; // número de alunos

        System.out.println("Digite a quantidade de alunos: ");

        n = entrada.nextInt();

        switch (n){
            case 10:
                System.out.println("Sala I - 16");
                break;
            case 20:
                System.out.println("Sala I - 16");
                break;
            case 30:
                System.out.println("Sala I - 22");
                break;
            default:
        }

        entrada.close();
    }
}
