
//ultima aula 5.13

public class Principal {

    public static void main(String[] args) {

        //Cria as instâncias
        Carro bmw = new Carro();
        Carro mercedes = new Carro();

        Pessoa joao = new Pessoa();
        Pessoa maria = new Pessoa();

        //Atribui valores as propriedades
        joao.nome = "joao";
        joao.document = "01292922920";
        joao.idade = 27;

        maria.nome = "maria";
        maria.document = "01292922920";
        maria.idade = 30;

        bmw.modelo = "BMW";
        bmw.cor = "azul";
        bmw.anoFabricacao = 2004;
        bmw.fabricante = "bmw";
        bmw.proprietario = joao;

        mercedes.modelo = "Mercedes Benz";
        mercedes.cor = "preto";
        mercedes.anoFabricacao = 2025;
        mercedes.fabricante = "mercedes";
        mercedes.proprietario = maria;

        //Imprimi os valores
        System.out.println("Carro01: " + bmw.modelo + " proprietario: " + bmw.proprietario.nome);
        System.out.println("Carro02: " + mercedes.modelo + " proprietario: " + mercedes.proprietario.nome);

    }
}
