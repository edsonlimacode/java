package exemplo03;

public class PrincipalTrabalho {

    public static void main(String[] args) {

        FolhaPagamento folhaPagamento = new FolhaPagamento();
        Funcionario pedro = new Funcionario();
        ContratoTrabalho contratoTrabalho = new ContratoTrabalho();

        pedro.nome = "Pedro";
        pedro.quantidadeFilhos = 2;

        contratoTrabalho.valorHora = 50.00;
        contratoTrabalho.valorHoraExtra = 10.00;
        contratoTrabalho.funcionario = pedro;
        contratoTrabalho.temAdicional = true;

        double salario = folhaPagamento.calcularSalario(contratoTrabalho, 8, 2);
        System.out.println(salario);

    }
}
