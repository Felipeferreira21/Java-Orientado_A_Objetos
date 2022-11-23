public class FuncionarioTeste {
    /**
     * @param args
     */
    public static void main(String args[]){
        // Instanciar a classe
        /*Funcionario f = new Funcionario();
        f.nome = "Felipe Ferreira";
        f.cargo = "C.T.O";
        f.salario = 2000;
        f.datadenascimento = "21/08/2002";

        f.imprimeDados();
        System.out.println("Salario aumentado: "+
        f.aumentarSalario(250.08));
        f.imprimeDados(); 
        */
        Rendimento i = new Rendimento(1, 70000);
        i.montante = i.CalcularRendimento(12*10);
        System.out.println("Rendimento em 12 meses: " + 
            i.montante);


    }
    
}
