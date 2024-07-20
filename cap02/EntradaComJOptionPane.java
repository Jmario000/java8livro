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
public class EntradaComJOptionPane {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        String aux;
        float largura, comprimento, area, perimetro;
        try {
            aux = JOptionPane.showInputDialog("Entre com o comprimento: ");
            comprimento = Float.parseFloat(aux);

            aux = JOptionPane.showInputDialog("Entre com a largura: ");
            largura = Float.parseFloat(aux);

            area = comprimento * largura;
            perimetro = comprimento * 2 + largura * 2;

            JOptionPane.showMessageDialog(null, "Área: " + String.format("%.2f", area) + "\n" + "Perímetro: " + String.format("%.2f", perimetro));
        } catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "Houve um erro na conversão, digite apenas valores numéricos. " + erro.toString());
        }
        System.exit(0);
    }

}
