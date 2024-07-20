/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap03;

import static cap03.ExercicioDesconto.descount;
import java.awt.HeadlessException;
import java.util.Locale;
import javax.swing.JOptionPane;

/**
 *
 * @author brste
 */
public class ExercicioOpcoes {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try {
            Object n[] = {1, 2, 3, 4};
            Object aux = JOptionPane.showInputDialog(null, "Escolha uma opção: ", "Seleção de opção", JOptionPane.QUESTION_MESSAGE, null, n, n[0]);

            if ("1".equals(aux.toString())) {
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
            } else if ("2".equals(aux.toString())) {
                float menor, maior, re, r1, r2, r3, r4;
                r1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o valor da primeira resistência"));
                r2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o valor da segunda resistência"));
                r3 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o valor da terceira resistência"));
                r4 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o valor da quarta resistência"));
                re = r1 + r2 + r3 + r4;

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
            } else if ("3".equals(aux.toString())) {
                for (int i = 3; i <= 3 && i >= 0; i--) {
                    String login = JOptionPane.showInputDialog(null, "digite o login:");
                    String senha = JOptionPane.showInputDialog(null, "Digite a senha: ");
                    if ("java8".equals(login) && "java8".equals(senha)) {
                        JOptionPane.showMessageDialog(null, "Login e senha aceitos");
                        System.exit(0);
                    } else {
                        JOptionPane.showMessageDialog(null, "Falha, verifique login e senha\nVocê tem mais " + i + " tentativa(s)!");
                    }
                }
            } else {
                int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número: "));
                StringBuilder sb = new StringBuilder();
                for (int i = 1; i <= 10; i++) {
                    sb.append(num).append(" x ").append(i).append(" = ").append(num * i).append("\n");
                }
                JOptionPane.showMessageDialog(null, sb.toString());
            }

        } catch (HeadlessException | IllegalArgumentException e) {
            JOptionPane.showConfirmDialog(null, e.toString());
        }
    }
}
