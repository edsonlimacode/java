package exemplo04;

public class Visitante {

    //Ao usar o static e final, a propriedade vira uma constante não pode mais ser altrada
    static final int IDADE_MINIMA = 18;
    public int idade;
    public String nome;

    public boolean menorDeIdade(){
        return this.idade < IDADE_MINIMA;
    }

}
