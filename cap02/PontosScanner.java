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
public class PontosScanner {

    public static void main(String args[]) {
        Locale.setDefault(Locale.US);
        Scanner leitor = new Scanner(System.in);
        int lider, lanterna, vitorias;

        try {
            System.out.print("Quantidade de pontos do lider: ");
            lider = leitor.nextInt();
            System.out.print("Quantidade de pontos do lanterna: ");
            lanterna = leitor.nextInt();

            vitorias = (lider - lanterna) / 3;

            System.out.printf("A quantidade de vitorias que o time lanterna tem que conseguir para alcancar ou ultrapassar o lider eh de: %d%n", vitorias);
        } catch (NumberFormatException erro) {
            System.out.println("Houve um erro no calculo, digite somente valores numericos inteiros. " + erro.toString());
        }
    }

}
