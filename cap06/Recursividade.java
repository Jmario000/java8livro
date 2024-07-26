/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap06;

/**
 *
 * @author jmario
 */
public class Recursividade {

    public static void main(String[] args) {
        for (long i = 0; i <= 10; i++) {
            System.out.println(i + "! = " + calcularFatorial(i));
        }
    }

    protected static long calcularFatorial(long num) {
        if (num <= 1) {
            return 1;
        } else {
            return (num * (calcularFatorial(num - 1)));
        }
    }
}
