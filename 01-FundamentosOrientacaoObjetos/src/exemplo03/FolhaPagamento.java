package exemplo03;

public class FolhaPagamento {

    double calcularSalario(ContratoTrabalho contratoTrabalho, int horasTrabalhadas, int horasExtras){
        double resultadoFinal = getResultadoFinal(contratoTrabalho, horasTrabalhadas, horasExtras);

        resultadoFinal = verificaSeTemAdicional(contratoTrabalho, resultadoFinal);

        return resultadoFinal;
    }

    private static double verificaSeTemAdicional(ContratoTrabalho contratoTrabalho, double resultadoFinal) {
        if(contratoTrabalho.temAdicional && contratoTrabalho.funcionario.quantidadeFilhos > 0){
             resultadoFinal += (resultadoFinal * 0.10);
        }
        return resultadoFinal;
    }

    private static double getResultadoFinal(ContratoTrabalho contratoTrabalho, int horasTrabalhadas, int horasExtras) {
        double resultadoHora = horasTrabalhadas * contratoTrabalho.valorHora;
        double resultadoHoraExtra = horasExtras * contratoTrabalho.valorHoraExtra;

        return resultadoHora + resultadoHoraExtra;
    }

}
