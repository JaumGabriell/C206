package Funcionalidade;

import Exceções.Checked;
import Funcionalidade.RedeSocial;
import java.util.HashSet;

import java.util.HashSet;
import java.util.Set;

public class Usuario {
    private String nome;
    private String email;
    private Set<RedeSocial> redesHash = new HashSet<RedeSocial>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<RedeSocial> getRedesHash() {
        return redesHash;
    }

    public void setRedesHash(Set<RedeSocial> redesHash) {
        this.redesHash = redesHash;
    }

    public Usuario(String nome, String email, RedeSocial[] redesSociais) throws Checked {
        if(nome == null || email == null){
            throw new Checked("Os campos de cadastro não podem ser nulos");
        } else {
            this.nome = nome;
            this.email = email;
            for (int i = 0; i < redesSociais.length; i++) {
                if (redesSociais[i] != null) {
                    redesHash.add(redesSociais[i]); // add a rede social passada por parametro pro construtor para o hashSet
                }
            }
        }
    }

    public void mostrarRedesHash(){
        System.out.println("[");
        for(RedeSocial redeSocial: redesHash){
            System.out.println(" " );
        }
    }
}
