package exemplo04;

public class CadastroVisitante {

    public static final int TEMPO_EXPIRACAO_MINIMA = 1;

    /*
     * Overload ou sobrecarga de metodos, e quando o metodo tem o mesmo nome com assinatura diferente
     * as propriedades no parametro nao podem ser do mesmo tipo
     *
     * */
    public void cadastrarVisitante(Visitante visitante) {
        this.cadastrarVisitante(visitante, TEMPO_EXPIRACAO_MINIMA);
    }

    public void cadastrarVisitante(Visitante visitante, int tempoExpiracaoEmMeses) {

        //Não pode mais atribuir valores, ao ser definida como final
        final int tempoExpiracao = tempoExpiracaoEmMeses * 30;

        //tempoExpiracao = 10; //Error

        System.out.printf(visitante.nome + " seu tempo de expiração em meses é de %d%n", tempoExpiracao);
    }

}
