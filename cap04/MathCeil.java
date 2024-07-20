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
public class MathCeil {

    public static void main(String args[]) {
        final float LOTACAO_ONIBUS = 50;
        int numPassageiros = Integer.parseInt(JOptionPane.showInputDialog("Número de passageiros: "));
        float qtndOnibus = numPassageiros / LOTACAO_ONIBUS;
        JOptionPane.showMessageDialog(null, "Quantidade de passageiros: " + numPassageiros + "\nQuantidade calculada: " + qtndOnibus
                + "\nQuantidade de ônibus necessários: " + (int) Math.ceil(qtndOnibus));
    }
}
