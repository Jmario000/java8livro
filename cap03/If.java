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
public class If {

    public static void main(String[] args) {
        Object[] op = {"Masculino", "Feminino"};
        String resp = (String) JOptionPane.showInputDialog(null, "Selecione o sexo\n", "pesquisa", JOptionPane.QUESTION_MESSAGE, null, op, "Feminino");

        if (resp == null) {
            JOptionPane.showMessageDialog(null, "Você cancelou a pesquisa.");
        } else if ("Masculino".equals(resp)) {
            JOptionPane.showMessageDialog(null, "Você é homem.");
        } else {
            JOptionPane.showMessageDialog(null, "Você é mulher.");
        }
        System.exit(0);
    }
}
