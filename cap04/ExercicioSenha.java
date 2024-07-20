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
public class ExercicioSenha {

    public static void main(String[] args) {
        int randomValue = (int) (5 + ((10 - 5 + 1) * Math.random()));
        String aux = "";
        for (int i = 0; i < randomValue; i++) {
            int senha = (int) (Math.random() * 9);
            aux += senha;
        }
        JOptionPane.showMessageDialog(null, "Número sorteado: " + randomValue + "\nSenha gerada: " + aux);
    }

}
