/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap05;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author brste
 */
public class BuscaBinaria {

    public static void main(String[] args) {
        int[] vect = new int[10000000];
        for (int i = 0; i < vect.length; i++) {
            vect[i] = (int) (Math.random() * 10000000);
        }
        int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor a ser buscado."));

        String r = "Valor nao encontrado.";

        for (int i = 0; i < vect.length; i++) {
            if (vect[i] == valor) {
                r = "Valor encontrado na posicao: " + i;
                break;
            }
        }
        System.out.println(r);
        Arrays.sort(vect);
        int posicao = Arrays.binarySearch(vect, valor);
        System.out.println("Nova posicao apos ordenacao: " + posicao);
    }
}
