/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.trabalho2bim;

import javax.swing.JOptionPane;
import java.util.Scanner;

/**
 *
 * @author Maria Isadora | Igor Gavazzoni
 */
public class Trabalho2Bim {

    
       public static void main(String[] args) {
        Vetor vetorBolha = new OrdenacaoBolha();
        Vetor vetorInsercao = new OrdenacaoInsercao();
        Vetor vetorSelecao = new OrdenacaoSelecao();
       
        int opcao = -1;
        int vetor[];
        while(opcao != 0 ){
            opcao = Integer.parseInt(JOptionPane.showInputDialog(
                    "Como você gostaria de ordenar o vetor? \n "+
                    "1 - Ordenação por BubbleSort\n" +
                    "2 - Ordenação por Inserção \n" +
                    "3 - Ordenação por Seleção \n" +
                    "0 - Sair"));
                             
            switch (opcao) {
                case 1:
                    vetorBolha.vetorrr();
                    break;
                case 2:
                    vetorInsercao.vetorrr();
                    break;    
                case 3:
                vetorSelecao.vetorrr();                
                    break;
                default:
                    break;
            }
        }
    }
}
        
      