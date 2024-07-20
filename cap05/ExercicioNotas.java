/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap05;

import java.util.Arrays;
import java.util.Locale;
import javax.swing.JOptionPane;

/**
 *
 * @author brste
 */
public class ExercicioNotas {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        StringBuilder sb = new StringBuilder();
        double[] notas = new double[5];
        double sum = 0, avg;
        for (int i = 0; i < notas.length; i++) {
            notas[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota n° " + (i + 1)));
            sum += notas[i];
        }
        avg = sum / notas.length;
        Arrays.sort(notas);
        sb.append("Notas em ordem decrescente: ");
        for (int i = notas.length - 1; i >= 0; i--) {
            sb.append(notas[i]).append(" ");
        }
        sb.append("\nMédia: ").append(String.format("%.2f", avg));
        JOptionPane.showMessageDialog(null, sb);
    }
}
