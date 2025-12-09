import exemplo04.CadastroVisitante;
import exemplo04.Visitante;

import static java.lang.IO.print;
import static java.lang.IO.println;

void main() {

    Visitante visitante = new Visitante();
    CadastroVisitante cadastroVisitante = new CadastroVisitante();

    visitante.nome = "edson";
    visitante.idade = 17;

    print(visitante.menorDeIdade());

    println();

    cadastroVisitante.cadastrarVisitante(visitante, 10); //300

    println();

    cadastroVisitante.cadastrarVisitante(visitante); //30

}
