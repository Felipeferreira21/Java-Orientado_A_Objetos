public class Funcionario{
    //Atributos
    String nome;
    String cargo;
    double salario;
    String datadenascimento;

    //Métodos
    void imprimeDados(){ 
        System.out.println("nome: "+this.nome);
        System.out.println("cargo: "+this.cargo);
        System.out.println("Salario: "+this.salario);
        System.out.println("Data de Nascimento"+this.datadenascimento);
    }
    double aumentarSalario(double valor){
        double porc = valor/this.salario;
        this.salario += valor;
        System.out.println("Salario aumentado com sucesso");
        return porc;
    }

}