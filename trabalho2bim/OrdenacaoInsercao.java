/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalho2bim;

import java.util.Scanner;

/**
 *
 * @author Maria Isadora | Igor Gavazzoni
 */
public class OrdenacaoInsercao implements Vetor {
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
        int valor, j;
        System.out.println("Vetor original: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("posição [" + i + "] = " + vetor[i]);

        }
        long inicio = System.currentTimeMillis();
        for(int i = 1; i < vetor.length; i++){
            valor = vetor[i];
            
            for(j = i - 1;  (j >= 0 && vetor[j] > valor) ; j-- ){
                
                vetor[j+1] = vetor[j];
                
            }
            vetor[j+1] = valor;
        }
        long fim = System.currentTimeMillis();
        long tempoExecucao = fim - inicio;
        
        System.out.println("Vetor ordenado por Inserção:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("posição [" + i + "] = " + vetor[i]);

        }
        System.out.println("Tempo de execução: "+tempoExecucao);
    }
}
