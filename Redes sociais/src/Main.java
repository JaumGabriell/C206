import Apps.Facebook;
import Apps.GooglePlus;
import Apps.Instagram;
import Apps.Twitter;
import Exceções.Checked;
import Exceções.UnChecked;
import Funcionalidade.RedeSocial;
import Funcionalidade.Usuario;

public class Main {
    public static void main(String[] args) throws Checked {
        RedeSocial[] redeSocials = new RedeSocial[3];

        try {
            GooglePlus googlePlus = new GooglePlus("senha123", 154);
            Twitter twitter = new Twitter("12345678", 88);
            redeSocials[0] = twitter;
            redeSocials[1] = googlePlus;
            googlePlus.compartilhar();
            googlePlus.fazStreaming();
        } catch (UnChecked e){
            System.out.println(e.getMessage());
        }

        Usuario usuario = new Usuario("João Gabriel", "juju.gaga@gec.inatel.br", redeSocials);
        System.out.println("Informações do usuário:");
        System.out.println("Nome: " + usuario.getNome());
        System.out.println("Email: " + usuario.getEmail() + "\n");
        redeSocials[0].curtirPublicacao();
        redeSocials[1].postarComentario();
        redeSocials[0].postarVideo();
        redeSocials[1].postarFoto();


    }
}