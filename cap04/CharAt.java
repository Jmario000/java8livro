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
public class CharAt {
    
    public static void main(String[] args) {
        String aux = JOptionPane.showInputDialog(null, "Digite uma frase: ");
        StringBuilder sb = new StringBuilder("Palavra: ").append(aux).append("\n");
        for (int i = 0; i < aux.length(); i++) {
            sb.append("Caractere ").append(i + 1).append(": ").append(aux.charAt(i)).append("\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString());
        System.exit(0);
    }
}
