package Aula0711.Task;

import Aula0711.Domain.Pessoa;

public class Funcionario extends Pessoa {
    private String cargo;
    private double salario;

    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    


    public void calcularSalario(double valor){
        if (valor < 0){
            IllegalArgumentException erro = new IllegalArgumentException();
            throw erro;
        }else{
            this.salario = this.getIdade()* valor;
        }



        this.salario = this.getIdade()* valor;
        
        System.out.println(f.toString());
    }

}
