public class PessoaTeste {
    public static void main(String[] args){
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();


        /*p1.nacionalidade = "Brasileiro";
        p2.nacionalidade = "BR";*/
        Pessoa.nacionalidade = "Brasileiro";


        /*System.out.println("pessoa 1:"+p1.nacionalidade);
        System.out.println("pessoa 2:"+p2.nacionalidade);*/
        //System.out.println("Pessoa: "+p1.nacionalidade);
        Pessoa.mostranacionalidade();
        Pessoa.alterarnacionalidade("Japones");
        Pessoa.mostranacionalidade();
    }
}
