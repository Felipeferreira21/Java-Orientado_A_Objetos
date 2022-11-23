public class Rendimento {
    //atributos
    double montante;
    double capital;
    Double taxa = 0.005; 


    Rendimento(double taxa, double capital){
        this.capital = capital;
        this.taxa = taxa/100;
    
    }

    //metodos
    double CalcularRendimento(int meses){
        double tax = 1 + this.taxa;
        tax = Math.pow(tax, meses);
        return this.capital * tax;
    }

    
}
