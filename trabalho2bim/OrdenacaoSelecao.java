/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalho2bim;

       import java.util.*;


/**
 *
 * @author Maria Isadora | Igor Gavazzoni
 */

public class OrdenacaoSelecao implements Vetor {

    @Override
    public void vetorrr() {
        Scanner adicionar = new Scanner(System.in);
        System.out.println("Informe quantos números o vetor terá:");
        int tamVetor = adicionar.nextInt();
        int[] vetor = new int[tamVetor];
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Informe o número que deseja adicionar na " + (i + 1) + " posição");
            vetor[i] = adicionar.nextInt();
        }
        System.out.println("Vetor original");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("posição [" + i + "] = " + vetor[i]);

        }
        long inicio = System.currentTimeMillis();
        for (int i = 0; i < vetor.length - 1; i++) {
            int pMenor = i;

            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[j] < vetor[pMenor]) {
                    pMenor = j;
                }
            }
            if (pMenor != i) {
                int aux = vetor[i];
                vetor[i] = vetor[pMenor];
                vetor[pMenor] = aux;
            }
        }
        long fim = System.currentTimeMillis();
        long tempoExecucao = fim - inicio;

        
        
        System.out.println("Vetor ordenado por Seleção: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("posicao [" + i + "] = " + vetor[i]);
        }
        System.out.println("Tempo de execução: "+tempoExecucao);
    }
}