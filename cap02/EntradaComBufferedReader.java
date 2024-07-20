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
public class EntradaComBufferedReader {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        BufferedReader dado = new BufferedReader(new InputStreamReader(System.in));
        String s;
        float largura, comprimento, area, perimetro;

        try {
            System.out.println("Entre com o comprimento: ");
            s = dado.readLine();
            comprimento = Float.parseFloat(s);

            System.out.println("Entre com a largura; ");
            s = dado.readLine();
            largura = Float.parseFloat(s);

            area = comprimento * largura;
            perimetro = comprimento * 2 + largura * 2;

            System.out.printf("Area do retactangle: %.2f%nPerimetro do rectangle: %.2f%n", area, perimetro);

        } catch (IOException erro) {
            System.out.println("Houve um erro na entrada de dados. " + erro.toString());
        } catch (NumberFormatException erro) {
            System.out.println("Houve um erro na conversão, digite apenas valores numéricos. " + erro.toString());
        }
    }

}
