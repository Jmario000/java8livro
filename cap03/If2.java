/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap03;

import javax.swing.JOptionPane;

/**
 *
 * @author brste
 */
public class If2 {

    public static void main(String[] args) {
        String aux = JOptionPane.showInputDialog(null, "Forneça o número do mês: ");
        if (aux != null) {
            try {
                int mes = Integer.parseInt(aux);
                if (mes >= 1 && mes <= 12) {
                    JOptionPane.showMessageDialog(null, "Número do mês é válido!\n" + mes);
                } else {
                    JOptionPane.showMessageDialog(null, "Número do mês inválido!\n" + mes);
                }
            } catch (NumberFormatException erro) {
                JOptionPane.showMessageDialog(null, "Digite apena valores numéricos inteiros. " + erro.toString());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Operação cancelada.");
        }
        System.exit(0);
    }
}
