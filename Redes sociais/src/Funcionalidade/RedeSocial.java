package Funcionalidade;

import Exceções.UnChecked;

public abstract class RedeSocial {

    protected String senha;
    protected int numAmigos;

    public RedeSocial(String senha, int numAmigos) {

        if(numAmigos < 0){
            throw new UnChecked("Número de amigos não pode ser negativo!");
        } else {
            this.senha = senha;
            this.numAmigos = numAmigos;
        }
    }

    public void postarFoto(){
        System.out.println("Mostrando fotos");
    }

    public void postarVideo(){
        System.out.println("Postando videos");
    }

    public void postarComentario(){
        System.out.println("Postando comentarios");
    }

    public void curtirPublicacao(){
        System.out.println("Curtindo publicações");
    }
}
