/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap02;

import java.util.Locale;
import javax.swing.JOptionPane;

/**
 *
 * algoritmo que calcula o Imposto sobre a Transmissão de Bens Móveis ITBI
 */
public class ItbiJoption {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        String aux;
        float valorTransacao, valorVenal, perImposto, valorImposto;

        try {
            aux = JOptionPane.showInputDialog("Qual o valor da transação?");
            valorTransacao = Float.parseFloat(aux);

            aux = JOptionPane.showInputDialog("Qual o valor venal?");
            valorVenal = Float.parseFloat(aux);

            aux = JOptionPane.showInputDialog("Qual o percentual do imposto?");
            perImposto = Float.parseFloat(aux);

            if (valorTransacao > valorVenal) {
                valorImposto = valorTransacao * perImposto / 100;
                JOptionPane.showMessageDialog(null, "O valor do imposto a ser pago é: R$ " + String.format("%.2f", valorImposto));
            } else {
                valorImposto = valorVenal * perImposto / 100;
                JOptionPane.showMessageDialog(null, "O valor do imposto a ser pago é: R$ " + String.format("%.2f", valorImposto));
            }
        } catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "Houve um erro na conversão, utilize somente valores numéricos. " + erro.toString());
        }
        System.exit(0);
    }
}
