package exemplo02;

public class PrincipalImc {

    public static void main(String[] args) {

        CalcularImc calcularImc = new CalcularImc();
        Paciente paciente = new Paciente();
        paciente.peso = 65.00;
        paciente.altura = 1.65;

        IndiceMassaCorporal indiceMassaCorporal = calcularImc.calcular(paciente);

        indiceMassaCorporal.imprimirResultado();

    }

}
