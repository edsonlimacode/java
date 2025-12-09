import static java.lang.IO.print;
import static java.lang.IO.println;

void main() {

    //Todos os tipos primitivos, existe um wrapper.
    Byte by;
    Integer n;
    Short s;
    Long l;
    Float f;
    Double d;
    Boolean b;

    Integer numero = 20;
    Integer numero2 = Integer.valueOf("12");

    print(numero);
    println();
    print(numero2);
    println();


    print("-------------------------------");
    println();


    String nome = new String("edson");

    Integer numerico = Integer.valueOf(100); //cria um valor numerico 100

    //longValue(), intValue() e etc... extrai o valor para o tipo primitivo

    Long numeroLong = numerico.longValue(); //converte para long

    Integer numerico2 = numeroLong.intValue(); //converter para int

    Short numericoShort = numerico2.shortValue(); //converte para short

    //boxing e unboxing
    Integer dias = 30; //boxing - embrula sem precisar do value.of() ja faz automatico
    int diasTotal = dias; //unboxing - extrai o valor sem precisar do intValue()

    println(numeroLong);
    println(numerico2);
    println(numericoShort);
    println("meu nome: " + nome);

}