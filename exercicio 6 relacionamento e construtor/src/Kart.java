public class Kart {
    String nome;

    Piloto piloto; // "Colocando" um piloto no kart

    Motor motor; // "Colocando" um motor no kart

    public Kart(){
        motor = new Motor();
    }

    void pular(){
        System.out.println("Kart " + nome + " esta pulando");

    }

    void soltarTurbo(){

        System.out.println("Kart " + nome + " esta soltando turbo");

    }

    void fazerDrift(){
        System.out.println("Kart " + nome + " esta fazendo drift");

    }

}
