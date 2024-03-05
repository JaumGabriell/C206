//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Personagem personagem1 = new Personagem();
        personagem1.nome = "Juju";

        Arma arma1 = new Arma();
        arma1.nome = "Juju's Sword";

        personagem1.arma = arma1;

    }
}