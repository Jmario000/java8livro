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
public class LengthString {

    public static void main(String args[]) {
        String frase = JOptionPane.showInputDialog(null, "Digite uma frase: ");
        JOptionPane.showMessageDialog(null, "Frase: " + frase + "\nTamanho da frase: " + frase.length());
        System.exit(0);
    }
}
