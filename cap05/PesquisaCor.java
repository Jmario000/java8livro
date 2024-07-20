/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap05;

import javax.swing.JOptionPane;

/**
 *
 * @author brste
 */
public class PesquisaCor {

    public static void main(String[] args) {
        String[] vect = {"Amarelo", "Vermelho", "Verde", "Azul"};
        String aux = JOptionPane.showInputDialog("Digite um cor: ");
        String mensagem = "Cor não encontrada.";
        for (String cor : vect) {
            if (cor.equals(aux)) {
                mensagem = "Cor encontrada:";
                break;
            }
        }
        JOptionPane.showMessageDialog(null, mensagem + " " + aux);
    }
}
