import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int contador = 0;
        MemoriaUSB memoriaUSB1 = new MemoriaUSB();
        MemoriaUSB memoriaUSB2 = new MemoriaUSB();
        MemoriaUSB memoriaUSB3 = new MemoriaUSB();

        memoriaUSB1.capacidade = 1;
        memoriaUSB1.nome = "HD Tb";

        Cliente cliente = new Cliente("juju", 1111111111);

//        // criando o pc 1 Positivo
//        cliente.computadors[0].marca = "Positivo";
//        cliente.computadors[0].preco = 3300;
//        cliente.computadors[0].sistemaOperacional.nome = "Ubuntu";
//        cliente.computadors[0].sistemaOperacional.tipo = 32;
//        cliente.computadors[0].hardwareBasico[0].nome = "Pentium Core i3";
//        cliente.computadors[0].hardwareBasico[0].capacidade = 2200;
//        cliente.computadors[0].hardwareBasico[1].nome = "Memoria RAM";
//        cliente.computadors[0].hardwareBasico[1].capacidade = 8;
//        cliente.computadors[0].hardwareBasico[2].nome = "HD - Gb";
//        cliente.computadors[0].hardwareBasico[2].capacidade = 500;
//
//        cliente.computadors[0].addMomeriaUSB(memoriaUSB1);

//        // criando o pc 2 Acer
//        cliente.computadors[1].marca = "Acer";
//        cliente.computadors[1].preco = 8800;
//        cliente.computadors[1].sistemaOperacional.nome = "Windows 8";
//        cliente.computadors[1].sistemaOperacional.tipo = 64;
//        cliente.computadors[1].hardwareBasico[0].nome = "Pentium Core i5";
//        cliente.computadors[1].hardwareBasico[0].capacidade = 3370;
//        cliente.computadors[1].hardwareBasico[1].nome = "Memoria RAM";
//        cliente.computadors[1].hardwareBasico[1].capacidade = 16;
//        cliente.computadors[1].hardwareBasico[2].nome = "HD - Tb";
//        cliente.computadors[1].hardwareBasico[2].capacidade = 1;
//
//        // criando o pc 3 Vaio
//        cliente.computadors[2].marca = "Vaio";
//        cliente.computadors[2].preco = 4800;
//        cliente.computadors[2].sistemaOperacional.nome = "Windows 10";
//        cliente.computadors[2].sistemaOperacional.tipo = 64;
//        cliente.computadors[2].hardwareBasico[0].nome = "Pentium Core i7";
//        cliente.computadors[2].hardwareBasico[0].capacidade = 4500;
//        cliente.computadors[2].hardwareBasico[1].nome = "Memoria RAM";
//        cliente.computadors[2].hardwareBasico[1].capacidade = 32;
//        cliente.computadors[2].hardwareBasico[2].nome = "HD - Tb";
//        cliente.computadors[2].hardwareBasico[2].capacidade = 2;


        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o codigo da promocao desejada: ");
        System.out.println("Promocoes 1 - 1; 2 - 2; 3 - 3");
        System.out.println("Qualquer outro numero para sair");
        int codigo;

        for (int i = 0; i < cliente.computadors.length; i++) {
            codigo = entrada.nextInt();
            switch (codigo) {
                case 1:
                    // criando o pc 1 Positivo
                    cliente.computadors[i].marca = "Positivo";
                    cliente.computadors[i].preco = 3300;
                    cliente.computadors[i].sistemaOperacional.nome = "Ubuntu";
                    cliente.computadors[i].sistemaOperacional.tipo = 32;
                    cliente.computadors[i].hardwareBasico[0].nome = "Pentium Core i3";
                    cliente.computadors[i].hardwareBasico[0].capacidade = 2200;
                    cliente.computadors[i].hardwareBasico[1].nome = "Memoria RAM";
                    cliente.computadors[i].hardwareBasico[1].capacidade = 8;
                    cliente.computadors[i].hardwareBasico[2].nome = "HD - Gb";
                    cliente.computadors[i].hardwareBasico[2].capacidade = 500;
                    cliente.computadors[i].addMomeriaUSB(memoriaUSB1);
                    contador++;
                    break;
                case 2:
                    cliente.computadors[i].marca = "Acer";
                    cliente.computadors[i].preco = 8800;
                    cliente.computadors[i].sistemaOperacional.nome = "Windows 8";
                    cliente.computadors[i].sistemaOperacional.tipo = 64;
                    cliente.computadors[i].hardwareBasico[0].nome = "Pentium Core i5";
                    cliente.computadors[i].hardwareBasico[0].capacidade = 3370;
                    cliente.computadors[i].hardwareBasico[1].nome = "Memoria RAM";
                    cliente.computadors[i].hardwareBasico[1].capacidade = 16;
                    cliente.computadors[i].hardwareBasico[2].nome = "HD - Tb";
                    cliente.computadors[i].hardwareBasico[2].capacidade = 1;
                    cliente.computadors[i].addMomeriaUSB(memoriaUSB2);
                    contador++;
                    break;
                case 3:
                    // criando o pc 3 Vaio
                    cliente.computadors[i].marca = "Vaio";
                    cliente.computadors[i].preco = 4800;
                    cliente.computadors[i].sistemaOperacional.nome = "Windows 10";
                    cliente.computadors[i].sistemaOperacional.tipo = 64;
                    cliente.computadors[i].hardwareBasico[0].nome = "Pentium Core i7";
                    cliente.computadors[i].hardwareBasico[0].capacidade = 4500;
                    cliente.computadors[i].hardwareBasico[1].nome = "Memoria RAM";
                    cliente.computadors[i].hardwareBasico[1].capacidade = 32;
                    cliente.computadors[i].hardwareBasico[2].nome = "HD - Tb";
                    cliente.computadors[i].hardwareBasico[2].capacidade = 2;
                    cliente.computadors[i].addMomeriaUSB(memoriaUSB3);
                    contador++;
                    break;
                default:
                     i += cliente.computadors.length;
                     break;
                }
        }

        for (int i = 0; i < contador; i++) {
            if (cliente.computadors[i] != null){
                cliente.computadors[i].mostrarPCConfigs();
                cliente.calculatotalCompra();
            }
            
        }

        System.out.println("total: " + cliente.calculatotalCompra());
    }
}