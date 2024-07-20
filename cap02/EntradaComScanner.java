/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap02;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author brste
 */
public class EntradaComScanner {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);
        float largura, comprimento, area, perimetro;
        try {
            System.out.println("Entre com o comprimento: ");
            comprimento = leitor.nextFloat();

            System.out.println("Entre com a largura: ");
            largura = leitor.nextFloat();

            area = comprimento * largura;
            perimetro = comprimento * 2 + largura * 2;

            System.out.printf("Area do rectangle: %.2f%nPerimetro do rectangle: %.2f%n", area, perimetro);
        } catch (NumberFormatException erro) {
            System.out.println("Houve um erro na conversão, digite somente valores numericos. " + erro.toString());
        }
        leitor.close();
    }
}
