class Pessoa{
    //Atributos
    String nome;
    double altura;
    static String nacionalidade;
    
    
    //metodos

    static void mostranacionalidade(){
        System.out.println("Nacionalidade");
        System.out.println(Pessoa.nacionalidade);

    }

    static void alterarnacionalidade(String nacionalidade){
        Pessoa.nacionalidade = nacionalidade;

    }



}