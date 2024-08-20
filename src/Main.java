public class Main {
    public static void main(String[] args) {



        Produto novo_produto = new Produto ("Chocolate Lacta", "R$ 4,99", 4, 2);

        System.out.println("Preço: " + novo_produto.ver_preco());
        System.out.println("Quantidade em Estoque: " + novo_produto.verificar_estoque());

//        // Criando um objeto da classe Carro
//        Carro meu_carro = new Carro("Volkswagen", "Fusca", 1950);
//        Carro carro_alexandre = new Carro ("Toyotta", "Corolla", 2025);
//        Carro carro_joao = new Carro ("Fiat", "Uno", 1980);
//
//        //System.out.println(meu_carro.ligar());
//        System.out.print(carro_alexandre.ligar());



//
//        // Testando os métodos da classe
//        System.out.println(meuCarro.ligar());
//        System.out.println(meuCarro.status());
//        System.out.println(meuCarro.desligar());
//        System.out.println(meuCarro.status());


        }
    }