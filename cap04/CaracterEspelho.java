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
public class CaracterEspelho {

    public static void main(String[] args) throws InterruptedException {
        String palavra = JOptionPane.showInputDialog(null, "Digite uma palavra");
        for (int i = 0; i < palavra.length(); i++) {
            System.out.print(palavra.charAt(i));
            Thread.sleep(1000);
        }
        System.out.println();
        for (int i = palavra.length() - 1; i >= 0; i--) {
            System.out.print(palavra.charAt(i));
            Thread.sleep(1000);
        }
    }
}
