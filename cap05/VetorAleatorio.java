/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap05;

import java.text.DecimalFormat;

/**
 *
 * @author brste
 */
public class VetorAleatorio {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat();
        int[] vect = new int[10];
        df.applyPattern("000");
        for (int i = 0; i < vect.length; i++) {
            int random = (int) (Math.random() * 999);
            vect[i] = random;
            System.out.println(df.format(vect[i]));
        }
        System.exit(0);
    }
}
