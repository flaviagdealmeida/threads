package br.fgatech.banco;

public class PoolDeConexoes {

    public String getConnection(){
        System.out.println("Emprestando conexoes");

        try {
            Thread.sleep(5000);
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }

        return "connection";
    }
}
