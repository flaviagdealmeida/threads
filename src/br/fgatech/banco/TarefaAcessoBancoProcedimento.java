package br.fgatech.banco;

public class TarefaAcessoBancoProcedimento implements Runnable {
    private PoolDeConexoes pool;
    private GerenciadorDeTransacoes tx;


    public TarefaAcessoBancoProcedimento(PoolDeConexoes pool, GerenciadorDeTransacoes tx) {
        this.pool = pool;
        this.tx = tx;
    }

    @Override
    public void run() {
        //se invreter a ordem pode gerar um deadlock
        synchronized (pool) {
            System.out.println("gerando a conexao");
            pool.getConnection();

            synchronized (tx) {
                System.out.println("começando a tx");
                tx.begin();
            }
        }
    }
}
