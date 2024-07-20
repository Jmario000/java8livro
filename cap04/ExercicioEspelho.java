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
public class ExercicioEspelho {

    public static void main(String[] args) {
        String aux = JOptionPane.showInputDialog(null, "Digite uma frase: ");
        StringBuilder sb = new StringBuilder("Frase Fornecida : ").append(aux).append("\n").append("Frase de trás pra frente: ");
        for (int i = aux.length() - 1; i >= 0; i--) {
            char c = aux.charAt(i);
            if (!Character.isWhitespace(c)) {
                sb.append(c);
            }
        }
        JOptionPane.showMessageDialog(null, sb);
    }
}
