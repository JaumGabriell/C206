//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // criando os karts
        Kart kart1 = new Kart();
        kart1.nome = "Cavaquinho";

        Piloto piloto1 = new Piloto();
        piloto1.nome = "Jaum";

        kart1.piloto = piloto1;

        // atribuindo valores para a cilindrada e velocidadeMaxima
        kart1.motor.cilindradas = "150";
        kart1.motor.velocidadeMaxima = 70.5f;

        // acoes do kart
        kart1.fazerDrift();
        kart1.motor.mostraInfo();

        // acoes do pilot
        piloto1.soltaSuperPoder();







    }
}