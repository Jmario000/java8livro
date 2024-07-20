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
public class ExercicioFarmacia {

    public static void main(String[] args) {
        float valorP = 0f;
        final int PORCENTAGEM = 12;
        do {
            valorP = Float.parseFloat(JOptionPane.showInputDialog(null, "Qual o valor do produto?"));
            if (valorP != 0f) {
                float valorAcrescido = ((valorP * PORCENTAGEM) / 100) + valorP;
                JOptionPane.showMessageDialog(null, "Valor com acrescimo: R$ " + String.format("%.2f", valorAcrescido) + "\nValor arredondado: R$ "
                        + Math.round(valorAcrescido));
            } else {
                System.exit(0);
            }
        } while (valorP != 0);
    }
}
