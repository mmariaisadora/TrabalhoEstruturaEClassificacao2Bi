/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalho2bim;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class OrdenacaoBolha implements Vetor {
    @Override
    public void vetorrr() {
        Scanner adicionar = new Scanner(System.in);
        System.out.println("Informe quantos números o vetor terá:");
        int tamVetor = adicionar.nextInt();
        int[] vetor = new int[tamVetor];
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Informe qual número deseja adicionar na " + (i + 1) + " posição");
            vetor[i] = adicionar.nextInt();
        }
        boolean houveTroca = true;
        System.out.println("Vetor original: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("posição [" + i + "] = " + vetor[i]);
        }
        long inicio = System.currentTimeMillis();
        while (houveTroca) {
            houveTroca = false;

            for (int i = 0; i < vetor.length - 1; i++) {
                if (vetor[i] > vetor[i + 1]) {
                    int aux = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = aux;
                    houveTroca = true;
                }
            }
        }
        long fim = System.currentTimeMillis();
        long tempoExecucao = fim - inicio;
        
        System.out.println("Vetor ordenado por BubbleSort: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("posição [" + i + "] = " + vetor[i]);
        }
        System.out.println("Tempo de execução: "+tempoExecucao);
    }
}