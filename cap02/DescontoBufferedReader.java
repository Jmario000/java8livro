/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap02;

import java.io.*;
import java.util.Locale;

/**
 *
 * @author brste
 */
public class DescontoBufferedReader {
    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        BufferedReader dado = new BufferedReader(new InputStreamReader(System.in));
        String aux;
        float valorProduto, descontoPer, valorDesconto, total;
        
        try{
            System.out.print("Quanto custa o produto? ");
            aux = dado.readLine();
            valorProduto = Float.parseFloat(aux);
            
            System.out.print("Qual o valor de desconto(%)? ");
            aux = dado.readLine();
            descontoPer = Float.parseFloat(aux);
            
            valorDesconto = valorProduto * descontoPer / 100;
            total = valorProduto - valorDesconto;
            
            System.out.printf("Valor do desconto: R$ %.2f%nValor do produto com desconto: R$ %.2f%n", valorDesconto, total);
        } catch(IOException erro){
            System.out.println("Houve um erro com a entra de dados. Tente novamente. " + erro.toString());
        } catch(NumberFormatException erro){
            System.out.println("Houve um erro na conversao, utilize somente valores numericos. " + erro.toString());
        }
    }
    
}
