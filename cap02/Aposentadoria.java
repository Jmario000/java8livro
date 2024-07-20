/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap02;

import javax.swing.JOptionPane;

/**
 *
 * @author brste
 */
public class Aposentadoria {

    public static void main(String args[]) {
        String aux;
        int idade, anosCont;
        char sexo;

        try {
            aux = JOptionPane.showInputDialog("Qual a sua idade? ");
            idade = Integer.parseInt(aux);

            aux = JOptionPane.showInputDialog("Qual seu sexo (m/f)?");
            sexo = aux.charAt(0);

            aux = JOptionPane.showInputDialog("Quanto anos de contribuição? ");
            anosCont = Integer.parseInt(aux);

            if (sexo == 'f' && idade >= 60 || anosCont >= 30) {
                JOptionPane.showMessageDialog(null, "Você tem o direito a aposentadoria.");
            } else if (sexo == 'm' && idade >= 65 || anosCont >= 35) {
                JOptionPane.showMessageDialog(null, "Você tem o direito a aposentadoria.");
            } else if (sexo == 'f' && anosCont < 30) {
                JOptionPane.showMessageDialog(null, "Faltam " + (30 - anosCont) + " anos para poder se aposentar.");
            } else if (sexo == 'm' && anosCont < 35) {
                JOptionPane.showMessageDialog(null, "Faltam " + (35 - anosCont) + " anos para poder se aposentar.");
            }
        } catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "Houve um erro na conversão, utilize somente valores numéricos. " + erro.toString());
        }
    }

}
