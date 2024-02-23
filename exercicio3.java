import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int np3, npa;

        System.out.println("Digite a nota NPA: ");
        npa = entrada.nextInt();

        if(npa >= 60){
            System.out.println("Deu bom");
        } else {
            System.out.println("Deu ruim");

            System.out.println("Nota NP3: ");

            np3 = entrada.nextInt();

            if((np3+npa)/2 >= 50){
                System.out.println("Deu bom");
            }else {
                System.out.println("Ate semestre q vem");
            }
        }
        entrada.close();

    }
}
