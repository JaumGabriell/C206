public class Computador {
    public String marca;
    public float preco;

    SistemaOperacional sistemaOperacional;

    HardwareBasico[] hardwareBasico = new HardwareBasico[10];

    MemoriaUSB memoriaUSB;

    public Computador() {
        this.sistemaOperacional = new SistemaOperacional();
        this.hardwareBasico[0] = new HardwareBasico();
        this.hardwareBasico[1] = new HardwareBasico();
        this.hardwareBasico[2] = new HardwareBasico();
    }

//    public Computador(String marca, float preco) {
//        this.marca = marca;
//        this.preco = preco;
//    }


    public void addMomeriaUSB(MemoriaUSB musb){
        memoriaUSB = musb;
    }


    public void mostrarPCConfigs(){
        System.out.println(marca);
        System.out.println(preco);
        System.out.println(this.memoriaUSB.nome);
        System.out.println(this.memoriaUSB.capacidade);
        System.out.println(this.sistemaOperacional.nome);
        System.out.println(this.sistemaOperacional.tipo);
        for (int i = 0; i < hardwareBasico.length; i++) {
            if (hardwareBasico[i] != null)
            {
                System.out.println(hardwareBasico[i].capacidade);
                System.out.println(hardwareBasico[i].nome);
            }
            
        }
    }
}
