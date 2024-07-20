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
public class IfResumido {
    public static void main(String[]args){
        int c = 10, d = 8, maior;
        maior = (c > d) ? c : d;
        JOptionPane.showMessageDialog(null, "Usando um if resumido: " + maior);
    }
}
