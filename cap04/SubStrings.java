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
public class SubStrings {

    public static void main(String[] args) {
        try {
            String frase = JOptionPane.showInputDialog(null, "Digite uma frase: ");
            JOptionPane.showMessageDialog(null, "Frase: " + frase
                    + "\n(0,2): " + frase.substring(0, 2)
                    + "\n(3,8): " + frase.substring(3, 8)
                    + "\n(9,11): " + frase.substring(9, 11)
                    + "\n(12,14): " + frase.substring(12, 14));
        } catch (StringIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
}
