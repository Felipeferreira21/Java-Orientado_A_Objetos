
public class teste1 {
    public static void main(String args[]){
        Pessoa paulinho = new Pessoa();
        paulinho.nome = "Paulo Henrique Felix";
        paulinho.idade = 26;
        paulinho.altura = 1.61;
        paulinho.nacionalidade = "Irlandes Vegetariano";

        Pessoa rosinha = new Pessoa();
        rosinha.nome = "rosa maria";
        rosinha.idade = 50;   
        rosinha.altura = 1.55;
        rosinha.nacionalidade = "Americana";

        Carro corsa = new Carro();
        corsa.marca = "Chevrolet";
        corsa.modelo = "Corsa Sedan";
        corsa.ano = 2010;

        //rosinha.imprimirAtributo();
        corsa.imprimirAtributocarro();
        paulinho.imprimirAtributo();
        paulinho.crescer();
    }
}