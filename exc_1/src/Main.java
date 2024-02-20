//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int lanche1 = 10; // lanche da primeira hora
        int lanche2 = 4; // lanche da segunda hora
        int lanche3 = 2; // lanche da terceira hora

        int total = lanche1+lanche2+lanche3;
        float media = total/3.0f; // tem que colocar essa palhaçada de .0f para o float

        System.out.println("O total de lanches foi: " +total);

        System.out.println("A media de lanches foi: " +media);

    }
}