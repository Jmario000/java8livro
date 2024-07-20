/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap03;

import javax.swing.JOptionPane;

/**
 *
 * @author brste
 */
public class TryCatch {

    public static void main(String[] args) {
        try {
            Float num1 = Float.valueOf(JOptionPane.showInputDialog(null, "Digite o primeiro número: "));
            Float num2 = Float.valueOf(JOptionPane.showInputDialog(null, "Digite o segundo número: "));
            JOptionPane.showMessageDialog(null, "Soma = " + (num1 + num2));
            JOptionPane.showMessageDialog(null, "Subtração = " + (num1 - num2));
            JOptionPane.showMessageDialog(null, "Multiplicação = " + (num1 * num2));
            JOptionPane.showMessageDialog(null, "Divisão = " + (num1 / num2));
            //utilização do caractere pipe "|" significando OU uma exceção OU a outra
        } catch (ArithmeticException | NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "Erro de divisão por zero!\n" + erro.toString(), "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (NullPointerException err) {
            JOptionPane.showMessageDialog(null, "Tecla cancel pressionada!\n" + err.toString(), "Cancelado pelo usuário", JOptionPane.ERROR_MESSAGE);
        } finally {
            JOptionPane.showMessageDialog(null, "Final da execução.");
        }
        System.exit(0);
    }
}
