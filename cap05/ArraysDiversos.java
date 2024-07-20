/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap05;

import java.util.Arrays;

/**
 *
 * @author brste
 */
public class ArraysDiversos {

    public static void main(String[] args) {
        String nomes[] = {"Willian", "Anna", "Nakamura", "Aveiro"};
        char vogais[] = {'a', 'e', 'i', 'o', 'u'};
        long numeros[] = {10, 9, 8, 7, 6};
        float notas[] = {9.87f, 7.65f, 5.43f, 5.45f};

        Arrays.sort(nomes);
        System.out.print("Nomes: ");
        for (String aux : nomes) {
            System.out.print(aux + " ");
        }
        System.out.print("\nVogais: ");
        Arrays.sort(vogais);
        for (char aux : vogais) {
            System.out.print(aux + " ");
        }
        System.out.print("\nNumeros: ");
        Arrays.sort(numeros);
        for (long num : numeros) {
            System.out.print(num + " ");
        }
        System.out.print("\nNotas: ");
        Arrays.sort(notas);
        for (float aux : notas) {
            System.out.print(aux + " ");
        }
    }
}
