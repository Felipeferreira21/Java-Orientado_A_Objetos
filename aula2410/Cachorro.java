package Aula2410;

public class Cachorro extends Mamifero {
    private String raça;

    public String getRaça() {
        return raça;
    }

    public void setRaça(String raça) {
        this.raça = raça;
    }

    void latir(){
        System.out.println("Au! Au!");
    }
}
