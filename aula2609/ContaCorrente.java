class ContaCorrente{

    double saldo;
    double limite;

    ContaCorrente(double saldo){
        this.saldo = saldo;
    }

    ContaCorrente(double saldo, double limite){
        this.saldo = saldo;
        this.limite = limite;
        
    }
    double retornoInvestimento(){
        return this.saldo*1.1;
    }

    double retornoInvestimento(double taxa){
        return this.saldo*(1 + (taxa/100));
    }

    double retornoInvestimento(double taxa, int tempo){
        return this .saldo*Math.pow((1+ (taxa/100)), (double)tempo);
    }

    void metodoNormal(){
        System.out.println("Esse é método em seu formato normal");
    }

    void metodoNormal(int a){
        System.out.println("Esse é método com overload "+a);
    }

    void pix(ContaCorrente destino, double valor){
        //verificar saldo da conta de origem
        if(this.saldo >= valor){
            destino.saldo += valor;
            this.saldo -= valor;
        }else{
            System.out.println("Saldo Insuficiente");
        }
    }
}