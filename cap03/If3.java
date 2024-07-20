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
public class If3 {

    public static void main(String args[]) {
        String aux = JOptionPane.showInputDialog("Forneça o número do mes");
        if (aux != null) {
            try {
                int mes = Integer.parseInt(aux);
                if(mes >= 1 && mes<=3 ){
                    JOptionPane.showMessageDialog(null, "Primeiro trimestre.");
                }else if(mes <=6){
                    JOptionPane.showMessageDialog(null, "Segundo trimestre");
                }else if(mes <=9){
                    JOptionPane.showMessageDialog(null, "Terceiro trimestre");
                }else if(mes <=12){
                    JOptionPane.showMessageDialog(null, "Quarto trimestre");
                }else{
                    JOptionPane.showMessageDialog(null, "Mês desconhecido");
                }
            }catch(NumberFormatException erro){
                JOptionPane.showMessageDialog(null,"Digite apenas valores numéricos inteiros. " + erro.toString());
            }

        }
        System.exit(0);
    }
}
