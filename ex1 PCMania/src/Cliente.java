public class Cliente {
    public String nome;
    public long CPF;
    Computador[] computadors = new Computador[10];

    public Cliente(String nome, long CPF) {
        for (int i = 0; i < computadors.length; i++) {
            if (computadors[i] == null){
                computadors[i] = new Computador();
            }
        }
        this.nome = nome;
        this.CPF = CPF;
    }

    public float calculatotalCompra(){
        float total = 0;
        for (int i = 0; i < computadors.length; i++) {
            total += computadors[i].preco;
        }
        return total;
    }

}
