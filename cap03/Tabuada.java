/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap03;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 *
 * @author brste
 */
public class Tabuada {

    public static void main(String args[]) {
        try {
            int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número: "));
            StringBuilder sb = new StringBuilder();
            for (int i = 1; i <= 10; i++) {
                sb.append(n).append(" x ").append(i).append(" = ").append(n * i).append("\n");
            }
            JOptionPane.showMessageDialog(null, sb.toString());
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
}
