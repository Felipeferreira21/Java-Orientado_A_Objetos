package Aula2410;

public class Gato extends Mamifero {
    
    private String corDoPelo;

    public String getCorDoPelo() {
        return corDoPelo;
    }

    public void setCorDoPelo(String corDoPelo) {
        this.corDoPelo = corDoPelo;
    }

    void miar(){
        System.out.println("Maiu!");
    }
}
