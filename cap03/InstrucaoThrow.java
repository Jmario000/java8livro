/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap03;

import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author brste
 */
public class InstrucaoThrow {

    public static void main(String args[]) throws IOException {
        try {
            int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Forneça a sua idade: "));
            if (idade < 18) {
                throw new Exception("Menor de idade, entrada não permitida!");
            } else {
                JOptionPane.showMessageDialog(null, "Idade válida, seja bem-vindo!");
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, erro.toString());
        }
    }
}
