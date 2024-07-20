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
public class GetMessageEPrintStackTrace {
    public static void main(String[]args){
        int x = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
        try{
            int y = x/0; //exceção
        }catch(Exception erro){
            JOptionPane.showMessageDialog(null,erro.getMessage());
            erro.printStackTrace();
        }
    }
}
