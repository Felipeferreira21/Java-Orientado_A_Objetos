package Aula2410;

public class Clinica {
    private String nome;
    private String endereço;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereço() {
        return endereço;
    }
    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }
    
    void realizarCirurgia(Animal a){
        System.out.println("Cirurgia realizada em: "+a.getEspecie());
    }
}
