
public class Pessoa{
    //atributos
    String nome;
    int idade;
    double altura;
    String nacionalidade;

    //metodos
    void andar(){
        System.out.println("A pessoa esta andando");
    }
    void trabalhar(){
        System.out.println("A pessoa andando");
    }
    void comer(){ 
        System.out.println("A pessoa esta comendo");
    }
    void crescer(){
        if(this.altura <= 1.8){
            this.altura += 0.10;
        }else{
        System.out.println("Essa pessoa não pode crescer mais");
        }
    }
        
    void imprimirAtributo(){ 
        System.out.println("Nome: "+this.nome);
        System.out.println("Idade: "+this.idade);
        System.out.println("Altura: "+this.altura);
        System.out.println("Nacionalidade: "+this.nacionalidade);

    }
}