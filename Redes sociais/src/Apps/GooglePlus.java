package Apps;

import Funcionalidade.RedeSocial;
import Interface.Compartilhamento;
import Interface.VideoConferencia;

public class GooglePlus extends RedeSocial implements Compartilhamento, VideoConferencia {
    public GooglePlus(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    @Override
    public void fazStreaming() {
        System.out.println("Fazendo video conferencia no GooglePlus");
    }

    @Override
    public void compartilhar() {
        System.out.println("Compartilhando videos no GooglePlus");

    }
}
