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
public class ExercicioS {
    
    public static void main(String[] args) {
        String aux = JOptionPane.showInputDialog(null, "Digite uma frase: ");
        if (aux.toLowerCase().contains("sexo") || aux.toLowerCase().contains("sexual")) {
            JOptionPane.showMessageDialog(null, "Conteúdo Improprio.");
        } else {
            JOptionPane.showMessageDialog(null, "Contúdo liberado!");
        }
    }
}
