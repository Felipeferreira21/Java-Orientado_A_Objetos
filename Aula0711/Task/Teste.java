package Aula0711.Task;

public class Teste {
    public static void main(String[] args){
        Funcionario f = new Funcionario();
        try {
            f.calcularSalario(-50);
        } catch (IllegalArgumentException e){
            System.out.println("Houve um Erro ao executar");
            System.out.println(e);
        }
    }
}
