public class Teste {
    public static void main(String args[]){
        Homen juca = new Homen();
        juca.nome = "Jucanalha";
        juca.idade = 24;
        juca.corPele = "Pardo";
        juca.tipoSanguineo = "AB+";
        juca.andar();

        Cachorro boris = new Cachorro();
        boris.nome = "Boris Milo";
        boris.idade = 1;
        boris.tipoSanguineo = "DEA4";
        boris.corPelo = "Branco com bolinhas pretas";

        Beijaflor piupiu = new Beijaflor();
        piupiu.nome = "Beija Flor";
        piupiu.idade = 2;
        piupiu.corOlhos = "Azul";
        piupiu.corPena = "Rosa";

        piupiu.mostrarAtributos();
    }
    
}
