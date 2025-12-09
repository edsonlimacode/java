import static java.lang.IO.println;

void main() {

    /*
    * O comparador == usado para compara dois tipos primitivos, e quando tipo for objeto compara a referencia.
    *
    * O comparador equals compara os valores de dois obejtos do mesmpo tipo, caso for tipos diferentes
    * sempre retorna falso
    * */

    //Primitivos
    int num = 10;
    int num2 = 10;

    println(num == num2); //true - compara o valor

    println();
    //Obejtos
    Integer num3 = 200; //cria uma referencia
    Integer num4 = 200; //cria uma referencia
    Short num5 = 200;

    println(num3 == num4); //false - compara a referencia se e a mesma.

    println();

    println(num3.equals(num4)); //true - equals compara o valor de 2 obejtos se sao iguais
    println(num3.equals(num5)); //false - equals retorna true apenas se os tipos tambem forem iguais.

    println();

    //solucao - converter para tipos primitivos
    println(num3.intValue() == num5.intValue());
}