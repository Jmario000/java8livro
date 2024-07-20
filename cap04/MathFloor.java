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
public class MathFloor {

    public static void main(String[] args) {
        float nota = Float.parseFloat(JOptionPane.showInputDialog("Qual a nota?"));
        JOptionPane.showMessageDialog(null, "Nota original " + nota + "\nNota arredondada para baixo: " + Math.floor(nota));
    }
}
