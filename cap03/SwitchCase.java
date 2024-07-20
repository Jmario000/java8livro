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
public class SwitchCase {

    public static void main(String[] args) {
        String mes = JOptionPane.showInputDialog(null, "Forneça o número do mês: ");
        if (mes != null) {
            switch (mes) {
                case "1":
                    mes = "Janeiro";
                    break;
                case "2":
                    mes = "Fevereiro"; break;
                case "3":
                    mes = "Março"; break;
                default:
                    JOptionPane.showMessageDialog(null, "Mês desconhecido.");
            }
            JOptionPane.showMessageDialog(null, mes);
        }
        System.exit(0);
    }

}
