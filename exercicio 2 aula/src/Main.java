import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o número de lanches da primeira hora: ");
        int lanche1 = entrada.nextInt();
        System.out.println("Digite o n de lanches da segunda hora: ");
        int lanche2 = entrada.nextInt();
        System.out.println("Digite o n de lanches da terceira hora: ");
        int lanche3 = entrada.nextInt();

        int total = lanche1+lanche2+lanche3;
        float media = total/3.0f; // tem que colocar essa palhaçada de .0f para o float

        System.out.println("O total de lanches foi: " +total);

        System.out.println("A media de lanches foi: " +media);

        entrada.close();

    }
}