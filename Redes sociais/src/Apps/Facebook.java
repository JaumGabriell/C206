package Apps;
import Funcionalidade.RedeSocial;
import Interface.Compartilhamento;
import Interface.VideoConferencia;

public class Facebook extends RedeSocial implements VideoConferencia, Compartilhamento {
    public Facebook(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    @Override
    public void compartilhar() {
        System.out.println("Compartilhando fotos no Facebook");
    }

    @Override
    public void fazStreaming() {
        System.out.println("Fazendo streaming no Facebook");
    }
}
