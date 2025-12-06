package exemplo01;

public class Carro {

    String fabricante;
    String modelo;
    String cor;
    int anoFabricacao;
    double precoCompra;

    //Composição - atribui a variável de instância a classe exemplo01.Pessoa
    Pessoa proprietario;

     double calcularValorRevenda(){

        int tempoUsoEmAnos = calcularTempoDeUso();
        int vidaUtilEmAnos = 20;

        double valorRevenda = (precoCompra / vidaUtilEmAnos) * (vidaUtilEmAnos - tempoUsoEmAnos);

        if(valorRevenda < 0) {
            valorRevenda = 0;
        }

        return valorRevenda;
    }

    int calcularTempoDeUso(){
         return 2025 - anoFabricacao;
    }

    void imprimirResumo(){
        System.out.printf("Tempo de uso em anos: %d%n", this.calcularTempoDeUso());
        System.out.printf("Valor revenda %6.2f%n", this.calcularValorRevenda());
        System.out.println();
    }
}
