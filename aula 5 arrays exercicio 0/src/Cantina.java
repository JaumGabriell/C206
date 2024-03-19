public class Cantina {
    String nome;
    Salgados[] salgados = new Salgados[3];

    public void addSalgado(Salgados novoSalgado){
        for (int i = 0; i < this.salgados.length; i++ )
        {
            if(this.salgados[i] == null){
            salgados[i] = novoSalgado;
            break;
        }
        }
    }

    public void mostrarInfo(){
        for (int i = 0; i < this.salgados.length; i++ )
        {
            System.out.println(this.salgados[i].nome    );
        }
    }
}
