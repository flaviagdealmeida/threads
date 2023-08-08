package br.fgatech.banco;

public class PrincipalBanco {

    public static void main(String[] args) {
        GerenciadorDeTransacoes tx = new GerenciadorDeTransacoes();
        PoolDeConexoes pool = new PoolDeConexoes();

        new Thread(new TarefaAcessarBanco(pool, tx)).start();
        new Thread(new TarefaAcessoBancoProcedimento(pool, tx)).start();


    }
}
