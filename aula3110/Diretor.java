
public class Diretor extends Funcionario {
    

    public void bonificacao(double valor){
        this.setSalario(this.getSalario() + valor);
    }
}
