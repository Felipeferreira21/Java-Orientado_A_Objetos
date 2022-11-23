public class Cliente {
    //Atributos
    private String nome;
    private int idade;
    private double rendaMensal;
    
    // Métodos
    
    void alteraNome(String nome){
        this.nome = nome;
    }
    String retornaNome(){
        return this.nome;
    }

    void alteraIdade(int idade){
        this.idade = idade;
    }
    int retornaIdade(){
        return this.idade;
    }

    void alterarRenda(double renda){
        this.rendaMensal = renda;
    }
    double retornaRenda(){
        return this.rendaMensal;
    }

    
}
