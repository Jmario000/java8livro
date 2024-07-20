/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap05;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author brste
 */
public class ArrayTridimensional {

    public static void main(String[] args) {
        int[][][] cubo = new int[2][3][2];
        int somaPares = 0, somaImpares = 0;
        for (int i = 0; i < cubo.length; i++) {
            for (int j = 0; j < cubo[i].length; j++) {
                for (int k = 0; k < cubo[i][j].length; k++) {
                    cubo[i][j][k] = Integer.parseInt(JOptionPane.showInputDialog("Entre o valor da posição: [" + i + "]" + "[" + j + "]" + "[" + k + "]"));
                }
            }
        }
        for (int i = 0; i < cubo.length; i++) {
            for (int j = 0; j < cubo[i].length; j++) {
                for (int k = 0; k < cubo[i][j].length; k++) {
                    if (cubo[i][j][k] % 2 == 0) {
                        somaPares += cubo[i][j][k];
                    } else {
                        somaImpares += cubo[i][j][k];
                    }
                }
            }
        }
        JOptionPane.showMessageDialog(null, "Soma dos elementos pares: " + somaPares + "\nSoma dos ímpares: " + somaImpares);
    }
}
