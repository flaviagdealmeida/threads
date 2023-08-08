package br.fgatech.lista;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal {
    public static void main(String[] args) throws InterruptedException {

        //uma lista comum não é sincronizada e não é capaz de suportar essa aplicação
        //List<String> lista = new ArrayList<>();
        //List<String> lista = Collections.synchronizedList(new ArrayList<String>());

        Lista lista = new Lista();


        for (int i = 0; i < 10; i++) {
            new Thread(new TarefaAdicionarElemento(lista, i)).start();
        }

        new Thread(new TarefaImprimir(lista)).start();

//        Thread.sleep(2000);
//
//        for (int i = 0; i < lista.size(); i++) {
//            System.out.println(i + " - " + lista.get(i));
//        }
    }
}
