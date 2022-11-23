public class Homen extends Mamifero {
    public String corPele;

    void andar(){
        System.out.println("Homen andando");
    }
void mostrarAtributos(){
    super.mostrarAtributos();
    System.out.println("tipo sanguineo"+this.tipoSanguineo);
    System.out.println("Cor da Pele"+this.corPele);
}

}

