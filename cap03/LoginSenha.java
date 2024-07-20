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
public class LoginSenha {

    public static void main(String[] args) {
        try {
            for (int i = 3; i <= 3 && i >= 0; i--) {
                String login = JOptionPane.showInputDialog(null, "digite o login:");
                String senha = JOptionPane.showInputDialog(null, "Digite a senha: ");
                if ("java8".equals(login) && "java8".equals(senha)) {
                    JOptionPane.showMessageDialog(null, "Login e senha aceitos");
                    System.exit(0);
                } else {
                    JOptionPane.showMessageDialog(null, "Falha, verifique login e senha\nVocê tem mais " + i + " tentativa(s)!");
                }
            }
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        System.exit(0);
    }
}
