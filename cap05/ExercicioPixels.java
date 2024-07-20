/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap05;

/**
 *
 * @author brste
 */
public class ExercicioPixels {

    public static void main(String[] args) {
        int[][] pixels = new int[40][40];

        for (int i = 0; i < pixels.length; i++) {
            for (int j = 0; j < pixels[i].length; j++) {
                pixels[i][j] = (int) (Math.random() * 255);
            }
        }
        for (int i = 0; i < pixels.length; i++) {
            for (int j = 0; j < pixels[i].length; j++) {
                System.out.print("[" + pixels[i][j] + "]" + " ");
            }
            System.out.println();
        }
    }
}
