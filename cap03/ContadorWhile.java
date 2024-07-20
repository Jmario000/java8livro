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
public class ContadorWhile {

    public static void main(String args[]) {
        try {
            int limite = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um limite para o contador: "));
            int contador = limite;
            while (contador >= 0) {
                System.out.print(contador + " ");
                contador--;
            }
            System.out.println("\nFim do contador regressivo.");
            contador = 0;
            do {
                System.out.print(contador + " ");
                contador++;
            } while (contador <= limite);
            System.out.println("\nFim do contador progressivo.");
        } catch (NumberFormatException erro) {
            System.out.print("Forneca um numero inteiro valido! " + erro.toString());
        }
    }
}
