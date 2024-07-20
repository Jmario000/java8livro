/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap03;

import java.io.*;
import javax.swing.JOptionPane;

/**
 *
 * @author brste
 */
public class UsoDoThrows {

    public static void main(String[] args) throws IOException {
        String frase = JOptionPane.showInputDialog("Digite uma frase: ");
        try {
            FileWriter file = new FileWriter("c:/temp/frases.txt", true);
            PrintWriter out = new PrintWriter(file);
            out.println(frase);
            file.close();
            out.close();
            JOptionPane.showMessageDialog(null, "Frase armazenada no arquivo!");
        } catch (FileNotFoundException erro) {
            JOptionPane.showMessageDialog(null, "Verifique se a pasta c:/temp existe!\n" + erro.toString());
        }
    }
}
