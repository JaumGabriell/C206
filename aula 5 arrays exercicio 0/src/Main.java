//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // criando a cantina
        Cantina cantina1 = new Cantina();

        // criando os salgados
        Salgados salgado1 = new Salgados();
        Salgados salgado2 = new Salgados();
        Salgados salgado3 = new Salgados();

        // nome dos salgados
        salgado1.nome = "coxinha";
        salgado2.nome = "esfirra";
        salgado3.nome = "pizza";

        cantina1.addSalgado(salgado1);
        cantina1.addSalgado(salgado2);
        cantina1.addSalgado(salgado3);

        cantina1.mostrarInfo();




    }
}