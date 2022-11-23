
public class Teste{
    public static void main(String[] args) {
        Gerente g = new Gerente();
        g.setSalario(18000);
        System.out.println("Salário do Gerente: " + g.getSalario() + " reais");
        g.bonificacao(0.10);
        System.out.println("Novo salário do gerente: " + g.getSalario());
        

        Diretor d = new Diretor();
        d.setSalario(1200);
        System.out.println("Salaro de Diretor: "+ g.getSalario() + "reais");
        d.bonificacao(300);
        System.out.println("Novo salario do Diretor: " +d.getSalario() + "reais");
    }
} 