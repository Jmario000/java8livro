/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap04;

import java.text.DecimalFormat;

/**
 *
 * @author brste
 */
public class FormatacaoDeNumeros {
    public static void main(String args[]){
        DecimalFormat df = new DecimalFormat();
        short idade = 38;
        df.applyPattern("000");
        System.out.println(df.format(idade));
        int qntd = 9750;
        df.applyPattern("#0,000");
        System.out.println(df.format(qntd));
        long estoque = 198754;
        df.applyPattern("#,##0,000");
        System.out.println(df.format(estoque));
        float altura = 1.74f;
        df.applyPattern("#0.00");
        System.out.println(df.format(altura));
        double peso = 70.25;
        df.applyPattern("#0.00");
        System.out.println(df.format(peso));
        String valor = "2584.75";
        df.applyPattern("R$ #,##0.00");
        System.out.println(df.format(Double.parseDouble(valor)));
        
    }
    
}
