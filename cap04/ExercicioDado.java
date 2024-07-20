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
public class ExercicioDado {

    public static void main(String[] args) {
        String sorteados = "";
        int somaDado = 0;
        for (int i = 0; i < 3; i++) {
            int dado = (int) (Math.random() * 6);
            sorteados += dado + "\n";
            somaDado += dado;
        }
        JOptionPane.showMessageDialog(null, "Números sorteados:\n" + sorteados + "Total = " + somaDado);
    }
}
