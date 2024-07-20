/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap02;

import java.util.Locale;
import javax.swing.JOptionPane;

/**
 *
 * @author brste
 */
public class MediaJoption {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        String aux;
        float nota1, nota2, nota3, media;

        try {
            aux = JOptionPane.showInputDialog("Nota da prova 1: ");
            nota1 = Float.parseFloat(aux);

            aux = JOptionPane.showInputDialog("Nota da prova 2: ");
            nota2 = Float.parseFloat(aux);

            aux = JOptionPane.showInputDialog("Nota do trabalho: ");
            nota3 = Float.parseFloat(aux);

            media = (nota1 + nota2 + nota3) / 3;

            if (media >= 6.0) {
                JOptionPane.showMessageDialog(null, "Média = " + String.format("%.2f", media) + "\n" + "Aprovado!");
            } else {
                JOptionPane.showMessageDialog(null, "Média = " + String.format("%.2f", media) + "\n" + "Reprovado.");
            }
        } catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "Houve um erro na conversão, digite somente valores numéricos. " + erro.toString());
        }
        System.exit(0);
    }
}
