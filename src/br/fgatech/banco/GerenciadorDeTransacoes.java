package br.fgatech.banco;

public class GerenciadorDeTransacoes {

    public void begin(){
        System.out.println("Começando a transação");

        try {
            Thread.sleep(5000);
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }
    }

}
