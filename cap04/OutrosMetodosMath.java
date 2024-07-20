/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap04;

import javax.swing.JOptionPane;

/**
 *
 * @author brste
 */
public class OutrosMetodosMath {

    public static void main(String[] args) {
        double a = 2.4, b = 2.8, c = 4, d = -1;
        String aux = "Arredondamento de " + a + " = " + Math.round(a)
                + "\nArredondamento de " + b + " = " + Math.round(b)
                + "\nMaior dentre " + a + " e " + b + " = " + Math.max(a, b)
                + "\nMenor dentre " + a + " e " + b + " = " + Math.min(a, b)
                + "\nQuadrado de " + c + " = " + Math.pow(c, 2)
                + "\nRaiz quadrada de " + c + " = " + Math.sqrt(c)
                + "\nValor absoluto de " + d + " = " + Math.abs(d);
        JOptionPane.showMessageDialog(null, aux);
    }
}
