public class ContaCorrenteTeste {

    public static void main(String args[]){
        ContaCorrente cc = new ContaCorrente(1500);
        //cc.saldo = 1000;
        System.out.println("Retorno Esperado: "+ cc.retornoInvestimento());
        System.out.println("Retorno Esperado Taxa: "+ cc.retornoInvestimento(15.36));
        System.out.println("Retorno Esperado Taxa e Tempo: "+ cc.retornoInvestimento(8.5, 15));
        //cc.metodoNormal();
        //cc.metodoNormal(5);

        ContaCorrente cc2 = new ContaCorrente(5000, 500);
        System.out.println("Retorno Esperado: "+ cc2.retornoInvestimento());
        System.out.println("Retorno Esperado Taxa: "+ cc2.retornoInvestimento(15.36));
        System.out.println("Retorno Esperado Taxa e Tempo: "+ cc2.retornoInvestimento(8.5, 15));
        
        System.out.println("============== TESTE PIX ==============");
        System.out.println("Saldo Conta CC: "+cc.saldo);
        System.out.println("Saldo Conta CC2: "+cc2.saldo);
        cc.pix(cc2, 500);
        System.out.println("Saldo Conta CC: "+cc.saldo);
        System.out.println("Saldo Conta CC2: "+cc2.saldo);
        cc2.pix(cc, 1000);
        System.out.println("Saldo Conta CC: "+cc.saldo);
        System.out.println("Saldo Conta CC2: "+cc2.saldo);
    }
}

