public class clienteTeste {
    public static void main(String[] args){
        Cliente c1 = new Cliente();


    c1.alteraNome("João De Santos Cristo");
    c1.alteraIdade(32);
    c1.alterarRenda(0112358.13); 
    
    System.out.println("Nome: "+c1.retornaNome());
    System.out.println("Idade: "+c1.retornaIdade());
    System.out.println("Renda: "+c1.retornaRenda());
    


    }
}