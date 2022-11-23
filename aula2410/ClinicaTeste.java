package Aula2410;

public class ClinicaTeste {
    public static void main(String[] args){
        Cachorro boris = new Cachorro();
        boris.setDataDeNascimento("10/09/2022");
        boris.setEspecie("Canina");
        boris.setGenero("Familiares");
        boris.setRaça("Dalmata");
        boris.setTipoSanguineo("SRD");
    
        Gato tom = new Gato();
        tom.setCorDoPelo("Cinza");
        tom.setDataDeNascimento("21/08/2017");
        tom.setEspecie("Felino");
        tom.setGenero("Felix");
        tom.setTipoSanguineo("O-");

        Clinica c = new Clinica();
        c.setEndereço("Rua da Floresta");
        c.setNome("Vet Feliz");

        c.realizarCirurgia(tom);
        c.realizarCirurgia(boris);
    }
    
}
