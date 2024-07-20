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
public class ExercicioDesconto {

    public static void main(String args[]) {
        Locale.setDefault(Locale.US);
        try {
            String nome = JOptionPane.showInputDialog(null, "Digite o nome do produto: ");
            float total, valor = Float.valueOf(JOptionPane.showInputDialog(null, "Qual o valor do produto? "));
            if (0 >= valor) {
                throw new IllegalArgumentException("Digite um número maior que zero.");
            } else if (valor >= 50 && valor < 200) {
                total = descount(valor, 5.0f);
            } else if (valor >= 200 && valor < 500) {
                total = descount(valor, 6.0f);
            } else if (valor >= 500 && valor < 1000) {
                total = descount(valor, 7.0f);
            } else if (valor > 1000) {
                total = descount(valor, 8.0f);
            } else {
                total = valor;
            }
            JOptionPane.showMessageDialog(null, "Nome do produto: " + nome + "\nValor inicial: R$ "
                    + String.format("%.2f", valor) + "\nValor com desconto: R$ " + String.format("%.2f", total));
        } catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "Digite somente valores numéricos", "erro", JOptionPane.ERROR_MESSAGE);
        } catch (IllegalArgumentException erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage(), "erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static float descount(float valorProduto, float valorPer) {
        float valorDesconto = valorProduto * valorPer / 100;
        return valorProduto - valorDesconto;
    }

}
