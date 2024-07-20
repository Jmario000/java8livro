/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap03;

import java.util.Locale;
import javax.swing.JOptionPane;

/**
 *
 * @author brste
 */
public class ExercicioResistencia {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        float menor, maior, re, r1, r2, r3, r4;
        r1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o valor da primeira resistência"));
        r2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o valor da segunda resistência"));
        r3 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o valor da terceira resistência"));
        r4 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o valor da quarta resistência"));
        re = r1 + r2 + r3 + r4;

        try {
            if (r1 > r2 && r1 > r3 && r1 > r4) {
                maior = r1;
            } else if (r2 > r3 && r2 > r4) {
                maior = r2;
            } else if (r3 > r4) {
                maior = r3;
            } else {
                maior = r4;
            }
            if (r1 < r2 && r1 < r3 && r1 < r4) {
                menor = r1;
            } else if (r2 < r3 && r2 < r4) {
                menor = r2;
            } else if (r3 < r4) {
                menor = r3;
            } else {
                menor = r4;
            }
            JOptionPane.showMessageDialog(null, "Resistência equivalente: " + re + "\nMaior resistência: " + maior + "\nMenor resistência: " + menor);
        } catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, erro.toString());
        }
    }
}
