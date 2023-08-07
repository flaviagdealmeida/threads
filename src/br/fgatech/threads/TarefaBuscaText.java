package br.fgatech.threads;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TarefaBuscaText implements Runnable {
    private String file;
    private String nome;

    public TarefaBuscaText(String file, String nome) {
        this.file = file;
        this.nome = nome;
    }

    @Override
    public void run() {
        try {
            Scanner scanner= new Scanner(new File(file));
            int numeroLinha = 1;

            while(scanner.hasNextLine()){
                String linha = scanner.nextLine();

                if(linha.toLowerCase().contains(nome)){
                    System.out.println(file+ " - "+ numeroLinha + " - "+ linha);
                }

                numeroLinha++;
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
