package br.fgatech.banco;

public class TarefaAcessarBanco implements Runnable {

    private PoolDeConexoes pool;
    private GerenciadorDeTransacoes tx;

    public TarefaAcessarBanco(PoolDeConexoes pool, GerenciadorDeTransacoes tx) {
        this.pool = pool;
        this.tx = tx;
    }

    @Override
    public void run() {

        synchronized (pool) {
            System.out.println("peguei a chave do pool");
            pool.getConnection();

            synchronized (tx) {
                System.out.println("gerenciando o tx");
                tx.begin();
            }
        }
    }
}