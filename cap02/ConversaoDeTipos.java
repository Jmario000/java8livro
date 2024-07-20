/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap02;

/**
 *
 * @author brste
 */
public class ConversaoDeTipos {

    public static void main(String[] args) {
        String s1 = "10";
        int v = Integer.parseInt(s1);
        float x = Float.parseFloat(s1);
        double y = Double.parseDouble(s1);
        int w = (int) x;
        int z = (int) y;
        String s2 = String.valueOf(v);
        System.out.println(s2 + w + z);
    }

}
